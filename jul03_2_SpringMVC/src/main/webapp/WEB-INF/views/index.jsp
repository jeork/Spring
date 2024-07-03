<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/index.js"></script>
<title>Insert title here</title>
</head>
<body>
	View (V) - <br>
	JSP : .html or .jsp <br>
	Spring legacy : .jsp <br>
	Spring Boot : .html(thymeleaf) <br>
	
	Spring 내에서 쓰는 자원파일들 (css, js, 그림, ...)
		webapp - resources/...(경로)
	 <hr>
	 input 3개 => 이름, x, y
	 button 하나를
	 form에 담기
	 <hr>
	 
	<form action="calculate.do" method="post">
		<input name="n" placeholder="이름"><p>
		<input name="x" placeholder="x"><p>
	 	<input name="y" placeholder="y"><p>
	 	<button>입력</button>
	</form>
	<hr>
	<c:if test="${add!=null}">
		계산결과<br>
		count : ${allCalcCount }<br>
		result : ${add }<br>
	</c:if>
</body>
</html>