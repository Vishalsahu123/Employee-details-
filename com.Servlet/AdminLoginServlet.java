package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hightech.EmpDao;
import com.hightech.SetGet;

@WebServlet("/AdminLogServlet")
public class AdminLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public AdminLogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String uName,uPass;
		
		uName=request.getParameter("Aname");
		uPass=request.getParameter("Apass");
		
		SetGet obj=new SetGet();
		obj.setUname(uName);
		obj.setUpass(uPass);
		int rowCount=EmpDao.adminlogin(obj);
		if(rowCount>0) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("errorpage.html");
			rd.forward(request, response);
		}
	}

}
