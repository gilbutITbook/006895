<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
  request.setAttribute("id","hong");
  request.setAttribute("pwd", "1234");
  session.setAttribute("name", "홍길동");
  application.setAttribute("email", "hong@test.com");
  //request.setAttribute("address","서울시 강남구");
%>    

<html>
<head>
<meta  charset=”UTF-8">
<title>forward2</title>
</head>
<body>
   <jsp:forward page="member4.jsp" />
</html>