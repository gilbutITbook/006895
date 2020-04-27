<%@ page language="java" contentType="text/html; charset=UTF-8"
	import=" java.util.*,sec01.ex01.*"
	pageEncoding="UTF-8"
	isELIgnored="false" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("UTF-8");
%>    
<html>
<head>
   <meta  charset="UTF-8">
   <title>회원 정보 출력창</title>
<style>
     .cls1 {
       font-size:40px;
       text-align:center;
     }
    
     .cls2 {
       font-size:20px;
       text-align:center;
     }
  </style>
  
</head>
<body>
 <p class="cls1">회원정보</p>
   <table align="center" border="1" >
      <tr align="center" bgcolor="lightgreen">
         <td width="7%" ><b>아이디</b></td>
         <td width="7%" ><b>비밀번호</b></td>
         <td width="7%" ><b>이름</b></td>
         <td width="7%"><b>이메일</b></td>
         <td width="7%" ><b>가입일</b></td>
   </tr>

<c:choose>
    <c:when test="${ empty membersList}" >
      <tr>
        <td colspan=5 align="center">
          <b>등록된 회원이 없습니다.</b>
       </td>  
      </tr>
   </c:when>  
   <c:when test="${!empty membersList }" >
      <c:forEach  var="mem" items="${membersList }" >
        <tr align="center">
          <td>${mem.id }</td>
          <td>${mem.pwd }</td>
          <td>${mem.name}</td>     
          <td>${mem.email }</td>     
          <td>${mem.joinDate}</td>     
       </tr>
     </c:forEach>
</c:when>
</c:choose>
   </table>  
 <a href="#"><p class="cls2">회원 가입하기</p></a>
</body>
</html>
