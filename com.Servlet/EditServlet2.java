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

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out= response.getWriter();
	
	int Id=Integer.parseInt(request.getParameter("Id"));
	 String Fname=request.getParameter("Fname");
	  String Lname=request.getParameter("Lname");
	  String Dob=request.getParameter("Dob");
	  String Phone=request.getParameter("Phone");
	  String Email=request.getParameter("Email");
	  String Address=request.getParameter("Address");
	  String State=request.getParameter("State");
	  int Pin=Integer.parseInt(request.getParameter("Pin"));
	  String Country=request.getParameter("Country");
	  String Gender=request.getParameter("Gender");
	  String Mthname=request.getParameter("Mthname");
	  String Fthname=request.getParameter("Fthname");
	  String Married=request.getParameter("Married");
	  String Disabilities=request.getParameter("Disabilities");
	  String Doj=request.getParameter("Doj");
	  String Design=request.getParameter("Design");
	  String Depart=request.getParameter("Depart");
	  Float Salary=Float.parseFloat(request.getParameter("Salary"));
	  String Uname=request.getParameter("Uname");
	  String Upass=request.getParameter("Upass");
	  
	  float Hra,Ta,Da,Pf,Esi,Gross,Net;
	  
	  Hra=Salary*40/100;
	  Ta=Salary*30/100;
	  Da=Salary*40/100;
	  Pf=Salary*12.5f/100;
	  Esi=Salary*40/100;
	  Gross=Hra+Ta+Da+Salary;
	  Net=Gross-Pf-Esi;
	  
	  SetGet e=new SetGet();
	  e.setId(Id);
	  e.setFname(Fname);
	  e.setLname(Lname);
	  e.setDob(Dob);
	  e.setPhone(Phone);
	  e.setEmail(Email);
	  e.setAddress(Address);
	  e.setState(State);
	  e.setPin(Pin);
	  e.setCountry(Country);
	  e.setGender(Gender);
	  e.setMthname(Mthname);
	  e.setFthname(Fthname);
	  e.setMarried(Married);
	  e.setDisabilities(Disabilities);
	  e.setDoj(Doj);
	  e.setDesign(Design);
	  e.setDepart(Depart);
	  e.setSalary(Salary);
	  e.setUname(Uname);
	  e.setUpass(Upass);
	  e.setHra(Hra);
	  e.setTa(Ta);
	  e.setDa(Da);
	  e.setPf(Pf);
	  e.setEsi(Esi);
	  e.setGross(Gross);
	  e.setNet(Net);
	  
	  int status=EmpDao.update(e);
	  if (status>0) {
		  System.out.println(status);
		  response.sendRedirect("ViewServlet");
	  }
	  else {
		  out.println("Sorry!unable to ubdate record");
	  }
	  System.out.println(status);
	  out.close(); 
	}

}
