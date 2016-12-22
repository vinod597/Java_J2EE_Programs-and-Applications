package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sample
 */
// @WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("userValue", userName);
		PrintWriter out = response.getWriter();
		out.print("Username =" + userName);
		out.print("<html><body>");
		out.print("<form action='SecondSampleServlet' method='post'" + ">");
		out.print("<input type='submit' value='Go'>");
		out.print("</form></body></html>");

	}

}
