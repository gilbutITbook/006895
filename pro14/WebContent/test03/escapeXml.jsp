<%@ page language="java" contentType="text/html; charset=UTF-8"
     import="java.io.*"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html >
<html>
<head>
<meta charset=”UTF-8">
<title>escapeXml 실습하기</title>
</head>
<body>
<h2>escapeXml 변환하기</h2>
<h2>
<pre>
  <c:out  value="&lt;" escapeXml="true" />
  <c:out  value="&lt;" escapeXml="false" />
 
  <c:out  value="&gt;" escapeXml="true" />
  <c:out  value="&gt;" escapeXml="false" />
 
  <c:out  value="&amp;" escapeXml="true" />
  <c:out  value="&amp;" escapeXml="false" />

<c:out  value="&#039;" escapeXml="true" />
  <c:out  value="&#039;" escapeXml="false" />
 
  <c:out  value="&#034;" escapeXml="true" />
  <c:out  value="&#034;" escapeXml="false" />
</pre>
</h2>
</body>
</html>
