package com.hightech;
import java.sql.*;
import java.util.*;

import javax.servlet.http.HttpSession;
public class EmpDao {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
		
	}
	public static int save (SetGet e) {
      int status=0;
      try {
    	  Connection con =EmpDao.getConnection();
    	  PreparedStatement ps= con.prepareStatement("insert into Form(username,pass,Fname,Lname,DOB,Phone,Email,Address,State,Pin,Country,Gender,Mthname,Fthname,Married,Disabilities,DOJ,Design,Depart,Salary,Hra,Ta,Da,Pf,Esi,Gross,Net)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    	  ps.setString(1,e.getUname());
    	  ps.setString(2,e.getUpass());
    	  ps.setString(3,e.getFname());
    	  ps.setString(4,e.getLname());
    	  ps.setString(5,e.getDob());
    	  ps.setString(6,e.getPhone());
    	  ps.setString(7,e.getEmail());
    	  ps.setString(8,e.getAddress());
    	  ps.setString(9,e.getState());
    	  ps.setInt(10,e.getPin());
    	  ps.setString(11,e.getCountry());
    	  ps.setString(12,e.getGender());
    	  ps.setString(13,e.getMthname());
    	  ps.setString(14,e.getFthname());
    	  ps.setString(15,e.getMarried());
    	  ps.setString(16,e.getDisabilities());
    	  ps.setString(17,e.getDoj());
    	  ps.setString(18,e.getDesign());
    	  ps.setString(19,e.getDesign());
    	  ps.setFloat(20,e.getSalary());
    	  ps.setFloat(21,e.getHra());
    	  ps.setFloat(22,e.getTa());
    	  ps.setFloat(23,e.getDa());
    	  ps.setFloat(24,e.getPf());
    	  ps.setFloat(25,e.getEsi());
    	  ps.setFloat(26,e.getGross());
    	  ps.setFloat(27,e.getNet());
    	  
    	  status=ps.executeUpdate();
    	  con.close();
      }
      catch(Exception ex)
      {
    	  ex.printStackTrace();
      }
      return status;
	}
	public static int update (SetGet e) {
	      int status=0;
	      try {
	    	  Connection con =EmpDao.getConnection();
	    	  PreparedStatement ps= con.prepareStatement("update form set username=?,pass=?,Fname=?,Lname=?,DOB=?,Phone=?,Email=?,Address=?,State=?,Pin=?,Country=?,Gender=?,Mthname=?,Fthname=?,Married=?,Disabilities=?,DOJ=?,Design=?,Depart=?,Salary=?,Hra=?,Ta=?,Da=?,Pf=?,Esi=?,Gross=?,Net=? where id=?");
	    	  ps.setString(1,e.getUname());
	    	  ps.setString(2,e.getUpass());
	    	  ps.setString(3,e.getFname());
	    	  ps.setString(4,e.getLname());
	    	  ps.setString(5,e.getDob());
	    	  ps.setString(6,e.getPhone());
	    	  ps.setString(7,e.getEmail());
	    	  ps.setString(8,e.getAddress());
	    	  ps.setString(9,e.getState());
	    	  ps.setInt(10,e.getPin());
	    	  ps.setString(11,e.getCountry());
	    	  ps.setString(12,e.getGender());
	    	  ps.setString(13,e.getMthname());
	    	  ps.setString(14,e.getFthname());
	    	  ps.setString(15,e.getMarried());
	    	  ps.setString(16,e.getDisabilities());
	    	  ps.setString(17,e.getDoj());
	    	  ps.setString(18,e.getDesign());
	    	  ps.setString(19,e.getDepart());
	    	  ps.setFloat(20,e.getSalary());
	    	  ps.setFloat(21,e.getHra());
	    	  ps.setFloat(22,e.getTa());
	    	  ps.setFloat(23,e.getDa());
	    	  ps.setFloat(24,e.getPf());
	    	  ps.setFloat(25,e.getEsi());
	    	  ps.setFloat(26,e.getGross());
	    	  ps.setFloat(27,e.getNet());
	    	  ps.setInt(28,e.getId());
	    	  
	    	  
	    	  status=ps.executeUpdate();
	    	  con.close();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      return status;
		}
	public static int delete(int Id) {
		int status=0;
		try {
			Connection con =EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from Form where id=?");
			ps.setInt(1, Id);
			status = ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
			return status;	
	}
	public static SetGet getEmpById(int Id) {
	    SetGet e=new SetGet();  
		try {
	    	  Connection con =EmpDao.getConnection();
	    	  PreparedStatement ps= con.prepareStatement("select * from Form  where id=?");
	    	  ps.setInt(1, Id);
	    	  ResultSet rs = ps.executeQuery();
	    	  if(rs.next()) {
	    	 e.setId(rs.getInt(1));
	    	 e.setUname(rs.getString(2));
	    	 e.setUpass(rs.getString(3));
	    	 e.setFname(rs.getString(4));
	    	 e.setLname(rs.getString(5));
	    	 e.setDob(rs.getString(6));
	    	 e.setPhone(rs.getString(7));
	    	 e.setEmail(rs.getString(8));
	    	 e.setAddress(rs.getString(9));
	    	 e.setState(rs.getString(10));
	    	 e.setPin(rs.getInt(11));
	    	 e.setCountry(rs.getString(12));
	    	 e.setGender(rs.getString(13));
	    	 e.setMthname(rs.getString(14));
	    	 e.setFthname(rs.getString(15));
	    	 e.setMarried(rs.getString(16));
	    	 e.setDisabilities(rs.getString(17));
	    	 e.setDoj(rs.getString(18));
	    	 e.setDesign(rs.getString(19));
	    	 e.setDepart(rs.getString(20));
	    	 e.setSalary(rs.getFloat(21));
	    	 e.setHra(rs.getFloat(22));
	    	 e.setTa(rs.getFloat(23));
	    	 e.setDa(rs.getFloat(24));
	    	 e.setPf(rs.getFloat(25));
	    	 e.setEsi(rs.getFloat(26));
	    	 e.setGross(rs.getFloat(27));
	    	 e.setNet(rs.getFloat(28));
	    	 
	    	  
	    	  }
	    	  con.close();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      return e;
		}
	public static List<SetGet>GetAllEmp(){
		List<SetGet> list=new ArrayList<SetGet>(); 
		try {
	    	  Connection con =EmpDao.getConnection();
	    	  PreparedStatement ps= con.prepareStatement("select * from Form");
	    	 
	    	  ResultSet rs = ps.executeQuery();
	    	  while(rs.next()){
	    		  SetGet e =new SetGet();
	    	 e.setId(rs.getInt(1));
	    	 e.setUname(rs.getString(2));
	    	 e.setUpass(rs.getString(3));
	    	 e.setFname(rs.getString(4));
	    	 e.setLname(rs.getString(5));
	    	 e.setDob(rs.getString(6));
	    	 e.setPhone(rs.getString(7));
	    	 e.setEmail(rs.getString(8));
	    	 e.setAddress(rs.getString(9));
	    	 e.setState(rs.getString(10));
	    	 e.setPin(rs.getInt(11));
	    	 e.setCountry(rs.getString(12));
	    	 e.setGender(rs.getString(13));
	    	 e.setMthname(rs.getString(14));
	    	 e.setFthname(rs.getString(15));
	    	 e.setMarried(rs.getString(16));
	    	 e.setDisabilities(rs.getString(17));
	    	 e.setDoj(rs.getString(18));
	    	 e.setDesign(rs.getString(19));
	    	 e.setDepart(rs.getString(20));
	    	 e.setSalary(rs.getFloat(21));
	    	 e.setHra(rs.getFloat(22));
	    	 e.setTa(rs.getFloat(23));
	    	 e.setDa(rs.getFloat(24));
	    	 e.setPf(rs.getFloat(25));
	    	 e.setEsi(rs.getFloat(26));
	    	 e.setGross(rs.getFloat(27));
	    	 e.setNet(rs.getFloat(28));
	    	 list.add(e);
	    	  
	    	  }
	    	  con.close();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      return list;
	}
	public static SetGet  login(SetGet e) {
		
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			Statement stmt=con.createStatement();
			
			String query="Select * from form where username='"+e.getUname()+"'and pass='"+e.getUpass()+"';";
			ResultSet rs=stmt.executeQuery(query);
						
			while(rs.next()) {
				
		       e.setId(rs.getInt(1));
		       e.setUname(rs.getString(2));
		       e.setUpass(rs.getString(3));
		       e.setFname(rs.getString(4));
				status++;
		 
			
			}
			
		}
		catch(Exception ex) {
			
		}
		
		return e;
	}
	public static int adminlogin(SetGet e) {
		
		int status=0;
		try {
			Connection con=EmpDao.getConnection();
			Statement stmt=con.createStatement();
			
			String query="Select * from details where username='"+e.getUname()+"'and pass='"+e.getUpass()+"';";
			ResultSet rs=stmt.executeQuery(query);
			
			
			while(rs.next()) {
				status++;
			}
			
		}
		catch(Exception ex) {
			
		}
		
		return(status);
	}
	
	public static SetGet GetEmpLogDet(int Id) {
	    SetGet e=new SetGet();  
		try {
	    	  Connection con =EmpDao.getConnection();
	    	  PreparedStatement ps= con.prepareStatement("select * from Form  where id=?");
	    	  ps.setInt(1, Id);
	    	  ResultSet rs = ps.executeQuery();
	    	  if(rs.next()) {
	    	 e.setId(rs.getInt(1));
	    	 e.setUname(rs.getString(2));
	    	 e.setUpass(rs.getString(3));  
	    	  }
	    	  con.close();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      return e;
		}
	public static int updateEmpLogDet (SetGet e) {
	      int status=0;
	      try {
	    	  Connection con =EmpDao.getConnection();
	    	  PreparedStatement ps= con.prepareStatement("update form set username=?,pass=? where id=?");
	    	  ps.setString(1,e.getUname());
	    	  ps.setString(2,e.getUpass());
	    	  ps.setInt(3,e.getId());
	    	  
	    	  status=ps.executeUpdate();
	    	  con.close();
	      }
	      catch(Exception ex)
	      {
	    	  ex.printStackTrace();
	      }
	      return status;
		}
}

