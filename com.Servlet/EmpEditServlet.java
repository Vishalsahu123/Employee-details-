package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hightech.EmpDao;
import com.hightech.SetGet;


@WebServlet("/EmpEditServlet")
public class EmpEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmpEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	int Id=Integer.parseInt(request.getParameter("Id"));
	
	SetGet e=EmpDao.GetEmpLogDet(Id);
	
	out.println("<!DOCTYPE html>");
	out.println("<html lang='en'>");

	out.println("<head>");
	  out.println("<meta charset='UTF-8'>");
	  out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	  out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
	  out.println("<title>Sahu & Son's</title>");
	  out.println("<style> ");
	 out.println("body {");
	    out.println(" background-color: #121212;");
	    out.println(" color: #ffffff;");
	    out.println(" }");

	    out.println(".login-container {");
	    out.println(" max-width: 400px;");
	    out.println(" margin: auto;");
	    out.println(" margin-top: 100px;");
	    out.println(" padding: 20px;");
	    out.println(" border: 1px solid #333;");
	    out.println("border-radius: 10px;");
	    out.println(" background-color: #000;");
	    out.println(" box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);");
	    out.println(" }");

	    out.println(".login-container h2 {");
	    out.println(" text-align: center;");
	    out.println(" color: #bb86fc;");
	    out.println(" }");

	    out.println(" .form-label {");
	    out.println(" color: #ffffff;");
	    out.println(" }");

	    out.println(".form-control {");
	    out.println(" border: 1px solid #333;");
	    out.println(" border-radius: 5px;");
	    out.println(" color: #ffffff;");
	    out.println(" background-color: #121212;");
	    out.println(" }");

	    out.println(" .form-check-label {");
	    out.println(" color: #ffffff;");
	    out.println("}");

	    out.println(".btn-primary {");
	    out.println(" background-color: #6200ea;");
	    out.println(" border-color: #6200ea;");
	    out.println(" }");

	    out.println(".btn-primary:hover {");
	    out.println(" background-color: #4a148c;");
	    out.println(" border-color: #4a148c;");
	    out.println("}");

	    out.println(".footer-link {");
	    out.println(" margin-top: 10px;");
	    out.println(" text-align: center;");
	    out.println(" color: #ffffff;");
	    out.println(" }");
	    out.println("</style>");
	  out.println("</head>");

	out.println("<body>");
	out.println("<a href='EmpViewServlet' class='btn btn-primary' >Go Back</a>");

	  out.println("<div class='container login-container'>");

	    out.println(" <h2>Login Details</h2>");
	    out.println("<form action='EmpEditServlet2' method='GET'>");
	    out.println("<div class='mb-3'>");
        out.println(" <input type='hidden' class='form-control' name='Id' placeholder='Enter your Id'  value='"+e.getId()+"'required>");
        out.println("</div>");
	      out.println("<div class='mb-3'>");
	        out.println(" <label for='username' class='form-label'>Username</label>");
	        out.println("<input type='text' class='form-control' name='Uname' placeholder='Enter your username'  value='"+e.getUname()+"' required>");
	        out.println("</div>");
	      out.println("<div class='mb-3'>");
	        out.println(" <label for='password' class='form-label'>Password</label>");
	        out.println(" <input type='text' class='form-control' name='Upass' placeholder='Enter your password'  value='"+e.getUpass()+"'required>");
	        out.println("</div>");

	      out.println("<button type='submit' class='btn btn-primary btn-block'>Change</button>");

	      out.println("</form>");

	    out.println(" </div>");

	  out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js'></script>");
	  out.println("</body>");

	out.println("</html>");
	}

}
