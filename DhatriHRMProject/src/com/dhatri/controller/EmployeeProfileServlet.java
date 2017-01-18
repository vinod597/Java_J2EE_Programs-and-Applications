package com.dhatri.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;

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
 * Servlet implementation class EmployeeProfileServlet
 */
@WebServlet("/EmployeeProfileServlet")
public class EmployeeProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	 HttpSession session=request.getSession();
	 
	 String empid=(String)session.getAttribute("finalid");
	 System.out.println("employye id-------------"+empid);
	 //String eid="DS--139";
	 
	 if(empid!=null)
	 {
		 ArrayList<EmpBean> emplist=new ArrayList<EmpBean>();
		 ArrayList<EmpCompany> emplist1=new ArrayList<EmpCompany>();
		 DatabaseOperations dbo=new DatabaseOperations();
		 emplist=dbo.userview(empid);
		 emplist1=dbo.companyView(empid);
		 session.setAttribute("employeebeansearch", emplist);
		 session.setAttribute("employeecompanysearch", emplist1);
		 RequestDispatcher ref1=request.getRequestDispatcher("employeeprofileview.jsp");
		 ref1.forward(request, response);
	 }
	 else
	 {
		 RequestDispatcher ref=request.getRequestDispatcher("EmployeeView.jsp");
		 ref.include(request, response);
		 out.print("Wrong");
	 }
	 
	 
	 
	 LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1993, Month.JANUARY, 1);
		 
		Period period = Period.between(birthday, today);
		 
		//Now access the values as below
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
	}

}
