package com.itheima.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DataSourceUtils {
    private static DataSource dataSource;
    //加载类以及一系列相关配置 prop文件路径先找到，再使用工厂根据prop的配置生产一个连接池
    static {
        try {
            Properties prop = new Properties();
            prop.load(DataSourceUtils.class.getResourceAsStream("/druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
    //直接拿连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close(Connection conn, Statement st, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (st!=null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
