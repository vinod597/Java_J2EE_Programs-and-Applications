<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

	<script type="text/javascript">
		function validation() {
			var Pwd = document.getElementById("pwd").value;
			var Cpwd = document.getElementById("cpwd").value;

			if (Pwd != Cpwd) {
				//alert("please enter employee Id");
				document.getElementById("error").innerHTML = "password doesn't matched";
				return false;
			} else
				return true;

		}

		function clearField() {
			document.getElementById("error").innerHTML = " ";
		}
	</script>
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
			<!-- <tr><td>Id:</td><td align="center"><input type="text" id="employeeId" name="employeeId" onkeypress="return clearField()" placeholder="Enter first name" ></td></tr> -->
			<tr>
				<td>Name:</td>
				<td align="center"><input type="text" id="employeeName"
					name="employeeName" placeholder="Enter first name"></td>
			</tr>
			<tr>
				<td>Designation:</td>
				<td align="center"><input type="text" id="designation"
					name="designation" placeholder="Enter designation"></td>
			</tr>
		
			<tr>
				<td>Mobile:</td>
				<td align="center"><input type="tel" id="mobile"
					name="mobile" placeholder="Enter 10 digit mobile no"></td>
			</tr>
			<tr>
				<td>E-Mail:</td>
				<td align="center"><input type="email" id="email"
					name="email" placeholder="Enter email"></td>
			</tr>
			<tr>
				<td>Create Password:</td>
				<td align="center"><input type="password" id="pwd"
					name="pwd" placeholder="Enter the password" onkeypress="return clearField()" /></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td align="center"><input type="password" id="cpwd"
					name="cpwd" placeholder="Confirm the password" onkeypress="return clearField()" /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td align="center"><input type="text" id="employeeSalary"
					name="employeeSalary" placeholder="Enter salary"></td>
			</tr>
			<tr>
				<td>Location:</td>
				<td align="center"><input type="text" id="Location"
					name="Location" placeholder="Enter location"></td>
			</tr>
			<tr>
				<td>Experiance:</td>
				<td align="center"><input type="text" id="experiance"
					name="experiance" placeholder="Enter experiance"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td align="center"><input type="text" id="address"
					name="address" placeholder="Enter Address"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Register" onclick="return validation()"></td>
			</tr>
		</table>
	</form>
</body>
</html>