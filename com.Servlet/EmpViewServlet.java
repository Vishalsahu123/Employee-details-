package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hightech.*;

@WebServlet("/EmpViewServlet")
public class EmpViewServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

public EmpViewServlet() {
super();
// TODO Auto-generated constructor stub
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub

response.setContentType("text/html");
PrintWriter out= response.getWriter();

/*
 * Cookie ck[]=request.getCookies(); out.print("Hello"+ck[0].getValue());
 */
 
int Id= Integer.parseInt(request.getParameter("Id"));
SetGet e=EmpDao.getEmpById(Id);

out.println("<!DOCTYPE html>");
out.println("<html lang='en'>");
out.println("<head>");
out.println("<meta charset='UTF-8'>");
    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
    out.println("<title>Stylish Bootstrap Form</title>"); 
    out.println(" <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>");
    
    out.println("<style> ");
 out.println(" body {");
        out.println(" background-color: #333; /* Black background color */");
        out.println(" color: #fff;");
        out.println("font-family: 'Arial', sans-serif;");
        out.println("}");

        out.println(".container {");
        out.println("margin-top: 50px;");
        out.println("max-width: 600px;");
        out.println(" }");

        out.println("h2 {");
        out.println("text-align: center;");
        out.println(" }");

        out.println(" form {");
        out.println(" background-color: rgba(0, 0, 0, 0.7); /* Dark semi-transparent background */");
        out.println("padding: 20px;");
        out.println("border-radius: 10px;");
        out.println("box-shadow: 0 0 10px rgba(255, 255, 255, 0.2); /* White border shadow */");
        out.println("}");

        out.println(".form-group label {");
        out.println("font-weight: bold;");
        out.println("}");

        out.println(" button {");
        out.println("margin-top: 15px;");
        out.println(" }");
        out.println("#Logout{");
        out.println("margin-left:180px;");
        
        out.println(" </style>");
    out.print("</head>");
out.println("<body>");
out.print("<a href='login.html' class='btn btn-outline-light' >Go Back</a>");
HttpSession session= request.getSession();
String FNameSession=(String)session.getAttribute("FNameSession");
     out.print("<h4 style= 'padding-left:180px; margin-top:-30px'>Welcome:"+FNameSession+"</h4>");
    out.print("<div class='container'>");
    
    out.println(" <h2>Your Information</h2>");
        out.println(" <form id='myForm'>");
            out.println("<div class='form-group'>");

			/*
			 * out.println("<div class='form-group'>"); out.
			 * println("<input type='hidden' class='form-control' id='Id' name='Id' value='"
			 * +e.getId()+"'required>"); out.println("</div>");
			 */

                out.println(" <label for='firstName'>First Name:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='firstName' name='firstName'value='"+e.getFname()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='lastName'>Last Name:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='lastName' name='lastName'value='"+e.getLname()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Dob'>Date of Birth:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Doi' name='Doi' value='"+e.getDob()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Phone'>Phone Number:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Phone' name='Phone' value='"+e.getPhone()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='userEmail'>Email:</label>");
                out.println(" <input type='email' readonly='readonly' class='form-control' id='Email' name='Email' value='"+e.getEmail()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Address'>Address:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Address' name='Address'value='"+e.getAddress()+"' required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println("<label for='State'>State:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='State' name='State' value='"+e.getState()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Pin'>Pin:</label>");
                out.println("<input type='text'readonly='readonly' class='form-control' id='Pin' name='Pin' value='"+e.getPin()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Country'>Country:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Country' name='Country'value='"+e.getCountry()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Gender'>Gender:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Gender' name='Gender'value='"+e.getGender()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for=MthName'>Mother Name:</label>");
                out.println("<input type=text' readonly='readonly' class='form-control' id='MthName' name='Mthname' value='"+e.getMthname()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='FthName'>Father Name:</label>");
                out.println("<input type=text' readonly='readonly' class='form-control' id='FthName' name='Fthname' value='"+e.getFthname()+"' required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Married'>Marriage Status:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Married' name='Married' value='"+e.getMarried()+"' required>");
                out.println("</div>");

            out.println(" <div class='form-group'>");
                out.println(" <label for='Disabilities'>Disabilities:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Disabilities' name='Disabilities'value='"+e.getDisabilities()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Doj'>Date of Joining:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Doj' name='Doj' value='"+e.getDoj()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Design'>Designation:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Design' name='Design' value='"+e.getDesign()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Depart'>Department:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Depart' name='Depart' value='"+e.getDepart()+"'required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Salary'> Basic Salary:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Salary' name='Salary' value='"+e.getSalary()+"'required>");
                out.println("</div>");

            out.println(" <div class='form-group'>");
                out.println("<label for='Hra'>HRA:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Hra' name='Hra' value='"+e.getHra()+"' required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Ta'>TA:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Ta' name='Ta' value='"+e.getTa()+"' required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Da'>DA:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Da' name='Da' value='"+e.getDa()+"' required>");
                out.println(" </div>");

            out.println(" <div class='form-group'>");
                out.println(" <label for='Pf'>PF:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Pf' name='Pf' value='"+e.getPf()+"'required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Esi'>ESI:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Esi' name='Esi' value='"+e.getEsi()+"'required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Gross'>Gross Salary:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Gross' name='Gross' value='"+e.getGross()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Net'>Net Salary:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Net' name='Net' value='"+e.getNet()+"'required>");
                out.println(" </div>");

            out.println("<div class='form-group'>");
                out.println(" <label for='Uname'>User Name:</label>");
                out.println(" <input type='text' readonly='readonly' class='form-control' id='Uname' name='Uname' value='"+e.getUname()+"'required>");
                out.println("</div>");

            out.println("<div class='form-group'>");
                out.println("<label for='Upass'> Password:</label>");
                out.println("<input type='text' readonly='readonly' class='form-control' id='Upass' name='Upass' value='"+e.getUpass()+"' required>");
                out.println("</div>");

                out.println("<a class='btn btn-primary' href='EmpEditServlet?Id="+e.getId()+"'>Change User Name Or Password</button>");
            out.println("<a class='btn btn-primary' id='Logout' href='index.html'>Log Out</button>");
            out.println("</form>");
        out.println(" </div>");


    out.println("<script src='https://code.jquery.com/jquery-3.2.1.slim.min.js'></script>");
    out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js'></script>");
    out.println(" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>");


    out.println("<script>");
        out.println("function validateForm() {");
        out.println(" var form = document.getElementById('myForm');");
        out.println("if (form.checkValidity()) {");
        out.println(" alert('Form submitted successfully!');");

        out.println(" } else {");
        out.println("alert('Please fill out all the required fields.');");
        out.println("}");
        out.println("}");
        out.println(" </script>");

    out.println("</body>");
out.println("</html>");
}

}
