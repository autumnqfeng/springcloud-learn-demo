package com.autu.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * ClassName: LoginFilter
 * date: 2019/9/27 11:19
 *
 * @author: qiufeng
 */
@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre"; // 请求路由前调用
    }

    @Override
    public int filterOrder() {
        return 1; // int值来定义过滤器执行顺序，数值越小优先级越高
    }

    @Override
    public boolean shouldFilter() {
        return true; // 该过滤器是否执行，true执行，false不执行
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        // 获取请求参数token的值
        String token = request.getParameter("token");
        if(token == null) {
            context.setSendZuulResponse(false); // 拒绝访问
            context.setResponseStatusCode(200); // 设置响应状态码
            try {
                context.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
