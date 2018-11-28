package taotao.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class fileTest  implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("======yuntao");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest  request  = (HttpServletRequest) servletRequest;
    }

    @Override
    public void destroy() {
    }
}
