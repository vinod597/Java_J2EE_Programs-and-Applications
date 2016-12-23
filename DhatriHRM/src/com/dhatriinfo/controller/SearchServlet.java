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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       String emp=request.getParameter("employee");
		String id = request.getParameter("dropdown");
		
	if (id.equals("id")) {
			//String employeeId = request.getParameter("id");
			DatabaseOperations dao = new DatabaseOperations();

			ArrayList<Employee> empList = dao.search(emp);
			HttpSession session = request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis = request
					.getRequestDispatcher("SearchResult.jsp");
    	requestDis.forward(request, response);
		}

		else if (id.equals("name")) {
	//		String employeeName = request.getParameter("name");

			DatabaseOperations dao = new DatabaseOperations();

			ArrayList<Employee> empList = dao.search1(emp);

			HttpSession session = request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis = request
					.getRequestDispatcher("SearchResult.jsp");

			requestDis.forward(request, response);

		} else if (id.equals("salary")) {
		//	String employeeSalary = request.getParameter("salary");
			double Salary;
			try {
				Salary = Double.parseDouble(emp);
			} catch (Exception e) {
				Salary = 0.0;
			}

			DatabaseOperations dao = new DatabaseOperations();
			ArrayList<Employee> empList = dao.search2(Salary);
			HttpSession session = request.getSession();
			session.setAttribute("employeeList", empList);
			RequestDispatcher requestDis = request
					.getRequestDispatcher("SearchResult.jsp");

			requestDis.forward(request, response);
		}
	}
}
