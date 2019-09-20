package com.ssm.common.consts;

/**
 * 功能说明：用於記錄所有系統網頁路徑實現後台跳轉，同時避免前台暴露網頁文件
 * 修改说明：
 *
 * @author Joseph
 * @version V1.0
 * @date 20181108 上午11:47:54
 */
public class UrlPathConsts {

    /**
     * 前缀
     */
    public final static String STR_SERVER_PATH = "/WEB-INF/webPage";
    /**
     * 登錄主框架-登录面
     */
    public final static String STR_SYSTEM_LOGIN_PAGE = "loginWeb.jsp";

    /**
     * 系统默认主页
     */
    public final static String STR_MAIN_FRAME_SHOW_PAGE = STR_SERVER_PATH + "/mainFrame/defaultWeb.jsp";
    public final static String STR_MAIN_LEFT_MENU_PAGE = STR_SERVER_PATH + "/mainFrame/leftMenu.jsp";
    public final static String STR_MAIN_CENTER_AREA_PAGE = STR_SERVER_PATH + "/mainFrame/mainShow.jsp";

    /**
     * 系统默认测试
     */
    public final static String STR_MAIN_TEST_SHOW_PAGE01 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE02 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE03 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE04 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE05 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE06 = STR_SERVER_PATH + "/test/test01.jsp";
    public final static String STR_MAIN_TEST_SHOW_PAGE07 = STR_SERVER_PATH + "/test/test01.jsp";

    public final static String STR_COMMON_NOAUTHOR_PAGE = STR_SERVER_PATH + "/common/noAuthor.jsp";
    public final static String STR_ERROR_ERROR_PAGE = STR_SERVER_PATH + "/error/error.jsp";
}
