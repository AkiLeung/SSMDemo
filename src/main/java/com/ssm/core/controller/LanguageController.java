package com.ssm.core.controller;

import com.ssm.common.consts.UrlPathConsts;
import com.ssm.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Joseph.L
 * @date 2019-04-27
 * @description login
 */
@RestController
public class LanguageController extends BaseController {

    /**
     * 视图模型
     */
    private ModelAndView modelAndView = super.modelAndView;

    @Autowired
    private LocaleResolver localeResolver;

    @RequestMapping("{code}.action")
    public ModelAndView changeLanguage(@PathVariable("code") String code, HttpServletResponse response, HttpServletRequest request) {
        Locale locale = null;
        if("zh".equals(code)) {
            locale = new Locale(code, "CN");
        }
        if("en".equals(code)) {
            locale = new Locale(code, "US");
        }
        localeResolver.setLocale(request, response, locale);
        modelAndView = new ModelAndView();
        modelAndView.setViewName(UrlPathConsts.STR_SYSTEM_LOGIN_PAGE);
        return modelAndView;
    }

}
