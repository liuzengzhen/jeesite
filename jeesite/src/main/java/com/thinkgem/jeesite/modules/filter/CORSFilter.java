package com.thinkgem.jeesite.modules.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CORSFilter implements Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
    //实现向响应头部添加Access-Control-Allow-Origin属性，实现跨域访问。
    @Override
    public void doFilter(ServletRequest sRequest, ServletResponse sResponse,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)sRequest;
        HttpServletResponse response=(HttpServletResponse)sResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        chain.doFilter(sRequest, sResponse);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }

}
