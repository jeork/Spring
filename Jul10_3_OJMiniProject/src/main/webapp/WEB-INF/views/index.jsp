<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
	});
</script>
<link rel="stylesheet" href="resources/css/index.css">
</head>
<body>
	<table id="siteTitleArea">
		
		<tr>
			<td id="titleTd">
			<a href="index.go">Fitness Helper</a>
			</td>
			<td id="msgTd">${r }</td>
			<td id="loginTd" align="right">
				<a href="member.login.go">
					<img src="resources/img/login.jpg">
				</a>
			</td>
			<td id="signupTd" align="center">
				<a href="member.signup.go">
					<img src="resources/img/signup.jpg">
				</a>
			</td>
		</tr>
	</table>
	<table id="siteNavArea">
		<tr align="center">
			<td><a href=""><span>운동 정보</span></a></td>
			<td><a href=""><span>운동 루틴</span></a></td>
			<td><a href=""><span>나의 운동 루틴</span></a></td>
			<td><a href=""><span>운동 칼로리 계산</span></a></td>
		</tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center">
				<jsp:include page="${cp }"/>
			</td>
		</tr>
	</table>

</body>
</html>