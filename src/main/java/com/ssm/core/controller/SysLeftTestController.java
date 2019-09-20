package com.ssm.core.controller;

import com.ssm.common.consts.AuthCodeConst;
import com.ssm.common.consts.UrlPathConsts;
import com.ssm.core.base.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Joseph.L
 * @date 2019-09-11
 * @description
 */
@RestController
@RequestMapping(value = "sysTest")
public class SysLeftTestController  extends BaseController {

    /**
     * 视图模型
     */
    private ModelAndView modelAndView = super.modelAndView;


    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST01})
    @RequestMapping(value = "test01.action")
    public ModelAndView test01() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test01.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE01);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }

    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST02})
    @RequestMapping(value = "test02.action")
    public ModelAndView test02() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test02.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE02);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }

    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST03})
    @RequestMapping(value = "test03.action")
    public ModelAndView test03() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test03.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE03);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }


    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST04})
    @RequestMapping(value = "test04.action")
    public ModelAndView test04() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test04.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE04);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }


    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST05})
    @RequestMapping(value = "test05.action")
    public ModelAndView test05() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test05.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE05);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }


    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST06})
    @RequestMapping(value = "test06.action")
    public ModelAndView test06() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test06.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE06);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }

    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequiresPermissions(value = {AuthCodeConst.SYS_CONFIG_TEST + AuthCodeConst.SYS_AUTH_TEST07})
    @RequestMapping(value = "test07.action")
    public ModelAndView test07() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test07.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE07);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }

    /**
     * 功能说明：测试页面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequestMapping(value = "test08.action")
    public ModelAndView test08() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("showMessage", "test08.action");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_TEST_SHOW_PAGE07);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }
}
