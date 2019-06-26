package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpDao;

public class EmpAddServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//设置浏览器端传递的参数中文编码

		String strName=request.getParameter("name");
		String strSalary=request.getParameter("salary");
		String strAge=request.getParameter("age");
		System.out.println(strName+","+strSalary+","+strAge);

		//一、调用dao工厂，让工厂完成数据的添加
		//创建EmpDao工厂，在调用工厂中的addEmp()方法
		EmpDao dao=new EmpDao();
		dao.addEmp(strName, Double.parseDouble(strSalary), Integer.parseInt(strAge));

		
		

		//重定向
		response.sendRedirect("list");
		
		
	}

}
