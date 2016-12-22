package com.dhatriinfo.controller;

import java.io.IOException;
import java.util.ArrayList;

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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String employeeId = request.getParameter("employeeId");
		    String employeeName=request.getParameter("employeeName");
		    String employeeSalary=request.getParameter("employeeSalary");
		    String Location=request.getParameter("Location");
		    String experiance=request.getParameter("experiance");
		    String Loan=request.getParameter("Loan");
		    System.out.println("Do POst");
		    
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
		   	 int result=	dbo.updateData(empBean);
		   	 // ArrayList<Employee> list=dbo.search(employeeId);
		   
			HttpSession session=request.getSession();
		  	session.setAttribute("employeeId", employeeId);
		  // 	session.setAttribute("EmployeeList", list);
		   //	System.out.println("before request dispatcher");
		   RequestDispatcher requestDispatcher=request.getRequestDispatcher("Success.jsp");
		 //  System.out.println("after request dispatcher"+employeeId);
		   	
		   		requestDispatcher.forward(request, response);
		   }
	
	}
	
