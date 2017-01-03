package com.dhatriinfo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatriinfo.bean.Employee;
import com.dhatriinfo.dao.DatabaseOperations;
import com.dhatriinfo.logic.GenerateEmployeeId;
import com.dhatriinfo.mail.SendMail;

/** 
 * Servlet implementation class DataBaseOperations
 */
//@WebServlet("/DataBaseOperations")
public class EmployeeServlet extends HttpServlet {
	
//    public DataBaseOperationsServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		String employeeId=GenerateEmployeeId.getEmployeeId();
	    String employeeName=request.getParameter("employeeName");
	    String employeeSalary=request.getParameter("employeeSalary");
	    String designation=request.getParameter("designation");
	    String Location=request.getParameter("Location");
	    String experiance=request.getParameter("experiance");
	    String email=request.getParameter("email");
	    String cpwd=request.getParameter("cpwd");
	    String empmobile=request.getParameter("mobile");
	    String address=request.getParameter("address");
	    
	    
	    double salary;
	    float exp;
	    long mobile;
     try{
    	 mobile=Long.parseLong(empmobile);
	     salary =Double.parseDouble(employeeSalary);
	     exp=Float.parseFloat(experiance);
	    }catch(Exception e){
	    	salary=0.0;
			exp=0.0f;
			mobile=0;
	   }
	     Employee empBean= new Employee();
	    empBean.setEmployeeId(employeeId);
	    empBean.setEmployeeName(employeeName);
	    empBean.setDesignation(designation);
	    empBean.setMobile(mobile);
		empBean.setEmail(email);
		empBean.setPassword(cpwd);
		empBean.setEmployeeSalary(salary);
	    empBean.setLocation(Location);
	   	empBean.setExperiance(exp);
	   	empBean.setAddress(address);
	   
	   	DatabaseOperations dbo =new DatabaseOperations();
	   	int result=dbo.insertData(empBean);
	   	String resultMessage = "";
	   	try{
	   		SendMail.sendEmail(empBean);
	   		resultMessage = "Thank's for your enroll, please check your mail once ";
	   		
	   	}catch(Exception e){
	   		
	   		resultMessage= "error" + e.getMessage();
	   	}finally{
	   		     session.setAttribute("Message", resultMessage);
	   		     getServletContext().getRequestDispatcher("/EmailSucess.jsp").forward(request, response);
	   	}
	   	
	   /*	RequestDispatcher requestDispatcher=request.getRequestDispatcher("Success.jsp");
	   	
	 //  	HttpSession session=request.getSession();
	   	session.setAttribute("employeeId", employeeId);
	   	if(result>0){
	   		requestDispatcher.forward(request, response);
	   	}
	   */	
	   	
	   	
	}
	
}
