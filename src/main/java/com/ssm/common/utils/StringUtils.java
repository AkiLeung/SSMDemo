package com.ssm.common.utils;

/**
 * @author Joseph.L
 * @date 2019-09-03
 * @description
 */
public class StringUtils {

    /**
     * 判断是否是空字符串 null和"" 都返回 true
     *
     * @param s
     * @return
     * @author Robin Chang
     */
    public static boolean isEmpty(String s) {
        if (s != null && !s.equals("")) {
            return false;
        }
        return true;
    }

}
