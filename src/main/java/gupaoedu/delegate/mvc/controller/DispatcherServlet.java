package gupaoedu.delegate.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 2019/5/27
 * wangyuwen
 */
public class DispatcherServlet extends HttpServlet {
    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");
        if("/getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("/getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else{
            resp.getWriter().write("404 Not found");
        }
        resp.getWriter().write("hello");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);
    }
}
