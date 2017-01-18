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
<h1> <font color="#00008B"> DhatriInfo Solutions </font></h1>
<div>
<br>
<form action="AdminServlet" method="post">
  <div class="container" align="center">
  <table>
 <pre>
    <b>Admin Id:<input type="text" placeholder="Enter Admin email" name="adminmail" required></b><br>
    <b>Password :<input type="password" placeholder="Enter Password" name="pwd" required></b>

  <button type="submit">Login</button></a>
    <input type="checkbox" checked="checked"> Remember me
    </pre>
    </table>
   </div>
</form>
</div>
</body>
</html>