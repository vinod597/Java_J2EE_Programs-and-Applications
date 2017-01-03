<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<script language="javascript" type="text/javascript">  
var xmlHttp;  
var xmlHttp;
function showResult(updateVariable){
if (typeof XMLHttpRequest != "undefined"){
xmlHttp= new XMLHttpRequest();


}
  else if (window.ActiveXObject){
  xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
  }
  if (xmlHttp==null){
  alert("Browser does not support XMLHTTP Request")
  return;
  } 
  var url="UpdateResp.jsp";
  url +="?updateRes=" +updateVariable;
  xmlHttp.onreadystatechange = stateChange;
  xmlHttp.open("GET", url, true);
  xmlHttp.send();
  }
 function stateChange(){   
  if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
   document.getElementById("result").innerHTML=xmlHttp.responseText; 
   
  }
  }
  </script>
  
<body>
<body bgcolor="pink">
<div align="center">
<table>
<h1></h1>
<a href="Welcome.html">HOME</a>
<h2>Update Employee Details</h2>
<h1></h1>
Employee Id:<input type="text" name="employeeId" onkeyup="showResult(this.value)"></td></tr>

 </table>
 </div>
 <div id="result"></div>
</form>
</body>
</html>