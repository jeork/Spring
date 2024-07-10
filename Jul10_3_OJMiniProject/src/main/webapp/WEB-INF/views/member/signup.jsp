<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member.signup"  method="post" enctype="multipart/form-data">
		<table id="signupTbl">
			<tr>
				<td>아이디<br> <input name="m_id" placeholder=""></td>
			</tr>
			<tr>
				<td>비밀번호<br> <input name="m_pw" type="password" placeholder=""></td>
			</tr>
			<tr>
				<td>비밀번호확인<br> <input type="password"
					placeholder="비밀번호 확인"></td>
			</tr>
			<tr>
				<td>이름<br> <input name="m_name" maxlength="5"></td>
			</tr>
			<tr>
				<td>생년월일<br> <input name="m_birth" maxlength="8" placeholder="8자리"></td>
			</tr>
			<tr>
				<td>전화번호<br> <input name="m_phone" maxlength="11" placeholder="'-' 빼고 11자리"></td>
			</tr>
			<tr>
				<td>주소<br> <input name="m_addr" placeholder=""></td>
			</tr>
			<tr>
				<td>
					<input name="m_photo" type="file">
				</td>
			</tr>
			<tr>
				<td>
					<hr>
					<button id="signupBtn">회원가입</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>