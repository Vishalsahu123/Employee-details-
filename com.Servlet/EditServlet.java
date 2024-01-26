package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hightech.*;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");

		PrintWriter out=response.getWriter();
		
		int Id=Integer.parseInt(request.getParameter("Id"));
		
		SetGet e=EmpDao.getEmpById(Id);
		out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>");
        out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>");
        out.println("<title>Sahu & Son's</title>");
        out.println("<style>");
        out.println(" body {");
        out.println(" background-color: #343a40; /* Dark background color */");
        out.println(" color: #ffffff; /* Light text color */ ");
        out.println("}");
        out.println(" .container {");
        out.println(" max-width: 500px;");
        out.println(" margin-top: 50px;");
        out.println(" background-color: #1e272e; /* Dark container background color */");
        out.println(" padding: 30px;");
        out.println(" border-radius: 10px;");
        out.println(" box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Added box shadow */");
        out.println(" }");
        out.println(" .form-group {");
        out.println(" margin-bottom: 20px;");
        out.println(" }");
        out.println(" h2 {");
        out.println(" color: #3498db; /* Highlight color for headings */");
        out.println(" }");
        out.println(" .btn-primary {");
        out.println(" background-color: #3498db; /* Button color */");
        out.println(" border-color: #3498db;");
        out.println(" }");
        out.println(".btn-primary:hover {");
        out.println(" background-color: #2980b9; /* Hover color for buttons */");
        out.println(" border-color: #2980b9;");
        out.println(" }");
        out.println(" .form-control:focus {");
        out.println(" border-color: #3498db; /* Focus color for input fields */");
        out.println(" box-shadow: 0 0 10px rgba(52, 152, 219, 0.5);");
        out.println(" }");
        out.println(" label {");
        out.println(" color: #3498db; /* Label color */");
        out.println(" }");
        out.println(" .form-check-input:checked {");
        out.println(" background-color: #3498db; /* Checked radio button color */");
        out.println("  border-color: #3498db;");
        out.println(" }");
        out.println(" .form-check-input:hover {");
        out.println(" background-color: #2980b9; /* Hover color for radio buttons */");
        out.println("border-color: #2980b9;");
        out.println(" }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<a href='ViewServlet' class='btn btn-outline-light' >Go Back</a>");
        out.println("<div class='container'>");
        out.println("<h2 class='text-center mb-4'>Update Employee Information</h2>");
        out.println("<form id='registrationForm' action='EditServlet2' method='get'>");
        out.println("<input type='hidden' name='Id' value='"+e.getId()+"'/>");
        out.println("<div class='form-row'>");
        out.println("<div class='col-md-6 mb-3'>");
        out.println(" <label for='firstName'>First Name</label>");
        out.println(" <input type='text' class='form-control' name='Fname' id='Fname'  value='"+e.getFname()+"' required>" );
        out.println(" </div>");
        out.println(" <div class='col-md-6 mb-3'>");
        out.println(" <label for='lastName'>Last Name</label>");
        out.println("<input type='text' class='form-control' name='Lname' id='Lname' value='"+e.getLname()+"' required>");
        out.println(" </div>");
        out.println("  </div>");
        out.println(" <div class='form-group'>");
        out.println("<label for='dob'>Date of Birth</label>");
        out.println(" <input type='date' class='form-control' name='Dob' id='Dob' value='"+e.getDob()+"' required>");
        out.println(" </div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='phone'>Phone</label>");
        out.println("<input type='tel' class='form-control' name='Phone' id='Phone' value='"+e.getPhone()+"' required>");
        out.println(" </div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='email'>Email</label>");    
        out.println(" <input type='email' class='form-control' name='Email' id='Email' value='"+e.getEmail()+"' required>");
        out.println(" </div>");
        out.println(" <div class='form-group>");
        out.println("  <label for='address'>Address</label>");
        out.println("<textarea class='form-control' name='Address' id='Address' rows='2'required>"+e.getAddress()+" </textarea>");
        out.println(" </div>"); 
        out.println(" <div class='form-group'>");
        out.println(" <label for='country'>Country</label>");
        out.println(" <select  name='Country' id='Country' class='form-control' value='"+e.getCountry()+"' required>");
        out.println(" <option value=''>Select Country</option>");
        out.println("<option value='India'>India</option>");
        out.println("<option value='UK'>United Kingdom</option>");
        out.println(" <option value='US'>United State</option>");
        out.println("<option value='Canada'>Canada</option>");
        out.println(" <option value='France'>France</option>");
        out.println("</select>");
        out.println(" </div>");
        out.println("<div class='form-group'>");
        out.println("<label for='state'>State</label>");
        out.println("<select  name='State' id='State' class='form-control' value='"+e.getState()+"' required>");
        out.println("<option value=''>Select State</option>");
        out.println("<option value='New Delhi'>New Delhi</option>");
        out.println(" <option value='Maharastra'>Maharastra</option>");
        out.println("<option value='Uttar Pradesh'>Uttar Pradesh</option>");
        out.println(" <option value='Hariyana'>Hariyana</option>");
        out.println(" <option value='Banglore'>Banglore</option>");
        out.println(" <option value='Panjab'>Panjab</option>");
        out.println("<option value='Gujrat'>Gujrat</option>");
        out.println("</select>");
        out.println("</div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='lastName'>Pin</label>");
        out.println("<input type='text' class='form-control' name='Pin' id='Pin' value='"+e.getPin()+"' required>");
        out.println(" </div>");
        out.println("<div class='form-group'>");
        out.println("<label>Gender</label>");
        if(e.getGender().equals("male"))
        {
	        out.println("<div class='form-check'>");
	        out.println("  <input class='form-check-input' type='radio' name='Gender' id='male' value='male' checked required>");
	        out.println(" <label class='form-check-label' for='male'>Male</label>");
	        out.println("</div>");
	        out.println(" <div class='form-check'>");
	        out.println("<input class='form-check-input' type='radio' name='Gender' id='female' value='female'  required>");
	        out.println("<label class='form-check-label' for='female'>Female</label>");
	        out.println("</div>");
	        out.println(" <div class='form-check'>");
	        out.println("<input class='form-check-input' type='radio' name='Gender' id='other' value='other' required>");
	        out.println("<label class='form-check-label' for='other'>Other</label>");
	        out.println("</div>");
	       
        }
        else if(e.getGender().equals("female"))
        {
	        out.println("<div class='form-check'>");
	        out.println("  <input class='form-check-input' type='radio' name='Gender' id='male' value='male'  required>");
	        out.println(" <label class='form-check-label' for='male'>Male</label>");
	        out.println("</div>");
	        out.println(" <div class='form-check'>");
	        out.println("<input class='form-check-input' type='radio' name='Gender' id='female' value='female' checked required>");
	        out.println("<label class='form-check-label' for='female'>Female</label>");
	        out.println("</div>");
	        out.println(" <div class='form-check'>");
	        out.println("<input class='form-check-input' type='radio' name='Gender' id='other' value='other' required>");
	        out.println("<label class='form-check-label' for='other'>Other</label>");
	        out.println("</div>");
	       
        }
        else
        {
        	    out.println("<div class='form-check'>");
    	        out.println("  <input class='form-check-input' type='radio' name='Gender' id='male' value='male'  required>");
    	        out.println(" <label class='form-check-label' for='male'>Male</label>");
    	        out.println("</div>");
    	        out.println(" <div class='form-check'>");
    	        out.println("<input class='form-check-input' type='radio' name='Gender' id='female' value='female'  required>");
    	        out.println("<label class='form-check-label' for='female'>Female</label>");
    	        out.println("</div>");
    	        out.println(" <div class='form-check'>");
    	        out.println("<input class='form-check-input' type='radio' name='Gender' id='other' value='other' checked required>");
    	        out.println("<label class='form-check-label' for='other'>Other</label>");
    	        out.println("</div>");
    	       
            }
        
        out.println(" </div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='lastName'>Mother Name</label>");
        out.println(" <input type='text' class='form-control' name='Mthname' id='lastName' value='"+e.getMthname()+"' required>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label for='lastName'>Father Name</label>");
        out.println(" <input type='text' class='form-control' name='Fthname' id='lastName' value='"+e.getFthname()+"' required>");
        out.println("</div>");
        out.println(" <div class='form-group'>");
        out.println("<label>Marriage Status</label>");
        
        if(e.getMarried().equals("Married"))
        {
        out.println("<div class='form-check'>");
        out.println(" <input class='form-check-input' type='radio' name='Married' id='Married' value='Married' checked required>");
        out.println("<label class='form-check-label' for='Married'>Married</label>");
        out.println("</div>");
        out.println(" <div class='form-check'>");
        out.println("<input class='form-check-input' type='radio' name='Married' id='Married' value='Un-Married' required>");
        out.println(" <label class='form-check-label' for='Married'>Un-Married</label>");
        out.println(" </div>");
        }
        else {
        	 out.println("<div class='form-check'>");
             out.println(" <input class='form-check-input' type='radio' name='Married' id='Married' value='Married'  required>");
             out.println("<label class='form-check-label' for='Married'>Married</label>");
             out.println("</div>");
             out.println(" <div class='form-check'>");
             out.println("<input class='form-check-input' type='radio' name='Married' id='Married' value='Un-Married' checked required>");
             out.println(" <label class='form-check-label' for='Married'>Un-Married</label>");
             out.println(" </div>");
        }
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println("<label>Disabilities</label>");
        if(e.getDisabilities().equals("Yes"))
        {
        out.println(" <div class='form-check'>");
        out.println("<input class='form-check-input' type='radio' name='Disabilities' id='Yes' value='Yes' checked required>");
        out.println(" <label class='form-check-label' for='Disabilities'>Yes</label>");
        out.println(" </div>");
        out.println(" <div class='form-check'>");
        out.println("<input class='form-check-input' type='radio' name='Disabilities' id='Yes' value='No' required>");
        out.println("<label class='form-check-label' for='Disabilities'>NO</label>");
        out.println("</div>");
        }
        else {
        	out.println(" <div class='form-check'>");
            out.println("<input class='form-check-input' type='radio' name='Disabilities' id='Yes' value='Yes'  required>");
            out.println(" <label class='form-check-label' for='Disabilities'>Yes</label>");
            out.println(" </div>");
            out.println(" <div class='form-check'>");
            out.println("<input class='form-check-input' type='radio' name='Disabilities' id='Yes' value='No' checked required>");
            out.println("<label class='form-check-label' for='Disabilities'>NO</label>");
            out.println("</div>");
        }
        out.println("</div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='doj'>Date of Joining</label>");
        out.println(" <input type='date' class='form-control' name='Doj' id='doj' value='"+e.getDoj()+"' required>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println(" <label for='Design'>Designation</label>");
        out.println("<input type='text' class='form-control' name='Design' id='Design' value='"+e.getDesign()+"'  required>");
        out.println("</div>");
        out.println("<div class='form-group'>");
        out.println(" <label for='Depart'>Department</label>");
        out.println(" <input type='text' class='form-control' name='Depart' id='Depart' value='"+e.getDepart()+"' required>");
        out.println(" </div>");
        out.println(" <div class='form-group'>");
        out.println(" <label for='Salary'>Salary</label>");
        out.println(" <input type='Salary' class='form-control' name='Salary' id='Salary' value='"+e.getSalary()+"' required>");
        out.println("</div>");
        out.println("<div class='form-row'>");
        out.println(" <div class='col-md-6 mb-3'>");
        out.println("<label for='username'>Username</label>");
        out.println(" <input type='text' class='form-control' name='Uname' id='username' value='"+e.getUname()+"' required>");
        out.println(" </div>");
        out.println("<div class='col-md-6 mb-3'>");
        out.println(" <label for='password'>Password</label>");
        out.println("<input type='password' class='form-control' name='Upass' id='password' value='"+e.getUpass()+"' required>");
        out.println(" </div>");
        out.println(" </div>");
        out.println("<button class='btn btn-primary btn-block' type='submit'>Submit</button>");
        out.println(" </form>");
        out.println("</div>");
        out.println("<script src='https://code.jquery.com/jquery-3.5.1.slim.min.js'></script>");
        out.println("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js'></script>");
        out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js'></script>");
        out.println("<script>");
        out.println(" // You can add JavaScript here to dynamically populate the state options based on the selected country");
        out.println("</script>");
        out.println("</body>");
        out.println("</html>");
       
		out.close();
	}

}
