<%@page import="java.util.Iterator"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatri.bean.EmpBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatri.dao.DatabaseOperations"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object obj=session.getAttribute("EmployeeList");

if(obj!=null)
{
	ArrayList<EmpBean> emplist= (ArrayList)obj;
		Iterator<EmpBean> iteratore=emplist.iterator();
		EmpBean empBean=null;
		 while(iteratore.hasNext())
		 {
			 empBean=(EmpBean)iteratore.next();
			%>
<form action="EmpUpdateServlet" method="post">
<table align="center" cellspacing="0" cellpadding="8" borders="1" width="40%">
<tr><td colspan="2" align="center"><h2>Update Employee Details</h2></td></tr>
<tr><td>EMPLOYEE ID</td><td align="center"><input type="text" name="empId" value=<%=empBean.getId()%> readonly></td></tr>
<tr><td>FIRST NAME:</td><td align="center"><input type="text" name="frist_name" value=<%=empBean.getFrist_name()%>></td></tr>
<tr><td>LAST NAME:</td><td align="center"><input type="text" name="last_name" value=<%=empBean.getLast_name()%>></td></tr>
<tr><td>DATE OF BIRTH:</td><td align="center"><input type="text" name="date_of_birth" value=<%=empBean.getDate_of_birth()%>></td></tr>
<tr><td>MOBILE NUMBER:</td><td align="center"><input type="text" name="mobile" value=<%=empBean.getMobile()%>></td></tr>
<tr><td>EMAIL:</td><td align="center"><input type="text" name="email" value=<%=empBean.getEmail()%>></td></tr>
<tr><td>ALTERNATE MOBILE:</td><td align="center"><input type="text" name="alt_mobile" value=<%=empBean.getAlt_mobile()%>></td></tr>
<tr><td>ALTERNATE EMAIL:</td><td align="center"><input type="text" name="alt_email" value=<%=empBean.getAlt_email()%>></td></tr>
<tr><td>PRESENT ADDRESS:</td><td align="center"><input type="text" name="prsnt_address" value=<%=empBean.getPrsnt_address()%>></td></tr>
<tr><td>PERMANENT ADDRESS:</td><td align="center"><input type="text" name="prmnt_address" value=<%=empBean.getPrmnt_address()%>></td></tr>
<tr><td>FATHER NAME:</td><td align="center"><input type="text" name="father_name" value=<%=empBean.getFather_name()%>></td></tr>
<tr><td>FATHER OCCUPATION:</td><td align="center"><input type="text" name="father_occupation" value=<%=empBean.getFather_occupation()%>></td></tr>
<tr><td colspan="2" align="right">
  <input type="submit" value="Update"/></td></tr>
  </table>
</form>
			
			<%
		}
		session.removeAttribute("EmployeeList");
		
	}
	else
	{
		out.println("No Data Found");
	}

%>
</table>

</div>

</body>
</html>