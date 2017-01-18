package com.dhatri.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
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
import com.dhatri.logic.GenerateEmployeeId;
import com.dhatri.mail.SendMail;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get parameters for employee personal details
		String eid=GenerateEmployeeId.getEmployeeId();
		String FirstName=request.getParameter("frist_name");
		String LastName=request.getParameter("last_name");
		String Date_Of_Birth=request.getParameter("date_of_birth");
		String emp_mobile=request.getParameter("mobile");
		System.out.println("jvcasvcj"+emp_mobile);
		String email=request.getParameter("email");
		String emp_altmobile=request.getParameter("alt_mobile");
		String altemail=request.getParameter("alt_email");
		String prsntaddress=request.getParameter("prsnt_address");
		String prmntaddress=request.getParameter("prmnt_address");
		String fathername=request.getParameter("father_name");
		System.out.println(fathername);
		String fatheroccupation=request.getParameter("father_occupation");
		
		long mobile;
		long altmobile;
	     try{
	    	 mobile=Long.parseLong(emp_mobile);
	    	 altmobile=Long.parseLong(emp_altmobile);
	    			 }catch(Exception e){
				mobile=0;
				altmobile=0;
		   }
		//get parameters for employee company details
		//String Id1=request.getParameter("eid");
		String Experiance=request.getParameter("experiance");
		String pastcompany=request.getParameter("past_company");
		String period=request.getParameter("period");
		String dateofjoin=request.getParameter("dateofjoin");
		System.out.println("period-----------"+period);
		String empctc=request.getParameter("ctc");
		String emppastctc=request.getParameter("past_ctc");
		String empadvsal=request.getParameter("adv_sal");
		String advsaldate=request.getParameter("adv_sal_date");
		String advsalterms=request.getParameter("adv_sal_terms");
		String designation=request.getParameter("designation");
		String technology=request.getParameter("technologies");
		System.out.println("kscbiab"+advsalterms);
		String pasthikedate=request.getParameter("past_hike_date");
		
		double empCtc;
		double pastctc;
		double advsal;
	    float exp;
	    float period1;
     try{
    	 exp=Float.parseFloat(Experiance);
    	 period1=Float.parseFloat(period);
    	 empCtc=Double.parseDouble(empctc);
    	 pastctc=Double.parseDouble(emppastctc);
    	 advsal=Double.parseDouble(empadvsal);
	    }catch(Exception e){
	    	period1=0.0f;
			exp=0.0f;
			empCtc=0.0;
			pastctc=0.0;
			advsal=0.0;
	   }
       
     EmpBean empbean=new EmpBean();
     empbean.setId(eid);
     empbean.setFrist_name(FirstName);
     empbean.setLast_name(LastName);
     empbean.setDate_of_birth(Date_Of_Birth);
     empbean.setMobile(mobile);
     empbean.setEmail(email);
     empbean.setAlt_mobile(altmobile);
     empbean.setAlt_email(altemail);
     empbean.setPrsnt_address(prsntaddress);
     empbean.setPrmnt_address(prmntaddress);
     empbean.setFather_name(fathername);
     empbean.setFather_occupation(fatheroccupation);
     
     
     EmpCompany combean=new EmpCompany();
     combean.setId(eid);
     combean.setExperiance(exp);
     combean.setPast_company(pastcompany);
     combean.setPeriod(period1);
     combean.setDate_of_join(dateofjoin);
     combean.setCtc(empCtc);
     combean.setPast_ctc(pastctc);
     combean.setAdv_sal(advsal);
     combean.setAdv_sal_date(advsaldate);
     combean.setAdv_sal_terms(advsalterms);
     combean.setDesignation(designation);
     combean.setTechnologies(technology);
     combean.setPast_hike_date(pasthikedate);
     
     DatabaseOperations dbo = new DatabaseOperations();
     int result=dbo.insertdata(empbean);
     int result1=dbo.insertEmployeeCompany(combean);
     
     HttpSession session=request.getSession();
     session.setAttribute("empid", eid);
     
     try {
		SendMail.sendEmail(empbean);
		
	} catch (AddressException e) {
		
		e.printStackTrace();
	} catch (MessagingException e) {
		
		e.printStackTrace();
	}finally{
     
     RequestDispatcher reqdisp=request.getRequestDispatcher("Adminview.jsp");
     reqdisp.forward(request, response);
		
		
	}

}
}
