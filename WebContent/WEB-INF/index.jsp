<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="index.title" /></title>
<style type="text/css">
body{
	background-image:url(images/2.jpg);
}
</style>
</head>
<body>
	<s:if test="#session.username==null">
		<div align="right">
			<s:a href="login.action">
				<s:text name="index.login" />
			</s:a>
			<s:a href="regist.action">
				<s:text name="index.regist" />
			</s:a>
		</div>
	</s:if>
	<s:else>
		<div align="right">
			<div align="right">
			<s:a href="adminmain.action">
				<s:text name="index.username">
				<s:param>${sessionScope.username}</s:param>
			</s:text>
			</s:a>
			<s:a href="logoutPro.action">
				<s:text name="index.logout" />
			</s:a>
		</div>
	</s:else>
	<div align="left">
		<s:a href="newsAllPro.action">
			<s:text name="index.subtitle-1" />
		</s:a>
		<s:a href="schedule.action">
			<s:text name="index.subtitle-2" />
		</s:a>
		<s:a href="team.action">
			<s:text name="index.subtitle-3" />
		</s:a>
		<s:a href="player.action">
			<s:text name="index.subtitle-4" />
		</s:a>
		<s:a href="rankPro.action">
			<s:text name="index.subtitle-5" />
		</s:a>
	</div>
	<br />
	<div align="center">
		<i><big><s:text name="index.welcome" /></big></i>
	</div>
</body>
</html>