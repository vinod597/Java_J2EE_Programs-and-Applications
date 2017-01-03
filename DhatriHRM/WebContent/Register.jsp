<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dhatriHrm" method="post">
		<h1></h1>
		<div align="center">
			<a href="Welcome.html">HOME</a>
		</div>
		<table align="center" cellspacing="0" cellpadding="8" borders="1"
			width="40%">
			<tr>
				<td colspan="2" align="center"><h2>Enter Details</h2></td>
			</tr>
			<tr>
				<td>E-Mail:</td>
				<td align="center"><input type="email" id="email"
					name="email" placeholder="Enter email"></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td align="center"><input type="text" id="username"
					name="uname" placeholder="Enter user name"></td>
			</tr>
			<tr>
				<td>Create Password:</td>
				<td align="center"><input type="password" id="pwd"
					name="pwd" placeholder="Rememmber the password"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="button"
					value="Register" onclick="return validation()"></td>
			</tr>
</table>
</form>
</body>
</html>