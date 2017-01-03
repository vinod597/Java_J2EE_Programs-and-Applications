package com.dhatriinfo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.dao.DatabaseOperations;
import com.dhatriinfo.logic.GenerateOtp;
import com.dhatriinfo.mail.SendMail;
import com.dhatriinfo.mail.SendMailOtp;
import com.sun.org.apache.bcel.internal.generic.CPInstruction;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		HttpSession session =request.getSession();
		String email=request.getParameter("email");
		String pwd = request.getParameter("pwd");
	   System.out.println("After the parameters");
	   System.out.println(email);
	   System.out.println(pwd);
	   
	    DatabaseOperations dbo= new DatabaseOperations();
	  ArrayList<Employee> empList = dbo.search3(email);
	    System.out.println(empList);
	    session.setAttribute("employeelist",empList);
	    Object obj =session.getAttribute("employeelist");
	    
	    ArrayList<Employee> employeeist=(ArrayList)obj; 
	    Iterator iterator =employeeist.iterator();
	    
	    Employee empBean=null;
	    while(iterator.hasNext())
	    {
	    	empBean=(Employee)iterator.next();
	    }
	    
	    String userotp=GenerateOtp.getEmployeeOtp();
	    if(email.equals(empBean.getEmail()) && pwd.equals(empBean.getPassword()))
	    {
	    	String resultMessage="";
	    	
	    	try{
		   		SendMailOtp.sendEmail(email,userotp);
		   		resultMessage = "Thank's for your enroll, please check your mail once ";
		   		
		   	}catch(Exception e){
		   		
		   		resultMessage= "error !!!!" + e.getMessage();
		   	}finally{
		   		     session.setAttribute("otp", userotp);
		   		     RequestDispatcher reqdis=request.getRequestDispatcher("loginotp.jsp");
		   		    	reqdis.forward(request, response);
		   	}
	    }
	}

}
