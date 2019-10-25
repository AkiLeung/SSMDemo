package com.ssm.core.controller;

import com.ssm.common.consts.UrlPathConsts;
import com.ssm.core.base.BaseController;
import com.ssm.core.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Joseph.L
 * @date 2019-09-03
 * @description 用户登录
 */
@RestController
public class UserLoginController extends BaseController {

    /**
     * 日志对象
     */
    private Logger logger = LogManager.getLogger(UserLoginController.class);

    /**
     * 登录验证
     */
    @RequestMapping(value = "welcome.action")
    public ModelAndView systemLogin(HttpServletRequest request) {
        modelAndView = new ModelAndView();
        //獲取登錄頁面信息：用戶工號和密碼
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();

        //當Session不為空的時候自動登錄
        User user = (User) session.getAttribute("user");
        if (user != null) {
            logger.info("User: " + user.getUserName() + " login System");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_FRAME_SHOW_PAGE);
            return modelAndView;
        }

        // 登录后存放进 shiro token
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            //需要开始调用到Realm中
            subject.login(token);
            //使用subject调用securityManager,安全管理器调用Realm
            user = (User) subject.getPrincipal();
            //使用Session记录当前用户信息，方便其他使用
            session.setAttribute("user", user);
            logger.info("User: " + user.getUserName() + " login System");
            modelAndView.addObject("login", "true");
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_FRAME_SHOW_PAGE);
        } catch (UnknownAccountException ex) {
            logger.error(this.getClass().getName() + "-UnknownAccountException:" + ex.toString());
            modelAndView.addObject("login", "false");
            modelAndView.setViewName(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
        } catch (IncorrectCredentialsException ex) {
            logger.error(this.getClass().getName() + "-IncorrectCredentialsException:" + ex.toString());
            modelAndView.addObject("login", "false");
            modelAndView.setViewName(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
        }
        return modelAndView;
    }

    /**
     * 注销登录
     */
    @RequestMapping("logout.action")
    public ModelAndView logout() {
        try {
            //获取当前用户
            Subject subject = SecurityUtils.getSubject();
            if (subject != null && subject.isAuthenticated()) {
                subject.logout();
            }
            return new ModelAndView(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
        } catch (Exception ex) {
            logger.error(this.getClass().getName() + "-logout:" + ex.toString());
        }
        return new ModelAndView(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
    }

    /**
     * 功能说明：登錄頁面
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequestMapping(value = "login.action")
    public ModelAndView login() {
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        //當Session不為空的時候自動登錄
        User user = (User) session.getAttribute("user");
        if (user != null && !user.getUserCode().equals("")) {
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_FRAME_SHOW_PAGE);
            return modelAndView;
        }
        return new ModelAndView(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
    }

    /**
     * 功能说明：无权限
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequestMapping(value = "unAuthor.action")
    public ModelAndView unAuthor() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName(UrlPathConsts.STR_COMMON_NOAUTHOR_PAGE);
        } catch (Exception ex) {
            logger.error(this.getClass().getName() + "-unAuthor:" + ex.toString());
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }
}
