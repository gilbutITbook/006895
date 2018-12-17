<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  request.setCharacterEncoding("utf-8");
  int score=Integer.parseInt(request.getParameter("score"));
%> 

<!DOCTYPE html>
<html>
<head>
<title>점수 출력창</title>
<meta charset="UTF-8">
</head>
<body>
<h1>시험점수  <%=score %>점</h1><br>
<%
 if(score>=90){
%>
   <h1>A학점입니다.</h1>
<%
 }else if(score>=80 && score<90){
%>
    <h1> B학점입니다.</h1>
<%
   }else if(score>=70 && score<80){
%>
   <h1> C학점입니다.</h1>
<%
   }else if(score>=60 && score<70){
%>
   <h1> D학점입니다.</h1>
<%
   }else{
%>
   <h1> F학점입니다.</h1>
<%
   }
%>
<br>
<a href="scoreTest.html">시험점수입력</a>
</body>
</html>
