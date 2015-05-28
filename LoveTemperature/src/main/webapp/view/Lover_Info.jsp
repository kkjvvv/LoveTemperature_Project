<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lover_Info</title>
<style type="text/css">
	img {
	width : 150px;
	height: 150px;
	
	}

</style>
</head>
<body>
<form action="#" id="#">
<center>
이름&nbsp;&nbsp;<input type="text" name="ml_name" id="ml_name"><p><!-- ml_name : 연인의 이름 -->
혈액형&nbsp;&nbsp;
<select id="ml_bloodType"><!-- ml_bloodType : 연인의 혈액형  -->
	<option>A형</option>
	<option>B형</option>
	<option>O형</option>
	<option>AB형</option>
</select><p>
신분&nbsp;&nbsp;
<select id="ml_job"><!-- ml_job : 연인 신분 -->
	<option>학생</option>
	<option>휴학생</option>
	<option>백수, 취준생도 여기에</option>
	<option>회사원</option>
	<option>재벌2세 또는 3세</option>
</select><p>
	<b>스타일</b><br><!-- style(ml_style) 연인의 스타일  -->
	<input type="radio" name="style" value="lovely">러블리
	<input type="radio" name="style" value="casual">캐주얼
	<input type="radio" name="style" value="chic">시크
	<input type="radio" name="style" value="sporty">스포티<p>
	
	<img alt="" src="../img/lovely.jpg">
	<img alt="" src="../img/casual.jpg">
	<img alt="" src="../img/chic.jpg">
	<img alt="" src="../img/sporty.jpg"><p>
	
	<input type="submit" value="정보등록">
</center>
</form>
	
</body>
</html>