<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true" %>

<!DOCTYPE html>          
<html>
<head>
   <title>에러 페이지</title>
</head>
<body>
    ====== toString() 내용 ======= <br>
   <h1><%= exception.toString()  %> </h1>
=============== getMessage()내용 ==========<br>
   <h1><%=exception.getMessage()%> </h1>
   ============= printStackTrace() 내용 =======<br>
   <h1><% exception.printStackTrace(); %> </h1>
   <h3>
   숫자만 입력 가능합니다.다시 시도 하세요.
   <a href='add.html'>다시하기</a>
   </h3>
</body>
</html>
