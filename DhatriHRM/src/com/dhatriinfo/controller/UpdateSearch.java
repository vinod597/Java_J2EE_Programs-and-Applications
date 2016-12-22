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
			
	        DatabaseOperations dao=new DatabaseOperations();
			
			ArrayList<Employee> empList=dao.search(employeeId);
			
			HttpSession session=request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("UpdateResp.jsp");
			
			requestDis.forward(request, response);
	}

}
