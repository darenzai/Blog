package web;

import model.User;
import model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class EmpLoginServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user =new User();

        UserDao userdao=new UserDao();
        System.out.println("11111");
        user.setName(request.getParameter("name"));
        user.setPasswd(request.getParameter("passwd"));

        Boolean flag=userdao.login(user.name,user.passwd);

        if(flag){
            response.sendRedirect("list");
        }else{
            response.sendRedirect("index.jsp");
        }


    }




}
