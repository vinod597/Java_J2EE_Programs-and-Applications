<%@page import="java.util.Iterator"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body >
   <h1></h1>  

  <div align="center">
    <a href="Welcome.html">Go To HomePage</a>
		<%
			Object obj = session.getAttribute("employeeList");

			if (obj != null) {
				
		%>
		<table align="center" cellspacing="0" cellpadding="8" borders="1" width="40%">
			<tr>
				<th>Id |</th> 
				<th>Name |</th> 
				<th>Salary |</th>
				<th>Experiance |</th> 
				<th>Location |</th> 
				<th>Loan</th> 
		
			</tr>
			
			<%
				ArrayList<Employee> employeeList = (ArrayList) obj;
					Iterator iterator = employeeList.iterator();
					Employee employeebean = null;
					while (iterator.hasNext()) {
						employeebean = (Employee) iterator.next();
			%>
			<tr>
				<td><%=employeebean.getEmployeeId()%></td>
				<td><%=employeebean.getEmployeeName()%></td>
				<td><%=employeebean.getEmployeeSalary()%></td>
				<td><%=employeebean.getExperiance()%></td>
				<td><%=employeebean.getLocation()%></td>
				<td><%=employeebean.getEmploan()%>

			</tr>

			<%
				}
				session.removeAttribute("employeeList");
				} else if(obj == null) {
					out.print("No Data");
				}
			%>
		</table>

	</div>

</body>
</html>