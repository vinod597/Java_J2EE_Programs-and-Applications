package com.dhatri.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dhatri.bean.EmpBean;
import com.dhatri.mail.SendMailUrl;
import com.dhatri.mail.SendMailOtp;

/**
 * Servlet implementation class EmpUpdateServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empId = request.getParameter("empId");
	    String emp_f_Name=request.getParameter("frist_name");
	    String emp_l_Name=request.getParameter("last_name");
	    String emp_dob=request.getParameter("date_of_birth");
	    String emp_mob=request.getParameter("mobile");
	    String emp_email = request.getParameter("email");
	    String emp_alt_mbl=request.getParameter("alt_mobile");
	    String emp_alt_email=request.getParameter("alt_email");
	    String emp_prsnt_adrs=request.getParameter("prsnt_address");
	    String emp_prmnt_adrs=request.getParameter("prmnt_address");
	    String emp_father_name=request.getParameter("father_name");
	    String emp_father_occu=request.getParameter("father_occupation");
	    
	    long mobile;
		long altmobile;
	     try{
	    	 mobile=Long.parseLong(emp_mob);
	    	 altmobile=Long.parseLong(emp_alt_mbl);
	    			 }catch(Exception e){
				mobile=0;
				altmobile=0;
		   }
	     
	     EmpBean empbean=new EmpBean();
	     empbean.setId(empId);
	     empbean.setFrist_name(emp_f_Name);
	     empbean.setLast_name(emp_l_Name);
	     empbean.setDate_of_birth(emp_dob);
	     empbean.setMobile(mobile);
	     empbean.setEmail(emp_email);
	     empbean.setAlt_mobile(altmobile);
	     empbean.setAlt_email(emp_alt_email);
	     empbean.setPrsnt_address(emp_prsnt_adrs);
	     empbean.setPrmnt_address(emp_prmnt_adrs);
	     empbean.setFather_name(emp_father_name);
	     empbean.setFather_occupation(emp_father_occu);
	    
	     HttpSession session=request.getSession();
	     session.setAttribute("adminbean", empbean);
	     
	     String resultMessage="";
	    	
	    	try{
		   		SendMailUrl.sendEmail(empbean);
		   		resultMessage = "Thank you, Confirmation will be done by admin";
		   		
		   	}catch(Exception e){
		   		
		   		resultMessage= "error !!!!" + e.getMessage();
		   	}finally{
		   		     RequestDispatcher reqdis=request.getRequestDispatcher("EmployeeView.jsp");
		   		    	reqdis.forward(request, response);
		   	}
	    
	}

}
