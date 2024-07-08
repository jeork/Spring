<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		MyBatis 활용
		전체 과일 데이터를 가격순으로
		이름 - 가격 형태로 출력
		(ex : 귤 - 2,800원)
 	-->

	<table>
		<tr>
			<td>
				${f_name } - ${f_price }원
			</td>
		</tr>
	</table>


</body>
</html>