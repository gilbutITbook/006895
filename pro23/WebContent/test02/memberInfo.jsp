<%@ page language="java" contentType="text/html; charset=UTF-8"
import="java.io.*,java.util.*"
pageEncoding="UTF-8"
isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<meta charset=UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<table border=1 align="center" width="100%" >
   <tr align="center"   bgcolor="lightgreen">
      <td ><b>아이디</b></td>
      <td><b>비밀번호</b></td>
      <td><b>이름</b></td>
      <td><b>이메일</b></td>
      <td><b>가입일</b></td>
   </tr>
   <tr align="center">
      <td>${member.id} </td>
      <td>${member.pwd} </td>
      <td>${member.name} </td>
      <td>${member.email} </td>
      <td>${member.joinDate}</td>
    </tr>
</table>
</body>
</html>
