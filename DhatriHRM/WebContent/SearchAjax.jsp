<%@page import="java.util.Iterator"%>
<%@page import="com.dhatriinfo.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dhatriinfo.dao.DatabaseOperations"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script language="javascript" type="text/javascript">  
var xmlHttp;  
var xmlHttp;
function showResult(searchVariable){
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
  var url="SearchResult.jsp";
  url +="?searchRes=" +searchVariable;
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
<h1></h1>
<div align="center">
Enter Id <input type="text" name="search" onkeyup="showResult(this.value)"> 

</div>
<div id="result"></div>


</body>
</html>