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
    <a href="Adminview.jsp">Go To HomePage</a>
    <h1></h1>  
	<form action="DeleteServlet" method="post">
    Enter Id : <input type="text" placeholder="Enter id" name="empId" required> <input type="submit"  value= "Delete" >
    </form>
</div>
</body>
</html>