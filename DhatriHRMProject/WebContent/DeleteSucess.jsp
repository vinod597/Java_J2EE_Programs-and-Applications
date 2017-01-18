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
<h3>
<%
String employeeId=(String)session.getAttribute("employeeId");
//String empId=(String)session.getAttribute("empId");
if(employeeId !=null){
out.print("Employee deleted Sucessfully : " +employeeId);
}else {
   out.print("No Data");
}
%>
<div align="center">
    <a href="Adminview.jsp">Go To HomePage</a>
    </div>
</body>
</html>