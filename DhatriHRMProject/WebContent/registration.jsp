<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body bgcolor="pink">

		<form action="EmployeeServlet" method="post">
			<h2 align="center" style="color: blue"><a href="Adminview.jsp">Home</a><br> EMPLOYEE DETAILS </h2>
			
	<table align="center">
		<tr>
			<td> FIRST NAME</td>
			<td><input type="text" name="frist_name"></td>
		</tr>
		<tr>
			<td> LAST NAME</td>
			<td><input type="text" name="last_name"></td>
		</tr>
		<tr>
			<td> DATE OF BIRTH </td>
			<td><input type="text" name="date_of_birth"></td>
		</tr>
		<tr>
			<td> MOBILE NUMBER</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td> EMAIL</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td> ALTERNATE MOBILE </td>
			<td><input type="text" name="alt_mobile"></td>
		</tr>
		<tr>
			<td> ALTERNATE EMAIL</td>
			<td><input type="text" name="alt_email"></td>
		</tr>
		<tr>
			<td> PRESENT ADDRESS</td>
			<td><input type="text" name="prsnt_address"></td>
		</tr>
		<tr>
			<td> PERMANENT ADDRESS</td>
			<td><input type="text" name="prmnt_address"></td>
		</tr>
		<tr>
			<td> FATHER NAME</td>
			<td><input type="text" name="father_name"></td>
		</tr>

		<tr>
			<td> FATHER OCCUPATION</td>
			<td><input type="text" name="father_occupation"></td>
		</tr>
	</table>
	<hr>
	<h2 align="center" style="color: blue">EMPPLOYEE COMPANY DETAILS</h2>
	<table align="center">
		<!-- <tr>
			<td>  ID</td>
			<td><input type="text" name="empid"></td>
		</tr> -->
		<tr>
			<td> EXPERIANCE</td>
			<td><input type="text" name="experiance"></td>
		</tr>
		<tr>
			<td> PAST COMPANY NAME</td>
			<td><input type="text" name="past_company"></td>
		</tr>
		<tr>
			<td> PAST COMPANY PERIOD</td>
			<td><input type="text" name="period"></td>
		</tr>
		<tr>
			<td> DATE OF JOINING</td>
			<td><input type="text" name="dateofjoin"></td>
		</tr>
		<tr>
			<td> CURRENT CTC</td>
			<td><input type="text" name="ctc"></td>
		</tr>
		<tr>
			<td> PAST CTC</td>
			<td><input type="text" name="pastctc"></td>
		</tr>
		<tr>
			<td> ADVANCED SALARY</td>
			<td><input type="text" name="adv_sal"></td>
		</tr>
		<tr>
			<td> ADVANCED SALARY DATE</td>
			<td><input type="text" name="adv_sal_date"></td>
		</tr>
		<tr>
			<td> ADVANCED SALARY TERMS</td>
			<td><input type="text" name="adv_sal_terms"></td>
		</tr>
		<tr>
			<td> DESIGNATION</td>
			<td><input type="text" name="designation"></td>
		</tr>
		<tr>
			<td> TECHNOLOGIES</td>
			<td><input type="text" name="technologies"></td>
		</tr>
		<tr>
			<td> PAST HIKE DETAILS</td>
			<td><input type="text" name="past_hike_date"></td>
		</tr>
		<tr>
		<td align="right"><input type="submit" value="Submit" ></td>
        </tr>
	</table>
	</form>
</body>
</html>