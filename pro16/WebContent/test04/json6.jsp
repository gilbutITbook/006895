<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"  /> 
<!DOCTYPE html>
<html>
<head>
  <title>JSON 테스트</title>
  <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
  <script>
    $(function() {
        $("#checkJson").click(function() {
    	$.ajax({
            type:"post",
            async:false, 
            url:"${contextPath}/json2",
            success:function (data,textStatus){
            	var jsonInfo = JSON.parse(data);
            	var memberInfo ="회원 정보<br>";
	        memberInfo += "=======<br>";
	        for(var i in jsonInfo.members){
		   memberInfo += "이름: " + jsonInfo.members[i].name+"<br>";
		   memberInfo += "나이: " + jsonInfo.members[i].age+"<br>";
		   memberInfo += "성별: " + jsonInfo.members[i].gender+"<br>";
		   memberInfo += "별명: " + jsonInfo.members[i].nickname+"<br><br><br>";
	        }
	        $("#output").html(memberInfo);
	       },
	      error:function(data,textStatus){
	         alert("에러가 발생했습니다.");ㅣ
	      },
	      complete:function(data,textStatus){
	      }
	   }); 
       });
    });
 </script>
</head>
<body>
   <a id="checkJson" style="cursor:pointer">회원 정보 수신하기</a><br><br>
    <div id="output"></div>
