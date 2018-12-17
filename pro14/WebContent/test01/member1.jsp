<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
   String id=request.getParameter("id");
   String pwd=request.getParameter("pwd");
   String name= request.getParameter("name");
   String email= request.getParameter("email");
  
%>   
<html>
<head>
<meta charset=”UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
      <td width="20%"><b>아이디</b></td>
      <td width="20%"><b>비밀번호</b></td>
      <td width="20%" ><b>이름</b></td>
      <td width="20%"><b>이메일</b></td>
   </tr>
   <tr align=center>
      <td><%=id %> </td>
      <td><%=pwd%> </td>
      <td><%=name %> </td>
      <td><%=email %> </td>
   </tr>   
   <tr align=center>
      <td>${param.id } </td>
      <td>${param.pwd } </td>
      <td>${param.name } </td>
      <td>${param.email }</td>
   </tr>
</table>
</body>
</html>
