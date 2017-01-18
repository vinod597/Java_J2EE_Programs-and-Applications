package com.dhatri.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatri.bean.EmpBean;
import com.dhatri.bean.EmpCompany;
import com.dhatri.dao.DatabaseOperations;

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
		String empId = request.getParameter("empId");
		
		EmpBean empBean= new EmpBean();
		 empBean.setId(empId);
		EmpCompany comBean= new EmpCompany();
		comBean.setId(empId);
	   
		DatabaseOperations dbo =new DatabaseOperations();
	   int result= dbo.delete(comBean,empBean);
	   
 
	   HttpSession session=request.getSession();
	   session.setAttribute("employeeId",empId);
	   session.setAttribute("empId", empBean.getId());
	   
	   RequestDispatcher requestdispatcher=request.getRequestDispatcher("DeleteSucess.jsp");
	   
		   requestdispatcher.forward(request, response);
	   }
	}
