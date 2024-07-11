<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		$("#calcBtn").click(function() {
			let mets = 0; 
			let sports=$("#sports :selected").val();
			let sportsName=$("#sports :selected").text();
			if (sports=="walking") {
				mets=3;
			} else if(sports=="running"){
				mets=10;
			} else if(sports=="cycling"){
				mets=8;
			} else if(sports=="swimming"){
				mets=11;
			} else if(sports=="jumprope"){
				mets=8;
			} else if(sports=="badminton"){
				mets=4.5;
			} else if(sports=="golf"){
				mets=4.5;
			} else if(sports=="baseball"){
				mets=5;
			} else if(sports=="basketball"){
				mets=6;
			} else if(sports=="workout"){
				mets=3;
			} else if(sports=="workoutHard"){
				mets=6;
			}
			let w = $("#weight").val();
			let m = $("#minute").val();
			let kcal = mets*(3.5*w*m)*5 / 1000;
			alert(sportsName+" 을(를) 통해 소비한 칼로리는\r" +kcal+ "Kcal 입니다");
			
		});
	});
</script>
</head>
<body>
	<table id="calcTbl">
		<tr>
			<th align="center" colspan="4">칼로리 계산기</th>
		</tr>
		<tr>
			<td colspan="4" align="left">운동 종목</td>
		</tr>
		<tr>
			<td colspan="4" align="left"><select id="sports">
					<option value="walking">걷기</option>
					<option value="running">달리기</option>
					<option value="cycling">사이클링</option>
					<option value="swimming">수영</option>
					<option value="jumprope">줄넘기</option>
					<option value="badminton">배드민턴</option>
					<option value="golf">골프</option>
					<option value="baseball">야구</option>
					<option value="basketball">농구</option>
					<option value="workout">일반강도 헬스</option>
					<option value="workoutHard">고강도 헬스</option>
			</select></td>
		</tr>
		<tr>
			<td colspan="2">체중</td>
			<td colspan="2">운동시간</td>
		</tr>
		<tr>
			<td style="width: 100px;"><input id="weight" type="number"
				maxlength="3"></td>
			<td align="left">kg</td>
			<td><input id="minute" type="number" maxlength="3"></td>
			<td align="left">분</td>
		</tr>
		<tr>
			<td colspan="4" align="center">
				<button id="calcBtn">계산하기</button>
			</td>
		</tr>
	</table>
</body>
</html>