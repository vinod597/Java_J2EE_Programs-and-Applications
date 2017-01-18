package com.dhatri.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatri.bean.EmpBean;
import com.dhatri.dao.DatabaseOperations;
import com.dhatri.mail.SendMailOtp;
import com.dhatri.logic.GenerateOtp;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/EmployeeLoginValidation")
public class EmployeeLoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		HttpSession session =request.getSession();
		String email=request.getParameter("email");
		String empdob = request.getParameter("dob");
	   System.out.println("After the parameters");
	   System.out.println(email);
	   System.out.println(empdob);
	   
	    DatabaseOperations dbo= new DatabaseOperations();
	  ArrayList<EmpBean> empList = dbo.search3(email);
	     
	    System.out.println(empList);
	    session.setAttribute("employeelist",empList);
	    Object obj =session.getAttribute("employeelist");
	    
	    ArrayList<EmpBean> employeeist=(ArrayList)obj; 
	    Iterator iterator =employeeist.iterator();
	    
	    EmpBean empBean=null;
	    while(iterator.hasNext())
	    {
	    	empBean=(EmpBean)iterator.next();
	    }
	    
	    String userotp=GenerateOtp.getEmployeeOtp();
	    if(email.equals(empBean.getEmail()) && empdob.equals(empBean.getDate_of_birth()))
	    {
	    	String resultMessage="";
	    	
	    	try{
		   		SendMailOtp.sendEmail(email,userotp);
		   		resultMessage = "Enter Otp ,please check your mail";
		   		
		   	}catch(Exception e){
		   		
		   		resultMessage= "error !!!!" + e.getMessage();
		   	}finally{
		   		// this id set for using in diff servlets for getting employeeid
		   		      String finalid =empBean.getId();
		   		      System.out.println("final id------"+finalid);
		   		      session.setAttribute("finalid", finalid);
		   		     session.setAttribute("otp", userotp);
		   		     session.setAttribute("empEmail", email);
		   		     RequestDispatcher reqdis=request.getRequestDispatcher("loginotp.jsp");
		   		    	reqdis.forward(request, response);
		   	}
	    }
	}

}
