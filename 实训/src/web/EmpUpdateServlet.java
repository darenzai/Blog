package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Emp;
import model.EmpDao;

public class EmpUpdateServlet extends HttpServlet {
    int id=0;
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//设置浏览器端传递的参数中文编码


        EmpDao empdao =new EmpDao();
        Emp emp =new Emp();
        if(request.getHeader("Referer").equals("http://localhost:8080/_war_exploded/list")){


            id=Integer.parseInt(request.getParameter("id"));
            System.out.println("要修改的 id 是  :" +id);
            emp.setId(id);
            ArrayList<Emp> allEmp=empdao.getAllEmps();

            for (int i=0; i<allEmp.size();i++){
                if(allEmp.get(i).id==id){
                    request.setAttribute("p",allEmp.get(i));
                    request.getRequestDispatcher("update.jsp").forward(request,response);

                    break;


                }
            }

        }else{



            String strName=request.getParameter("name");
            String strSalary=request.getParameter("salary");
            String strAge=request.getParameter("age");

            String name=strName;
            Double salary=Double.parseDouble(strSalary);
            int age=Integer.parseInt(strAge);


            emp.setAge(age);
            emp.setName(name);
            emp.setSalary(salary);
            emp.setId(id);

            empdao.updateEmp(emp);

            response.sendRedirect("list");


        }












    }

}
