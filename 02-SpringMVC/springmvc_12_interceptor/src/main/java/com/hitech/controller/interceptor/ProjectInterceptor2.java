package com.hitech.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
// 定义拦截器类，实现HandlerInterceptor接口
// 注意当前类必须受Spring容器控制
public class ProjectInterceptor2 implements HandlerInterceptor {
    // 原始方法调用前执行的内容
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("preHandle...222");

        // 拦截器中的preHandler方法
        // 如果返回true,则代表放行，会执行原始Controller类中要请求的方法
        // 如果返回false，则代表拦截，后面的就不会再执行了
        return false;
    }

    // 原始方法调用后执行的内容
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...222");
    }

    // 原始方法调用完成后执行的内容
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...222");
    }
}
