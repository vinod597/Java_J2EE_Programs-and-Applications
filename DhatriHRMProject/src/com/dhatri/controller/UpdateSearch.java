package com.dhatri.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatri.bean.EmpBean;
import com.dhatri.dao.DatabaseOperations;

/**
 * Servlet implementation class UpdateSearch
 */
@WebServlet("/UpdateSearch")
public class UpdateSearch extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		  String email=(String) session.getAttribute("empEmail");
		 
		if(email !=null)
		{
			ArrayList<EmpBean> list= new ArrayList<EmpBean>();
	        DatabaseOperations dao=new DatabaseOperations();
			ArrayList<EmpBean> empList=dao.search3(email);
			session.setAttribute("EmployeeList", empList);
			RequestDispatcher requestDis=request.getRequestDispatcher("UpdateResp.jsp");
			
			requestDis.forward(request, response);
		}
		else{
			RequestDispatcher requestDis=request.getRequestDispatcher("UpdateResp.jsp");
			requestDis.include(request, response);
		}
	}

}
