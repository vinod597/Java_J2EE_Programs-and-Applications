package com.dhatriinfo.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String employeeId = request.getParameter("employeeId");
		
		Employee empBean= new Employee();
		 empBean.setEmployeeId(employeeId);
	   
		DatabaseOperations dbo =new DatabaseOperations();
	   int result= dbo.delete(empBean);
	   
 
	   HttpSession session=request.getSession();
	   session.setAttribute("employeeId",employeeId);
	   session.setAttribute("empId", empBean.getEmployeeId());
	   
	   RequestDispatcher requestdispatcher=request.getRequestDispatcher("DeleteSucess.jsp");
	   
		   requestdispatcher.forward(request, response);
	   }
	}
