<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="com.dhatriinfo.dao.DatabaseOperations" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update employee</title>
</head>
<body bgcolor="pink" >
<div align="center">
<h2>Update Employee Details</h2>
<form action="UpdateSearch" method="post">
<input type="text" name="employeeId" placeholder="Enter id"/>
  <input type="submit" value="submit"/><br><br>
  <hr>
</form>
</div>
<%
Employee empBean = null;
Object obj=session.getAttribute("EmployeeList");
if(obj!=null)
{
ArrayList<Employee> al= (ArrayList)obj;
Iterator<Employee> it= al.iterator();
while (it.hasNext()) 
{
	empBean = (Employee)it.next();
//Employee empBean= new Employee();


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
session.removeAttribute("EmployeeList");
}else{
	
}
%>

</body>
</html>