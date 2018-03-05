package com.zhang.jiwei.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.zhang.jiwei.dao.AccountDao;
import com.zhang.jiwei.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/**
 * @author jiwei.zhang
 * @DATE 2018-03-05 下午 15:32
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Account account) {
        return jdbcTemplate.update("insert into ceshi3(name,contact,telephone,email,remark) values(?,?,?,?,?)",
                account.getName(), account.getContact(), account.getTelephone(),
                account.getEmail(), account.getRemark());
    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update("update ceshi3 set email=? where id=?",
                account.getEmail(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("delete from ceshi3 where id=?", id);
    }

    @Override
    public Account findAccountById(int id) {
        return jdbcTemplate.query("select * from ceshi3 where id=?",
                new Object[]{id}, new ResultSetExtractor<Account>() {
                    @Override
                    public Account extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                        if (resultSet.next()) {
                            Account account = new Account();
                            account.setId(resultSet.getInt("id"));
                            account.setName(resultSet.getString("name"));
                            account.setContact(resultSet.getString("contact"));
                            account.setEmail(resultSet.getString("email"));
                            account.setTelephone(resultSet.getString("telephone"));
                            account.setRemark(resultSet.getString("remark"));
                            return account;
                        }
                        return null;
                    }
                });
    }

    @Override
    public List<Account> findAccountList() {
        return jdbcTemplate.query("select * from ceshi3", new Object[]{},
                new BeanPropertyRowMapper<>(Account.class));
    }
}
