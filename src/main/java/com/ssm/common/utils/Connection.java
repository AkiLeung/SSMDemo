package com.ssm.common.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * @author Joseph.L
 * @date
 * @description
 */
public class Connection {

    /**
     * Druid数据源
     */
    private DruidDataSource dataSource;

    /**
     * 连接对象
     */
    private static Connection connection;

    /**
     * 获取连接
     */
    public java.sql.Connection getConnection() throws SQLException {
        Properties result = new Properties();
        ResourceBundle bundle = ResourceBundle.getBundle("dbConfig");

        result.put("driverClassName", bundle.getString("connection.driverClassName"));
        result.put("url", bundle.getString("connection.url"));
        result.put("username", bundle.getString("connection.username"));
        result.put("password", bundle.getString("connection.password"));
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(result);
        } catch (Exception e) {
        }
        return dataSource.getConnection();
    }

    /**
     * 返回连接对象
     */
    public static java.sql.Connection getDataSourceConnection() throws SQLException {
        if (connection == null) {
            connection = new Connection();
        }
        return connection.getConnection();
    }
}
