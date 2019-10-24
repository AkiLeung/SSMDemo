package com.test;

import com.ssm.common.utils.Connection;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import java.sql.SQLException;

/**
 * @author Joseph.L
 * @date
 * @description
 */
public class TestClass01 {

    private static Log logger = LogFactory.getLog(TestClass01.class);

    @Test
    public void test01() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");
    }

    Connection connection = new Connection();

    @Test
    public void test02() throws SQLException {
        java.sql.Connection connection = this.connection.getConnection();
        if(connection==null){
            System.out.println("空");
        }else{
            System.out.println("非空");
        }
    }
}
