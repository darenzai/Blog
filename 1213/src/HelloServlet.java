import java.io.IOException;

public class HelloServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.getWriter().println("<h1>hello</h1>");
        response.setCharacterEncoding("UTF-8");
    }
}
