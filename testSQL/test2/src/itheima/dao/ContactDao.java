package itheima.dao;

import itheima.entity.Contact;
import itheima.utils.DataSourceUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class ContactDao {
    public ContactDao() {
    }

    //判断数据库库中是否存在输入的用户
    public boolean isExits(String name) {
        try {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtils.getDataSource());
            String sql = "select * from contact where name = ?";
            Contact contact = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Contact.class), name);
            return contact!=null;
        } catch (DataAccessException e) {
            return false;
        }
    }


    //向服务层发送查询得到的list
    public List<Contact> findMyContact(String name) {
        try {
            JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceUtils.getDataSource());
            String sql = "select * from contact c1 , contact c2 WHERE c1.user_id = c2.id AND c1.name = ?";
            List<Contact> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Contact.class), name);
            return list;
        } catch (DataAccessException e) {
//            e.printStackTrace();
            return null;
        }
    }
}
