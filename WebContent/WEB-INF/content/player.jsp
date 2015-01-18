<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="player.title" /></title>
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
		<s:text name="index.subtitle-4" />
		<s:a href="rankPro">
			<s:text name="index.subtitle-5" />
		</s:a>
		<s:a href="manage">
			<s:text name="index.subtitle-6" />
		</s:a>
	</div>
	<br />
	<div align="center">
		<s:form action="playerPro">
			<s:text name="player.searchbyname" />
			<s:textfield name="player.name" theme="simple" />
			<s:submit key="player_submit" theme="simple" />
		</s:form>
		<s:form action="playerAllPro">
			<s:submit key="player_submit_all" />
		</s:form>
	</div>
	<br />
	<s:if test="#request.it!=null">
		<table align="center">
			<tr>
				<th><s:text name="player.nameh" /></th>
				<th><s:text name="player.teamh" /></th>
				<th><s:text name="player.appearanceh" /></th>
				<th><s:text name="player.timeh" /></th>
				<th><s:text name="player.goalsh" /></th>
				<th><s:text name="player.penaltiesh" /></th>
				<th><s:text name="player.assistsh" /></th>
				<th><s:text name="player.shotsh" /></th>
				<th><s:text name="player.shootingh" /></th>
				<th><s:text name="player.passingh" /></th>
				<th><s:text name="player.biographyh" /></th>
				<th><s:text name="player.cornerh" /></th>
				<th><s:text name="player.offsideh" /></th>
				<th><s:text name="player.ballh" /></th>
				<th><s:text name="player.foulh" /></th>
				<th><s:text name="player.closureh" /></th>
				<th><s:text name="player.yellowh" /></th>
				<th><s:text name="player.redh" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="#request.playerNumber" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it.next">
						<tr>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
							<td align="center"><s:property
									value="#request.playerlist.appearance" /></td>
							<td align="center"><s:property
									value="#request.playerlist.time" /></td>
							<td align="center"><s:property
									value="#request.playerlist.goals" /></td>
							<td align="center"><s:property
									value="#request.playerlist.penalties" /></td>
							<td align="center"><s:property
									value="#request.playerlist.assists" /></td>
							<td align="center"><s:property
									value="#request.playerlist.shots" /></td>
							<td align="center"><s:property
									value="#request.playerlist.shooting" /></td>
							<td align="center"><s:property
									value="#request.playerlist.passing" /></td>
							<td align="center"><s:property
									value="#request.playerlist.biography" /></td>
							<td align="center"><s:property
									value="#request.playerlist.corner" /></td>
							<td align="center"><s:property
									value="#request.playerlist.offside" /></td>
							<td align="center"><s:property
									value="#request.playerlist.ball" /></td>
							<td align="center"><s:property
									value="#request.playerlist.foul" /></td>
							<td align="center"><s:property
									value="#request.playerlist.closure" /></td>
							<td align="center"><s:property
									value="#request.playerlist.yellow" /></td>
							<td align="center"><s:property
									value="#request.playerlist.red" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
		</table>
	</s:if>
	<s:elseif test="#request.flag==false">
		<div align="center">
			<s:text name="player.failtip" />
		</div>
	</s:elseif>
	<s:elseif test="#request.flag==true">
		<table align="center">
			<tr>
				<td><s:text name="player.name" /></td>
				<td align="center"><s:property value="#request.player.name" /></td>
			</tr>
			<tr>
				<td><s:text name="player.team" /></td>
				<td align="center"><s:property value="#request.player.team" /></td>
			</tr>
			<tr>
				<td><s:text name="player.appearance" /></td>
				<td align="center"><s:property
						value="#request.player.appearance" /></td>
			</tr>
			<tr>
				<td><s:text name="player.time" /></td>
				<td align="center"><s:property value="#request.player.time" /></td>
			</tr>
			<tr>
				<td><s:text name="player.goals" /></td>
				<td align="center"><s:property value="#request.player.goals" /></td>
			</tr>
			<tr>
				<td><s:text name="player.penalties" /></td>
				<td align="center"><s:property
						value="#request.player.penalties" /></td>
			</tr>
			<tr>
				<td><s:text name="player.assists" />
				<td align="center"><s:property value="#request.player.assists" /></td>
			</tr>
			<tr>
				<td><s:text name="player.shots" /></td>
				<td align="center"><s:property value="#request.player.shots" /></td>
			</tr>
			<tr>
				<td><s:text name="player.shooting" /></td>
				<td align="center"><s:property value="#request.player.shooting" /></td>
			</tr>
			<tr>
				<td><s:text name="player.passing" /></td>
				<td align="center"><s:property value="#request.player.passing" /></td>
			</tr>
			<tr>
				<td><s:text name="player.biography" /></td>
				<td align="center"><s:property
						value="#request.player.biography" /></td>
			</tr>
			<tr>
				<td><s:text name="player.corner" /></td>
				<td align="center"><s:property value="#request.player.corner" /></td>
			</tr>
			<tr>
				<td><s:text name="player.offside" /></td>
				<td align="center"><s:property value="#request.player.offside" /></td>
			</tr>
			<tr>
				<td><s:text name="player.ball" /></td>
				<td align="center"><s:property value="#request.player.ball" /></td>
			</tr>
			<tr>
				<td><s:text name="player.foul" /></td>
				<td align="center"><s:property value="#request.player.foul" /></td>
			</tr>
			<tr>
				<td><s:text name="player.closure" /></td>
				<td align="center"><s:property value="#request.player.closure" /></td>
			</tr>
			<tr>
				<td><s:text name="player.yellow" /></td>
				<td align="center"><s:property value="#request.player.yellow" /></td>
			</tr>
			<tr>
				<td><s:text name="player.red" /></td>
				<td align="center"><s:property value="#request.player.red" /></td>
			</tr>
		</table>
	</s:elseif>
</body>
</html>