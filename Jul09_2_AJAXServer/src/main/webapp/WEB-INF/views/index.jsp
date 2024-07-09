<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
	<!-- 
		MyBatis + Spring MVC 활용
		e_what - e_where 의 형태로 출력
	 -->
	 
	 <c:forEach var="e" items="${errors }">
	 	${e.e_what } = ${e.e_where }<br>
	 </c:forEach>
	 
</body>
</html>