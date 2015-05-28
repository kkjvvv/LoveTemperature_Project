<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Research.jsp</title>
<script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/sunny/jquery-ui.css">
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	 $( "#accordion").accordion();
});//ready()
</script> 
</head>
<body>
<div id="accordion">
<!-- name : question 1~25 까지 for문
    value : 1~5까지 for문
 -->
	<h3>설문조사 1</h3>
 	<div>
 	1. 날씨에 민감한 편입니까? <p>
 	<!-- quest_description : 질문 내용 - question -->
 	<input type="radio" name="question1" value="1">
	<input type="radio" name="question1" value="2">
	<input type="radio" name="question1" value="3">
	<input type="radio" name="question1" value="4">
	<input type="radio" name="question1" value="5"><p>
	2. 슬픈 영화나 드라마 장면을 보고 자주 눈물을 흘리십니까?<p>
	<input type="radio" name="question2" value="1">
	<input type="radio" name="question2" value="2">
	<input type="radio" name="question2" value="3">
	<input type="radio" name="question2" value="4">
	<input type="radio" name="question2" value="5"><p>
	3. 평소 데이트때 자신의 감정을 숨김없이 잘 표현하는 편입니까?<p>
	<input type="radio" name="question3" value="1">
	<input type="radio" name="question3" value="2">
	<input type="radio" name="question3" value="3">
	<input type="radio" name="question3" value="4">
	<input type="radio" name="question3" value="5"><p>
	4. SNS활동을 자주하는 편입니까?<p>
	<input type="radio" name="question4" value="1">
	<input type="radio" name="question4" value="2">
	<input type="radio" name="question4" value="3">
	<input type="radio" name="question4" value="4">
	<input type="radio" name="question4" value="5"><p>
	5. 평상시 사소한말로 인해서 다툼이 벌어진 적이 많습니까?<p>
 	<input type="radio" name="question5" value="1">
	<input type="radio" name="question5" value="2">
	<input type="radio" name="question5" value="3">
	<input type="radio" name="question5" value="4">
	<input type="radio" name="question5" value="5"><p>
 	</div>
	
	<h3>설문조사 2</h3>
	<div>
	1. 웃음소리가 호탕 합니까?<p>
 	<!-- quest_description : 질문 내용 - question -->
 	<input type="radio" name="question6" value="1">
	<input type="radio" name="question6" value="2">
	<input type="radio" name="question6" value="3">
	<input type="radio" name="question6" value="4">
	<input type="radio" name="question6"value="5"><p>
	2. 어느날 여자 친구가 치마를 입고 오면 어색합니까?<p><!-- 설문 내용 변경 -->
	<input type="radio" name="question7" value="1">
	<input type="radio" name="question7" value="2">
	<input type="radio" name="question7" value="3">
	<input type="radio" name="question7" value="4">
	<input type="radio" name="question7" value="5"><p>
	3. 평소에 애교 있는 말을 잘 하지 않습니까?<p>
	<input type="radio" name="question8" value="1">
	<input type="radio" name="question8" value="2">
	<input type="radio" name="question8" value="3">
	<input type="radio" name="question8" value="4">
	<input type="radio" name="question8" value="5"><p>
	4. 가끔 내 여자 친구가 동성친구처럼 느낀 적이 있습니까? <p>
	<input type="radio" name="question9" value="1">
	<input type="radio" name="question9" value="2">
	<input type="radio" name="question9" value="3">
	<input type="radio" name="question9" value="4">
	<input type="radio" name="question9" value="5"><p>
	5. 평소언행이 거친 편 입니까?<p>
 	<input type="radio" name="question10" value="1">
	<input type="radio" name="question10" value="2">
	<input type="radio" name="question10" value="3">
	<input type="radio" name="question10" value="4">
	<input type="radio" name="question10" value="5"><p>
 	</div>
	
	<h3>설문조사 3</h3>
	<div>
	1. 운동을 즐겨 하는 편입니까?<p>
 	<!-- quest_description : 질문 내용 - question -->
 	<input type="radio" name="question11" value="1">
	<input type="radio" name="question11" value="2">
	<input type="radio" name="question11" value="3">
	<input type="radio" name="question11" value="4">
	<input type="radio" name="question11" value="5"><p>
	2. 대외활동/동호회모임에 자주 나가는 편입니까?<p>
	<input type="radio" name="question12" value="1">
	<input type="radio" name="question12" value="2">
	<input type="radio" name="question12" value="3">
	<input type="radio" name="question12" value="4">
	<input type="radio" name="question12" value="5"><p>
	3. 여행을 자주 다닙니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	4. 낯선 사람과 금방 친해집니까? <p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	5. 평소 귀가시간이 늦는 편입니까(외박포함)?<p>
 	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
 	</div>
 	
 	<h3>설문조사 4</h3>
	<div>
	1. 혼자만의 시간을 갖는 것을 좋아합니까?<p>
 	<!-- quest_description : 질문 내용 - question -->
 	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	2. 평소에 귀찮다는 말을 자주하는 편입니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	3. 어떤 일을 할 때 목표의식이 뚜렷합니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	4. 데이트 시에 본인이 대화를 리드하는 편입니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	5. 평소에 “아무거나“라는 말을 자주하는 편입니까?<p>
 	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
 	</div>
 	
 	<h3>설문조사 5</h3>
	<div>
	1. 하나의 주제로 오래 이야기하는 편입니까?<p>
 	<!-- quest_description : 질문 내용 - question -->
 	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	2. 철학적인 말(명언)을 좋아하는 편입니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	3. 평소에 책을 많이 읽는 편입니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	4. 평상시에 고민이 많습니까?<p>
	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
	5. 매사에 진중(진지)한 편입니까?<p>
 	<input type="radio" name="question" value="1">
	<input type="radio" name="question" value="2">
	<input type="radio" name="question" value="3">
	<input type="radio" name="question" value="4">
	<input type="radio" name="question" value="5"><p>
 	</div>
</div>

<p><input type="button" id="creationSection" value="나의 연인 성향 확인">
</body>
</html>