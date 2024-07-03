<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.CmtoInch{
		color:red;
	}
	.M2ToSqft{
		color:green;
	}
	.CelToFah{
		color:blue;
	}
	.MiToKm{
		color:pink;
	}
</style>
</head>
<body>
	<table>
	<tr>
		<th class="${param.cOption }"></th>
	</tr>
		<tr>
			<td>${rnum } ${result }</td> 
		</tr>
		
		<tr>
			<td>
				${unit } -> ${result }
			</td>
		</tr>
		
	</table>
</body>
</html>