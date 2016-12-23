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
 * Servlet implementation class UpdateSearch
 */
@WebServlet("/UpdateSearch")
public class UpdateSearch extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String employeeId=request.getParameter("employeeId");
		    String employeeName=request.getParameter("employeeName");
		    String employeeSalary=request.getParameter("employeeSalary");
		    String Location=request.getParameter("Location");
		    String experiance=request.getParameter("experiance");
		    String Loan=request.getParameter("Loan");
		    System.out.println(" In Do POst");
		    
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
			
	        DatabaseOperations dao=new DatabaseOperations();
			
			ArrayList<Employee> empList=dao.search(employeeId);
			
			HttpSession session=request.getSession();
			session.setAttribute("EmployeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("UpdateResp.jsp");
			
			requestDis.forward(request, response);
	}

}
