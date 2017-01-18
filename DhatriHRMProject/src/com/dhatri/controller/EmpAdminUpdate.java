package com.dhatri.controller;

import java.io.IOException;

import javax.mail.Session;
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
 * Servlet implementation class EmpAdminUpdate
 */
@WebServlet("/EmpAdminUpdate")
public class EmpAdminUpdate extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		EmpBean bean=(EmpBean)session.getAttribute("adminbean");
		
		DatabaseOperations dbo=new DatabaseOperations();
		int result=dbo.updateData(bean);
		
		RequestDispatcher reqdisp=request.getRequestDispatcher("Adminview.jsp");
		reqdisp.forward(request, response);
		
	}

}
