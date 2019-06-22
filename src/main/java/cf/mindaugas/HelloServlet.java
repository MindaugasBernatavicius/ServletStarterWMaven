package cf.mindaugas;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// We can also use anotations to configure servlets
@WebServlet(
    // value = "/Simple"
    urlPatterns = {"*.do", "*.dont"}
)
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().print("Hello from servlet");
    }
}