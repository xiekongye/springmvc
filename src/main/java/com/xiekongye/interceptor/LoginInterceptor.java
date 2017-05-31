package com.xiekongye.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by You on 2017/5/30.
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * Handler执行之前调用这个方法
     * */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url =  request.getRequestURI();

        if (url.indexOf("login") >= 0 || url.indexOf("register") >= 0) {
            return true;
        }

        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userName");

        if (userName != null){
            return true;
        }

        request.getRequestDispatcher("/login").forward(request,response);

        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
