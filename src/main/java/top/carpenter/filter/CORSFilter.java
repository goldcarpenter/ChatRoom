package top.carpenter.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        //设置所有的请求都可以实现Ajax跨域
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        //支持http的POST,GET,OPTIONS,DELETE四种请求方式
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        httpServletResponse.setHeader("Access-Control-Max-Age", "60");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        //是否支持cookie跨域
        // httpServletResponse.addHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}
