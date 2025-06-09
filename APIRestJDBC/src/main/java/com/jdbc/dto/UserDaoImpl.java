package com.jdbc.dto;

import com.jdbc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoImpl implements UserDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public ResponseEntity <User> createUser(User user) {
        jdbcTemplate.update("INSERT INTO `user` (id, firstName, lastName, email, address) VALUES (?,?,?,?,?)",
                new Object[] { user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                        user.getAddress() });
        return null;
    }

    @Override
    public User getUserById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                return user;
            }
        }, id);
    }

    @Override
    public void updateUser(User user) {
        String sql = "UPDATE user SET firstName = ?, lastName = ?, email = ?, address = ? WHERE id= ?";
        jdbcTemplate.update(sql, new Object[] { user.getFirstName(),
                user.getLastName(), user.getEmail(), user.getAddress(), user.getId() });
    }

    @Override
    public void deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id = ?";
        jdbcTemplate.update(sql, new Object[] { id });
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<User>>() {
            @Override
            public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<User> list = new ArrayList<>();
                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt(1));
                    user.setFirstName(rs.getString(2));
                    user.setLastName(rs.getString(3));
                    user.setEmail(rs.getString(4));
                    user.setAddress(rs.getString(5));
                    list.add(user);
                }
                return list;
            }
        });
    }
}
