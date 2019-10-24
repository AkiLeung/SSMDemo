package com.ssm.common.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;

/**
 * @author Joseph.L
 * @date
 * @description
 */
public class ConnectionFactory {

    /**
     * Druid数据源
     */
    private DruidDataSource dataSource;

    private static ConnectionFactory connectionFactory;

    public Connection getConnection() throws SQLException {
        String className = "com.mysql.cj.jdbc.Driver";
        String connUrl = "jdbc:mysql://localhost:3306/dbtest?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "123123123";
        Properties result = new Properties();
        result.put("driverClassName", className);
        result.put("url", connUrl);
        result.put("username", username);
        result.put("password", password);

        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(result);
        } catch (Exception e) {

        }
        return dataSource.getConnection();
    }

    public static Connection getDataSourceConnection() throws SQLException {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory.getConnection();
    }
}
