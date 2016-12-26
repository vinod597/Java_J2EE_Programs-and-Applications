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
<div align="center">
<h1></h1>
<table>
<tr>
<th>Employee Id |</th> 
<th>Employee Name  |</th> 
<th> Salary  |</th> 
<th> Exp |</th>
<th> Location |</th>
<th>Loan Amount |</th>
<th>Monthly Emi</th>

</tr>



<%
String searchVariable=request.getParameter("searchRes");

if(searchVariable!=null)
{
	
	DatabaseOperations dao=new DatabaseOperations();
	ArrayList<Employee> employeeArray=dao.search(searchVariable);
	
	if(employeeArray!=null)
	{
		Employee employeeBean=null;
		Iterator<Employee> iteratore=employeeArray.iterator();
		 while(iteratore.hasNext())
		 {
			 employeeBean=(Employee)iteratore.next();
		 }
		 
		if(employeeBean!=null)
		{
			%>

			<tr>
			
			<td><%=employeeBean.getEmployeeId() %> |</td> 
			<td><%=employeeBean.getEmployeeName() %> |</td>
			<td><%=employeeBean.getEmployeeSalary() %>|</td>
			<td><%=employeeBean.getExperiance() %> |</td>
			<td><%=employeeBean.getLocation() %> |</td>
			<td><%=employeeBean.getEmploan() %> |</td>
			<td><%=employeeBean.getEmi() %></td>
			
			</tr>
			
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