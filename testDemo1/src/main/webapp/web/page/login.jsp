<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>limin</title>
<link rel="stylesheet" type="text/css" href="/web/css/login.css">
</head>
<body>
	<div class="main">
		<div class="leftBox">
			<img alt="" src="/web/imgs/bg-1.jpg">
		</div>
		<div class="rightBox">
			<div class="loginBox">
				<header>登录</header>
				<form class="loginForm" method="get" action="/login">
					<section>
						<p>
							<label>账号：</label>
						</p>
						<p>
							<input name="acctoun">
						</p>
					</section>
					<section>
						<p>
							<label>密码：</label>
						</p>
						<p>
							<input name="password">
						</p>
					</section>
					<section>
						<div class="loginBtnBox">
							<button type="submit">登录</button>
						</div>
					</section>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="./js/login.js"></script>
</body>
</html>