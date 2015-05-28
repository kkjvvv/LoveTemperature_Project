<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member_ register</title>
<script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/sunny/jquery-ui.css">
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
				$("#datepicker")
						.datepicker(
								{
									dateFormat : "yy-mm-dd",
									dayNamesMin : [ '일', '월', '화', '수', '목',
											'금', '토' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ],
									showMonthAfterYear : true
								});
			});//ready()
</script>
<style type="text/css">
img {
	width: 150px;
	height: 150px;
}
</style>
</head>
<body>
	<form action="/view/love.do" method="post" enctype="multipart/form-data">
	<input type="hidden" name="command" value="registerMember">
		이름&nbsp;<input type="text" name="mem_name" id="mem_name">
		<P>
			아이디&nbsp;<input type="text" name="mem_id" id="mem_id"><span></span>
		<p>
			<!-- span : 아이디 중복 체크  -->
			비밀번호&nbsp;<input type="password" name="mem_password" id="mem_password">
		<p>
			<!-- mem_password  -->
			비밀번호 확인&nbsp; <input type="password" name="passwordcheck"
				id="passwordcheck">
		<p>
			<span></span>
			<!-- span : 비밀번호 체크  -->
			이메일&nbsp;<input type="text" name="mem_email" id="mem_email"
				placeholder="예)kosat93@email.com">
		<p>
			성별 <input type="checkbox" name="mem_gender" value="man">남 <input
				type="checkbox" name="mem_gender" value="woman">여
		<p>
			혈액형&nbsp; <select name ="mem_bloodType" id="mem_bloodType">
				<option value="A">A형</option>
				<option value="B">B형</option>
				<option value="O">O형</option>
				<option value="AB">AB형</option>
			</select>
		<p>
			신분&nbsp; <select name="mem_job" id="mem_job">
				<option value="학생">학생</option>
				<option value="휴학생">휴학생</option>
				<option value="백수">백수, 취준생도 여기에</option>
				<option value="회사원">회사원</option>
				<option value="재벌2세 또는 3세">재벌2세 또는 3세</option>
			</select>
		<p>
			선호데이트&nbsp; <select name="mem_favorPlace" id="mem_favorPlace">
				<option value="실내">실내</option>
				<option value="실외">실외</option>
			</select>
		<p>
			사귄날짜 <input type="text" id="datepicker" name="mem_coupleDay">
		<p>
			<!-- mem_coupleDay -->
			비밀번호 찾기 질문&nbsp; <select name="mem_passQuestion" id="mem_passQuestion">
				<option value="가장 가고 싶은 여행지는?">가장 가고 싶은 여행지는?</option>
				<option value="가장 감명 깊게 읽은 책은?">가장 감명 깊게 읽은 책은?</option>
				<option value="내 보물 1호는?">내 보물 1호는?</option>
				<option value="처음으로 키운 애완동물의 이름은?">처음으로 키운 애완동물의 이름은?</option>
				<option value="가장 친한 친구의 이름은?">가장 친한 친구의 이름은?</option>
			</select>
		<p>
			선택한 질문의 답 <input type="text" name="mem_passAnswer"
				id="mem_passAnswer">
		<P>
			<!-- <input type="hidden" name="command" value="fileUpload"><p> -->
			프로필 <input type="file" name="mem_profileImg">
		<p>
			<b>나의 스타일</b><br> <input type="radio" name="mem_style"
				value="lovely">러블리 <input type="radio" name="mem_style"
				value="casual">캐주얼 <input type="radio" name="mem_style"
				value="chic">시크 <input type="radio" name="mem_style"
				value="sporty">스포티
		<p>

			<img alt="" src="../img/lovely.jpg"> <img alt=""
				src="../img/casual.jpg"> <img alt="" src="../img/chic.jpg">
			<img alt="" src="../img/sporty.jpg">
		<p>
			<input type="submit" value="회원 가입 하기">
	</form>
</body>

</html>