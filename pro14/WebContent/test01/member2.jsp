<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
   request.setCharacterEncoding("UTF-8");
%>   
<html>
<head>
<meta charset=”UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border="1"   align="center">
    <tr align="center" bgcolor="#99ccff">
       <td width="20%"><b>아이디</b></td>
       <td width="20%"><b>비밀번호</b></td>
       <td width="20%" ><b>이름</b></td>
       <td width="20%"><b>이메일</b></td>
       <td width="20%" ><b>주소</b></td>
    </tr>
<tr align=center>
       <td>${param.id } </td>
       <td>${param.pwd} </td>
       <td>${param.name } </td>
       <td>${param.email }</td>
       <td>${requestScope.address}</td>
   </tr>
</table>
</body>
</html>
