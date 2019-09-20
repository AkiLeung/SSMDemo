package com.ssm.common.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Joseph.L
 * @date 2019-09-03
 * @description
 */
public class LogUtils {

    /**
     * 保存日志
     */
    public static void saveLog(HttpServletRequest request, String title) {
        System.out.println("LogUtils：记录日志：--- " + title);
    }

}
