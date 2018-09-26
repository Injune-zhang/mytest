package com.itheima.dao;

import com.itheima.entity.User;
import com.itheima.utils.DataSourceUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    public UserDao() {
    }

    //访问数据库，是否存在该对象
    public User login(String name, String password) {
        try {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtils.getDataSource());
            String sql = "select * from user where name = ? and password = ?";
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), name, password);
            return  user;
        } catch (Exception e) {
//            e.printStackTrace();
            return null;
        }
    }
}
