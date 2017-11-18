package com.cn.hx.wwj.web.pooh.module.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.hx.wwj.web.pooh.module.controller.base.BaseController;

/**
 * 登录验证过滤器(废弃  com.cn.hx.wwj.web.pooh.module.interceptor替代)
 *
 * @author FH QQ 313596790[青苔]
 */
public class LoginFilter extends BaseController implements Filter {

    /**
     * 初始化
     */
    public void init(FilterConfig fc) throws ServletException {
        //FileUtil.createDir("d:/FH/topic/");
    }

    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        chain.doFilter(req, res); // 调用下一过滤器
    }

}
