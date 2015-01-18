<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="manage.title" /></title>
</head>
<body>
	<s:if test="#session.username==null">
		<div align="right">
			<s:a href="login">
				<s:text name="index.login" />
			</s:a>
			<s:a href="regist">
				<s:text name="index.regist" />
			</s:a>
		</div>
	</s:if>
	<s:else>
		<div align="right">
			<s:text name="index.username">
				<s:param>${sessionScope.username}</s:param>
			</s:text>
			<s:a href="logoutPro.action">
				<s:text name="index.logout" />
			</s:a>
		</div>
	</s:else>
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
		<s:text name="index.subtitle-6" />
	</div>
	<br />
	<div align="center">
		<s:form action="manageTeamPro">
			<s:textfield name="team.name" key="manage.team" />
			<s:textfield name="team.group" key="manage.group" />
			<s:textfield name="team.event" key="manage.event" />
			<s:textfield name="team.goals" key="manage.goals" />
			<s:textfield name="team.conceded" key="manage.conceded" />
			<s:textfield name="team.assists" key="manage.assists" />
			<s:textfield name="team.shots" key="manage.shots" />
			<s:textfield name="team.shooting" key="manage.shooting" />
			<s:textfield name="team.fighting" key="manage.fighting" />
			<s:textfield name="team.steals" key="manage.steals" />
			<s:textfield name="team.intercept" key="manage.intercept" />
			<s:textfield name="team.foul" key="manage.foul" />
			<s:textfield name="team.closure" key="manage.closure" />
			<s:textfield name="team.offside" key="manage.offside" />
			<s:textfield name="team.passing" key="manage.passing" />
			<s:textfield name="team.possession" key="manage.possession" />
			<s:textfield name="team.yellow" key="manage.yellow" />
			<s:textfield name="team.red" key="manage.red" />
			<s:textfield name="team.corner" key="manage.corner" />
			<s:submit key="manage_submit_team" />
		</s:form>
		<s:form action="managePlayerPro">
			<s:textfield name="player.name" key="manage.player" />
			<s:textfield name="player.team" key="manage.team" />
			<s:textfield name="player.appearance" key="manage.appearance" />
			<s:textfield name="player.time" key="manage.time" />
			<s:textfield name="player.goals" key="manage.goals" />
			<s:textfield name="player.penalties" key="manage.penalties" />
			<s:textfield name="player.assists" key="manage.assists" />
			<s:textfield name="player.shots" key="manage.shots" />
			<s:textfield name="player.shooting" key="manage.shooting" />
			<s:textfield name="player.passing" key="manage.passing" />
			<s:textfield name="player.biography" key="manage.biography" />
			<s:textfield name="player.corner" key="manage.corner" />
			<s:textfield name="player.offside" key="manage.offside" />
			<s:textfield name="player.ball" key="manage.ball" />
			<s:textfield name="player.foul" key="manage.foul" />
			<s:textfield name="player.closure" key="manage.closure" />
			<s:textfield name="player.yellow" key="manage.yellow" />
			<s:textfield name="player.red" key="manage.red" />
			<s:submit key="manage_submit_player" />
		</s:form>
	</div>
</body>
</html>