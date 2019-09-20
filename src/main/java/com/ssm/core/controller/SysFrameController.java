package com.ssm.core.controller;

import com.ssm.common.consts.UrlPathConsts;
import com.ssm.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 功能說明: 主页面映射路径
 * @Author By Joseph
 * @Date:20181108
 */
@RestController
@RequestMapping(value = "sysFrame")
public class SysFrameController extends BaseController {

    /**
     * 视图模型
     */
    private ModelAndView modelAndView = super.modelAndView;

    /**
     * 功能说明：系统框架-左菜单
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequestMapping(value = "leftMenu.action")
    public ModelAndView leftMenu() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_LEFT_MENU_PAGE);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }

    /**
     * 功能说明：系统框架-工作台
     * 修改说明：
     *
     * @return ModelAndView 頁面跳轉
     * @author Joseph
     * @date 20181108
     */
    @RequestMapping(value = "mainShow.action")
    public ModelAndView mainShow() {
        modelAndView = new ModelAndView();
        try {
            modelAndView.setViewName(UrlPathConsts.STR_MAIN_CENTER_AREA_PAGE);
        } catch (Exception ex) {
            modelAndView.addObject("errorMessage", ex.toString());
            modelAndView.setViewName(UrlPathConsts.STR_ERROR_ERROR_PAGE);
        }
        return modelAndView;
    }


}
