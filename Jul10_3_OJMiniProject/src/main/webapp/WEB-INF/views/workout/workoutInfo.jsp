<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
</head>
<body>
	<table>
		<tr>
			<td><a href="leg.go" ><span>하체</span></a></td>
			<td><a href="upper.go" ><span>상체</span></a></td>
			<td><a href="bi.go" ><span>이두근</span></a></td>
			<td><a href="tri.go" ><span>삼두근</span></a></td>
			<td><a href="abs.go" ><span>복근</span></a></td>
		</tr>
		<tr>
			<td>
				<jsp:include page="${wp }"/>
			</td>
		</tr>
	</table>
</body>
</html>