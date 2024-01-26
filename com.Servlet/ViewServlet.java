package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hightech.*;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	
	List<SetGet>list=EmpDao.GetAllEmp();
	
	out.println("<!DOCTYPE html>");
	out.println("<html lang='en'>");
	out.println("<head>");
	out.println("<script>");
	out.print("function Message(){alert('confirm for Deletion');}");
	out.println("</script>");
	
	out.println("<meta charset='UTF-8'>");
	    out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
	    out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>");
	    out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css'>");
	    out.println("<style>");
	    out.println(" body {");
	        out.println(" font-family: 'Arial', sans-serif;");
	        out.println(" background: linear-gradient(to right, #2b5876, #4e4376);");
	        out.println(" color: #fff;");
	        out.println(" margin: 0;");
	        out.println(" padding: 0;");
	        out.println(" min-height: 100vh;");
	        out.println("}");
	        out.println(".container {");
	        out.println(" display: flex;");
	       
	        out.println(" align-items: center;");
	        out.println(" height: 50vh;");
	        out.println(" margin-left:-5px;");
	        out.println(" }");
	        out.println("table {");

	        out.println(" border-collapse: collapse;");
	        out.println("box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);");
	        out.println(" background-color: #25274d;");
	        out.println("border-radius: 15px;");
	        out.println(" overflow: hidden;");
	       
	        out.println(" }");
	        out.println("th, td {");
	        out.println(" padding: 15px;");
	        out.println("text-align: left;");
	        out.println("border-bottom: 1px solid #525299;");
	        out.println("color: #fff;");
	        out.println("}");
	        out.println("th {");
	        out.println(" background-color: #1c1e42;");
	        out.println("}");
	        out.println(" tr {");
	        out.println("background-color: #25274d;");
	        out.println("transition: background-color 0.3s ease;");
	        out.println("}");
	        out.println("tr:hover {");
	        out.println("background-color: #373873;");
	        out.println("}");
	        out.println(" .edit, .delete {");
	        out.println(" cursor: pointer;");
	        out.println(" margin-right: 10px;");
	        out.println("}");
	        out.println("h1 {");
	        out.println("font-family:serif ;");
	        out.println(" text-align: center;");
	        out.println(" text-shadow: 1px 1px 2px red, 0 0 1em blue, 0 0 0.2em blue;");
	        out.println(" margin-top:100px;");
	        out.println(" }");
	        out.println("</style>");
	    out.println("<title>View Servlet (Dark Mode)</title>");
	    out.println("</head>");
	out.println("<body>");
	out.println("<a href='welcome.html' class='btn btn-outline-light' >Go Back</a>");
	    out.println("<h1>Employee Details</h1>");
	    out.println("<div class='container'>");
	        out.println("<table class='table table-bordered'>");
	            out.println("<thead class='thead-dark'>");
	                out.println(" <tr>");
	                    out.println("<th>Employee Id</th>");
	                    out.println("<th>User Name</th>");
	                    out.println("<th>Password</th>");
	                    out.println("<th>First Name</th>");
	                    out.println("<th>Last Name</th>");
	                    out.println("<th>DOB</th>");
	                    out.println("<th>Phone</th>");
	                    out.println(" <th>Email</th>");
	                    out.println("<th>Address</th>");
	                    out.println("<th>State</th>");
	                    out.println(" <th>Pin</th>");
	                    out.println(" <th>Country</th>");
	                    out.println("<th>Gender</th>");
	                    out.println("<th>Mother Name</th>");
	                    out.println("<th>Father Name</th>");
	                    out.println("<th>Married Status</th>");
	                    out.println("<th>Disabilities</th>");
	                    out.println("<th>DOJ</th>");
	                    out.println("<th>Designation</th>");
	                    out.println("<th>Department</th>");
	                    out.println("<th>Salary</th>");
	                    out.println("<th>Hra</th>");
	                    out.println(" <th>Ta</th>");
	                    out.println("<th>Da</th>");
	                    out.println("<th>Pf</th>");
	                    out.println("<th>Esi</th>");
	                    out.println("<th>Gross </th>");
	                    out.println("<th>Net</th>");
	                    out.println("<th>Edit</th>");
	                    out.println(" <th>Delete</th>");
	                    out.println("</tr>");
	                out.println("</thead>");
	for(SetGet e:list) {
	
		 out.println("<tbody>");
         out.println(" <tr>");
             out.println("<td>"+e.getId()+"</td>");
             out.println("<td>"+e.getUname()+"</td>");
             out.println(" <td>"+e.getUpass()+"</td>");
             out.println(" <td>"+e.getFname()+"</td>");
             out.println(" <td>"+e.getLname()+"</td>");
             out.println("<td>"+e.getDob()+"</td>");
             out.println("<td>"+e.getPhone()+"</td>");
             out.println("<td>"+e.getEmail()+"</td>");
             out.println(" <td>"+e.getAddress()+"</td>");
             out.println(" <td>"+e.getState()+"</td>");
             out.println(" <td>"+e.getPin()+"</td>");
             out.println(" <td>"+e.getCountry()+"</td>");
             out.println(" <td>"+e.getGender()+"</td>");
             out.println(" <td>"+e.getMthname()+"</td>");
             out.println(" <td>"+e.getFthname()+"</td>");
             out.println(" <td>"+e.getMarried()+"</td>");
             out.println(" <td>"+e.getDisabilities()+"</td>");
             out.println(" <td>"+e.getDoj()+"</td>");
             out.println(" <td>"+e.getDesign()+"</td>");
             out.println(" <td>"+e.getDepart()+"</td>");
             out.println(" <td>"+e.getSalary()+"</td>");
             out.println(" <td>"+e.getHra()+"</td>");
             out.println(" <td>"+e.getTa()+"</td>");
             out.println(" <td>"+e.getDa()+"</td>");
             out.println(" <td>"+e.getPf()+"</td>");
             out.println(" <td>"+e.getEsi()+"</td>");
             out.println("<td>"+e.getGross()+"</td>");
             out.println(" <td>"+e.getNet()+"</td>");
             out.println("<td><a href='EditServlet?Id="+e.getId()+"' class='edit' ><i class='fas fa-edit'></i></a></td>");
             out.println(" <td><a href='DeleteServlet?Id="+e.getId()+"' class='delete' onclick='Message();'><i class='fas fa-trash-alt'></i></a></td>");
             out.println("</tr>");
	}
         out.println("</tbody>");
     out.println("</table>");
 out.println("</div>");

out.println("</body>");
out.println("</html>");

	
	out.close();
	}

}
