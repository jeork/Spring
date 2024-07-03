<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="convert.do" method="post">
		<table>
			<tr>
				<td>
					<input name = "num" placeholder="숫자" >
				</td>
			</tr>
			<tr>
				<td>
					<select name = "cOption">
						<option value="CmToInch">CM -> Inch</option>
						<option value="M2ToSqft">M² -> 평</option>
						<option value="CelToFah">ºC -> ºF</option>
						<option value="MiToKm">mi/h -> km/h</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<button>입력</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>