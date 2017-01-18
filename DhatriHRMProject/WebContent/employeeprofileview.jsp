 <%@page import="java.util.Iterator"%>
<%@page import="com.dhatri.bean.EmpBean"%>
<%@page import="com.dhatri.bean.EmpCompany"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee Details</title>
</head>
<body align="center">

<div align="center">
<h2>View </h2>
</div>

<%
Object obj=session.getAttribute("employeebeansearch");
if(obj!=null)
{

	ArrayList<EmpBean> employeeList=(ArrayList)obj;
	Iterator iterator=employeeList.iterator();
	
	EmpBean employeebean=null;
	while(iterator.hasNext())
	{
		employeebean=(EmpBean)iterator.next();
		//companybean=(EmployeeCompanyBean)iterator.next();
		%>
	
<table align="center">

<tr>
<td>Id:</td>
<td><input type="text" value="<%= employeebean.getId() %>" name="eid" readonly/></td>
</tr>

<tr>
<td>FirstName:</td>
<td><input type="text" value="<%= employeebean.getFrist_name() %>" name="empfirstname" readonly/></td>
</tr>

<tr>
<td>Last Name:</td>
<td><input type="text" value="<%= employeebean.getLast_name() %>" name="emplastname" readonly/></td>
</tr>

<tr>
<td>DOB:</td>
<td><input type="text" value="<%= employeebean.getDate_of_birth() %>" name="empdob" readonly/></td>
</tr>

<tr><td>Mobile No:</td>
<td><input type="text" value="<%= employeebean.getMobile() %>" name="empmobileno" readonly/></td>
</tr>

<tr><td>Mailid:</td>
<td><input type="text" value="<%= employeebean.getEmail() %>" name="empmailid" readonly/></td>
</tr>
		
<tr>
<td>Alternate Mobile Number:</td>
<td><input type="text" value="<%= employeebean.getAlt_mobile() %>" name="empaltermobileno" readonly/></td>
</tr>

<tr>
<td>Alternate EmailId:</td>
<td><input type="text" value="<%= employeebean.getAlt_email() %>" name="empaltermailid" readonly/></td>
</tr>

<tr>
<td>Present Address:</td>
<td><input type="text" value="<%= employeebean.getPrsnt_address() %>" name="empprsentaddress" readonly/></td>
</tr>

<tr>
<td>Permanent Address:</td>
<td><input type="text" value="<%= employeebean.getPrmnt_address() %>" name="emppermanentaddress" readonly/></td>
</tr>

<tr><td>Father Name:</td>
<td><input type="text" value="<%= employeebean.getFather_name() %>" name="empfathername" readonly/></td>
</tr>

<tr><td>Father Occupation:</td>
<td><input type="text" value="<%= employeebean.getFather_occupation() %>" name="empfatheroccupation" readonly/></td>
</tr>
		</table>
	<%	
	}
	session.removeAttribute("employeebeansearch");
	
}
else
	
{
	out.print("No Data");
}
%>
<hr>

<%

Object obj1=session.getAttribute("employeecompanysearch");
if(obj1!=null)
{
	ArrayList<EmpCompany> employeeList1=(ArrayList)obj1;
	Iterator iterator=employeeList1.iterator();
	
	EmpCompany companybean=null;
	while(iterator.hasNext())
	{
		companybean=(EmpCompany)iterator.next();
		%>
	
<table align="center">

<tr>
<td>Experience:</td>
<td><input type="text" value="<%= companybean.getExperiance()%>" name="empexp" readonly/></td>
</tr>

<tr>
<td>PastCompany Name:</td>
<td><input type="text" value="<%= companybean.getPast_company()%>" name="emppastcompanyname" readonly/></td>
</tr>

<tr>
<td>PastCompany Period:</td>
<td><input type="text" value="<%= companybean.getPeriod()%>" name="emppastcompanyperiod" readonly/></td>
</tr>

<tr><td>DOJ:</td>
<td><input type="text" value="<%= companybean.getDate_of_join()%>" name="empdoj" readonly/></td>
</tr>

<tr>
<td>Current CTC:</td>
<td><input type="text" value="<%= companybean.getCtc()%>" name="empcctc" readonly/></td>
</tr>

<tr>
<td>Past CTC:</td>
<td><input type="text" value="<%= companybean.getPast_ctc()%>" name="emppctc" readonly/></td>
</tr>
<tr>
<td>Advance Salary:</td>
<td><input type="text" value="<%= companybean.getAdv_sal()%>" name="empadvsal" readonly/></td>
</tr>

<tr>
<td>Advance Salary Date:</td>
<td><input type="text" value="<%= companybean.getAdv_sal_date()%>" name="empadvsaldate" readonly/></td>
</tr>
<tr>
<td>Advance Salary Terms:</td>
<td><input type="text" value="<%= companybean.getAdv_sal_terms()%>" name="empadvsalterms" readonly/></td>
</tr>

<tr><td>Designation:</td>
<td><input type="text" value="<%= companybean.getDesignation() %>" name="empdesignation" readonly/></td>
</tr>
		
<tr>
<td>Technology:</td>
<td><input type="text" value="<%= companybean.getTechnologies() %>" name="emptechnology" readonly/></td>
</tr>

<tr>
<td>PastHike Details:</td>
<td><input type="text" value="<%= companybean.getPast_hike_date()%>" name="emppasthikedate" readonly/></td>
</tr>
</table>
			<%	
	}
	session.removeAttribute("employeecompanysearch");
	
}
else
	
{
	out.print("No Data");
}
%>
</body>
</html>