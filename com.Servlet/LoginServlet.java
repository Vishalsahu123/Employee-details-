package com.Servlet;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hightech.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  response.setContentType("text/html");
	  PrintWriter out= response.getWriter();
	
	  String uName,uPass;
	  String query;
	  uName=request.getParameter("Uname");
	  uPass=request.getParameter("Upass");
	  
	  SetGet obj=new SetGet();
	  obj.setUname(uName);
	  obj.setUpass(uPass);
	   SetGet e=EmpDao.login(obj);
	   System.out.println(e);
	  if(e.equals(null)) {
		  RequestDispatcher rd= request.getRequestDispatcher("errorpage.html");
		  rd.forward(request,response);  	 
	  }
	  else {
		   HttpSession session= request.getSession();
		   session.setAttribute("FNameSession", e.getFname());
		   
		  RequestDispatcher rd=request.getRequestDispatcher("EmpViewServlet?Id="+e.getId());
		  rd.forward(request,response);
		  String sName;
		  sName=request.getParameter("e.getFname()");
		  Cookie ck=new Cookie("uname",sName);
		  response.addCookie(ck);
	  }
	  
	}

}
