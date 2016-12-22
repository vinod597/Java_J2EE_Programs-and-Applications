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
		
	    String employeeId = request.getParameter("employeeId");
	    String employeeName=request.getParameter("employeeName");
	    String employeeSalary=request.getParameter("employeeSalary");
	    String Location=request.getParameter("Location");
	    String experiance=request.getParameter("experiance");
	    
	    double salary;
	    float exp;
     try{
    	 
	     salary =Double.parseDouble(employeeSalary);
	     exp=Float.parseFloat(experiance);
	    }catch(Exception e){
	    	salary=0.0;
			exp=0.0f;
	   }
	     Employee empBean= new Employee();
	    empBean.setEmployeeId(employeeId);
	    empBean.setEmployeeName(employeeName);
		empBean.setEmployeeSalary(salary);
	    empBean.setLocation(Location);
	   	empBean.setExperiance(exp);
 
	   	DatabaseOperations dbo =new DatabaseOperations();
	   	int result=dbo.insertData(empBean);
	   	
	   	RequestDispatcher requestDispatcher=request.getRequestDispatcher("Success.jsp");
	   	
	   	HttpSession session=request.getSession();
	   	session.setAttribute("employeeId", employeeId);
	   	if(result>0){
	   		requestDispatcher.forward(request, response);
	   	}
	   	
	   	
	   	
	}
	
}
