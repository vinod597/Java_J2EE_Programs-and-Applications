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
    <h1></h1>  
<form action="SearchServlet" method="post">
 <select name="dropdown">
 <option value="id">Id</option>
 <option value="name">Name</option>
 <option value="salary">Salary</option>
 </select>
 <input type="text" name="employee"> 
 <input type="submit" value="Search">
 </form>
 </div>
</body>
</html>