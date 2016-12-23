<%@page import="com.dhatriinfo.dao.DatabaseOperations"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Applied For Loan</title>
</head>
<body>
<h1></h1>
<div align="center">

<%

Object obj=session.getAttribute("employeeList");
DatabaseOperations dbo=new DatabaseOperations();
//String empid=(String)session.getAttribute("tempid");
//out.print("Applied Employee Id for loan" );

Employee emp=null;
if(obj!=null)
{
	%>
	<table>
	<tr>
	<th>Employee Id |</th>
	<th>Employee Loan |</th>
	<th>Employee EMI</th>
	</tr>
	<%
	ArrayList<Employee> empList=(ArrayList)obj;
	Iterator it=empList.iterator();	
	while(it.hasNext())
	{
		emp=(Employee)it.next();
		
	%>
		<tr>
		<td><%=emp.getEmployeeId() %></td>
		<td><%=emp.getEmploan() %></td>
		<td><%=emp.getEmi() %></td>
		</tr>
		<%
	}
	session.removeAttribute("empList");
}
else
{
	out.print("no data");
}
%>

</table>
<form action="LoanServletUpdate" method="post">
 <input type="text" value="<%=emp.getEmployeeId()%>" name="employeeId" readonly/>
  <input type="submit" value="Proceed"/>
  </form>
<a href="Welcome.html">Go To HomePage</a>
</div>
</body>
</html>