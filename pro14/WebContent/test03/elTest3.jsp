<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<html>
<head>
<meta charset=”UTF-8">
<title>표현언어의 여러 가지 연산자들</title>
</head>
<body>

<h2>여러 가지 비교 연산자</h2>
<h3>
    \${10==10}  : ${10==10} <br>
    \${10 eq 10}  : ${10 eq 10} <br><br>
    \${"hello"=="hello"}  : ${"hello"=="hello"} <br>
    \${"hello" eq "hello"}  : ${"hello" eq "hello"} <br><br>
<%-- 
    \${20!=10}  : ${20!=10}<br>
    \${20 ne 10}  : ${20 ne 10}<br><br>

    \${"hello"!="apple"}  : ${"hello"!="apple"} <br>
    \${"hello" ne "apple"}  : ${"hello" ne "apple"} <br><br>
 --%>
    \${10 < 10}  : ${10< 10} <br>
    \${10 lt 10}  : ${10 lt 10} <br><br>

    \${100>10} : ${100>10}<br>
    \${100 gt 10} : ${100 gt 10}<br><br>

    \${100 <=10} : ${100 <=10}<br>
    \${100 le 10} : ${100 le 10}<br><br>

    \${100 >=10} : ${100 >=10}<br>
    \${100 ge 10} : ${100 ge 10}<br><br>
</h3>
</body>
</html>
