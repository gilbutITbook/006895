<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="javax.servlet.RequestDispatcher"
    pageEncoding="UTF-8"
    %>
<%
  request.setAttribute("name","이순신");
  request.setAttribute("address","서울시 강남구"); 
%>       

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 번째 JSP</title>
</head>
<body>

<%
  RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");  
  dispatch.forward(request, response);
%>
</body>
</html>
