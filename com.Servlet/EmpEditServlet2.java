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

@WebServlet("/EmpEditServlet2")
public class EmpEditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EmpEditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		int Id=Integer.parseInt(request.getParameter("Id"));
		  String Uname=request.getParameter("Uname");
		  String Upass=request.getParameter("Upass");
		  SetGet e=new SetGet();
		  e.setId(Id);
		  e.setUname(Uname);
		  e.setUpass(Upass);
		  
		  int status=EmpDao.updateEmpLogDet(e);
		  if (status>0) {
			  RequestDispatcher rd=request.getRequestDispatcher("EmpViewServlet");
			  rd.forward(request,response);
		  }
		  else {
			  out.println("Sorry!unable to ubdate record");
		  }
		  System.out.println(status);
		  out.close(); 
	}

}
