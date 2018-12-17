<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  
    errorPage="addException.jsp" %> 
<% 
   int num = Integer.parseInt(request.getParameter("num"));
   int sum=0;
   for(int i =1 ; i<= num ; i++){
      sum = sum + i;
   }
%>

<!DOCTYPE html>          
<html>
<head>
    <title>합계 구하기</title>
</head>
<body>
<h2>합계 구하기</h2>
<h1>1부터 <%=num  %>까지의 합은 <%=sum  %>입니다</h1>
</body>
</html>
