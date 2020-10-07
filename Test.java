import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class Test extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务中---");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化中---");
    }

    @Override
    public void destroy() {
        System.out.println("销毁了。。。");
    }
}
