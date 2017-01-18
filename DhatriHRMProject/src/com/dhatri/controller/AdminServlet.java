package com.dhatri.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String admin=request.getParameter("adminmail");
		String pwd=request.getParameter("pwd");
		
		RequestDispatcher reqdispatcher1=request.getRequestDispatcher("Adminview.jsp");
		RequestDispatcher reqdispatcher=request.getRequestDispatcher("Admin.jsp");
		
	if(admin.equals("vinod.dhatriinfo@gmail.com")&& pwd.equals("vinod123")){
			reqdispatcher1.forward(request, response);
			
		}else{
			reqdispatcher.include(request, response);
		}
	}

}
