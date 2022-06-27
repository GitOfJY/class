<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  ex11_form.jsp  -->
	
	<h1>버튼 만들기</h1>
	
	<table  border width="600">
		<tr>
			<th width="100">너비(px)</th>
			<td width="500"><input type="text" name="width"></td>
		</tr>
		<tr>
			<th>높이(px)</th>
			<td><input type="text" name="height"></td>
		</tr>
		<tr>
			<th>텍스트</th>
			<td><input type="text" name="txt"></td>
		</tr>
		<tr>
			<th>배경색</th>
			<td><input type="color" name="bgcolor"></td>
		</tr>
		<tr>
			<th>글자색</th>
			<td><input type="color" name="txtcolor"></td>
		</tr>
		<tr>
			<th>글자 크기(px)</th>
			<td><input type="text" name="txtsize"></td>
		</tr>
		<tr>
			<th>버튼 개수</th>
			<td><input type="text" name="bt"></td>
		</tr>
		<tr>
			<th>버튼 간격</th>
			<td></td>
		</tr>
		<tr>
			<th>아이콘</th>
			<td>
				<label><input type="radio" name="rb" value="1">없음</label>
				<label><input type="radio" name="rb" value="2"></label>
				<label><input type="radio" name="rb" value="3"></label>
				<label><input type="radio" name="rb" value="4"></label>
				<label><input type="radio" name="rb" value="5"></label>
				<label><input type="radio" name="rb" value="6"></label>
			</td>
		</tr>
		<tr>
			<th>테두리</th>
			<td>
				<select name="sel">
					<option value="1">보이기</option>
					<option value="2">안보이기</option>
				</select>
			</td>
		</tr>
	</table>
	
	<br>
	<input type="submit" value="만들기">
	
</body>
</html>