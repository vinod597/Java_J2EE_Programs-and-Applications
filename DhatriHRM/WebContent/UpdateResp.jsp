<%@page import="java.util.Iterator"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.dao.DatabaseOperations"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String updateVariable=request.getParameter("updateRes");

if(updateVariable!=null)
{
	
	DatabaseOperations dao=new DatabaseOperations();
	ArrayList<Employee> employeeArray=dao.search(updateVariable);
	
	if(employeeArray!=null)
	{
		Employee empBean=null;
		Iterator<Employee> iteratore=employeeArray.iterator();
		 while(iteratore.hasNext())
		 {
			 empBean=(Employee)iteratore.next();
		 }
		 
		if(empBean!=null)
		{
			%>
<form action="UpdateServlet" method="post">
<table align="center" cellspacing="0" cellpadding="8" borders="1" width="40%">
<tr><td colspan="2" align="center"><h2>Update Employee Details</h2></td></tr>
<tr><td>Id:</td><td align="center"><input type="text" name="employeeId" value=<%=empBean.getEmployeeId()%> readonly></td></tr>
<tr><td>Name:</td><td align="center"><input type="text" name="employeeName" value=<%=empBean.getEmployeeName()%>></td></tr>
<tr><td>Salary:</td><td align="center"><input type="text" name="employeeSalary" value=<%=empBean.getEmployeeSalary()%>></td></tr>
<tr><td>Experience:</td><td align="center"><input type="text" name="experiance" value=<%=empBean.getExperiance()%>></td></tr>
<tr><td>Location:</td><td align="center"><input type="text" name="Location" value=<%=empBean.getLocation()%>></td></tr>
<tr><td colspan="2" align="right">
  <input type="submit" value="Update"/></td></tr>
  </table>
</form>
			
			<%
		}
		else
		{
			out.println("Id Not Found");
		}
		
	}
	else
	{
		out.println("No Data Fuond");
	}
	
}

%>
</table>

</div>

</body>
</html>