<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
#logo {
	width: 600px;
	margin: 1px auto 0;	
}

#search_info{
	width: 200px;
	margin: 20px 200px 0;
}

#register_member{
	width: 200px;
	margin: 10px 200px 0;
}

#login_btn {
 position: absolute;
	width: 60px;
	height: 55px;
}

.allform {
	width: 600px;
	margin: 170px auto 0;
}

.input {
	width: 200px;
	height: 22px;
}

 .login_id {
	margin: 30px auto 0;
	margin-left: 123px;
}

.login_pass {
	margin: 5px auto 0;
	margin-left: 100px;
}

.login_btn {
	  position: relative;
  top: -52px;
  left: 360px;
}

</style>
</head>
<body>
	<form action="love.do" method="post">
	<input type="hidden" name="command" value="login">
		<div class="allform">
			<div>
				<img alt="" src="image/logo.png" id="logo">
			</div>
			<div>
				<p class="login_id">
					<strong>ID</strong> : <input type="text" class="input" name="mem_id">
				</p>
				<p class="login_pass">
					<strong>PASS</strong> : <input type="password" class="input" name="mem_password">
				</p>
				<p class="login_btn">
					<input id="login_btn" class="btn btn-default" type="submit" value="로그인" style="background-color:pink">
				</p>
			</div>
			<div>
				<button id="search_info">비밀번호, 아이디 찾기</button><br>
				<button id="register_member">회원가입</button>				
			</div>
		</div>
	</form>
</body>
</html>