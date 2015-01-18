<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="login.title" /></title>
</head>
<body>
	<div align="right">
		<s:text name="index.login" />
		<s:a href="regist">
			<s:text name="index.regist" />
		</s:a>
	</div>
	<div align="center">
		<s:a href="news">
			<s:text name="index.subtitle-1" />
		</s:a>
		<s:a href="schedule">
			<s:text name="index.subtitle-2" />
		</s:a>
		<s:a href="team">
			<s:text name="index.subtitle-3" />
		</s:a>
		<s:a href="player">
			<s:text name="index.subtitle-4" />
		</s:a>
		<s:a href="rankPro">
			<s:text name="index.subtitle-5" />
		</s:a>
		<s:a href="manage">
			<s:text name="index.subtitle-6" />
		</s:a>
	</div>
	<br />
	<div align="center">
		<s:form action="loginPro">
			<s:textfield name="user.name" key="login.name" />
			<s:password name="user.pass" key="login.pass" />
			<s:submit key="login_submit" />
		</s:form>
	</div>
</body>
</html>