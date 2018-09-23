/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import com.mvc.beans.Userlogin;
import com.mvc.dao.UserLoginDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author krawler
 */
public class UserloginController implements Controller {
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView modelAndView = new ModelAndView("userlogin");
        try {
            List<Userlogin> userLoginList = UserLoginDao.userList();
            modelAndView.addObject("users",userLoginList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }
    
}
