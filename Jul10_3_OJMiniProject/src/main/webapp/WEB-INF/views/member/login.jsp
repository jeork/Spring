<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member.login" method="post">
		<table id="loginTbl">
			<tr>
				<th>로 그 인</th>
			</tr>	
			<tr>
				<td><input id="m_id" autocomplete="off" placeholder="아이디"></td>
			</tr>
			<tr>
				<td><input id="m_pw" type="password" placeholder="비밀번호"></td>
			</tr>
			<tr>
				<td>
					<button id="loginBtn">로그인</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>