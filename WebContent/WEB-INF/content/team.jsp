<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="team.title" /></title>
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
		<s:text name="index.subtitle-3" />
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
		<s:form action="teamPro">
			<s:text name="team.searchbyname" />
			<s:textfield name="team.name" theme="simple" />
			<s:submit key="team_submit" theme="simple" />
		</s:form>
		<s:form action="teamAllPro">
			<s:submit key="team_submit_all" />
		</s:form>
	</div>
	<br />
	<s:if test="#request.it!=null">
		<table align="center">
			<tr>
				<th><s:text name="team.nameh" /></th>
				<th><s:text name="team.grouph" /></th>
				<th><s:text name="team.eventh" /></th>
				<th><s:text name="team.goalsh" /></th>
				<th><s:text name="team.concededh" /></th>
				<th><s:text name="team.assistsh" /></th>
				<th><s:text name="team.shotsh" /></th>
				<th><s:text name="team.shootingh" /></th>
				<th><s:text name="team.fightingh" /></th>
				<th><s:text name="team.stealsh" /></th>
				<th><s:text name="team.intercepth" /></th>
				<th><s:text name="team.foulh" /></th>
				<th><s:text name="team.closureh" /></th>
				<th><s:text name="team.offsideh" /></th>
				<th><s:text name="team.passingh" /></th>
				<th><s:text name="team.possessionh" /></th>
				<th><s:text name="team.yellowh" /></th>
				<th><s:text name="team.redh" /></th>
				<th><s:text name="team.cornerh" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="32" />
				<s:iterator>
					<s:iterator id="teamlist" value="#request.it.next">
						<tr>
							<td align="center"><s:property
									value="#request.teamlist.name" /></td>
							<td align="center"><s:property
									value="#request.teamlist.group" /></td>
							<td align="center"><s:property
									value="#request.teamlist.event" /></td>
							<td align="center"><s:property
									value="#request.teamlist.goals" /></td>
							<td align="center"><s:property
									value="#request.teamlist.conceded" /></td>
							<td align="center"><s:property
									value="#request.teamlist.assists" /></td>
							<td align="center"><s:property
									value="#request.teamlist.shots" /></td>
							<td align="center"><s:property
									value="#request.teamlist.shooting" /></td>
							<td align="center"><s:property
									value="#request.teamlist.fighting" /></td>
							<td align="center"><s:property
									value="#request.teamlist.steals" /></td>
							<td align="center"><s:property
									value="#request.teamlist.intercept" /></td>
							<td align="center"><s:property
									value="#request.teamlist.foul" /></td>
							<td align="center"><s:property
									value="#request.teamlist.closure" /></td>
							<td align="center"><s:property
									value="#request.teamlist.offside" /></td>
							<td align="center"><s:property
									value="#request.teamlist.passing" /></td>
							<td align="center"><s:property
									value="#request.teamlist.possession" /></td>
							<td align="center"><s:property
									value="#request.teamlist.yellow" /></td>
							<td align="center"><s:property value="#request.teamlist.red" /></td>
							<td align="center"><s:property
									value="#request.teamlist.corner" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
		</table>
	</s:if>
	<s:elseif test="#request.flag==false">
		<div align="center">
			<s:text name="team.failtip" />
		</div>
	</s:elseif>
	<s:elseif test="#request.flag==true">
		<table align="center">
			<tr>
				<td><s:text name="team.name" /></td>
				<td align="center"><s:property value="#request.team.name" /></td>
			</tr>
			<tr>
				<td><s:text name="team.group" /></td>
				<td align="center"><s:property value="#request.team.group" /></td>
			</tr>
			<tr>
				<td><s:text name="team.event" /></td>
				<td align="center"><s:property value="#request.team.event" /></td>
			</tr>
			<tr>
				<td><s:text name="team.goals" /></td>
				<td align="center"><s:property value="#request.team.goals" /></td>
			</tr>
			<tr>
				<td><s:text name="team.conceded" /></td>
				<td align="center"><s:property value="#request.team.conceded" /></td>
			</tr>
			<tr>
				<td><s:text name="team.assists" /></td>
				<td align="center"><s:property value="#request.team.assists" /></td>
			</tr>
			<tr>
				<td><s:text name="team.shots" /></td>
				<td align="center"><s:property value="#request.team.shots" /></td>
			</tr>
			<tr>
				<td><s:text name="team.shooting" /></td>
				<td align="center"><s:property value="#request.team.shooting" /></td>
			</tr>
			<tr>
				<td><s:text name="team.fighting" /></td>
				<td align="center"><s:property value="#request.team.fighting" /></td>
			</tr>
			<tr>
				<td><s:text name="team.steals" /></td>
				<td align="center"><s:property value="#request.team.steals" /></td>
			</tr>
			<tr>
				<td><s:text name="team.intercept" /></td>
				<td align="center"><s:property value="#request.team.intercept" /></td>
			</tr>
			<tr>
				<td><s:text name="team.foul" /></td>
				<td align="center"><s:property value="#request.team.foul" /></td>
			</tr>
			<tr>
				<td><s:text name="team.closure" /></td>
				<td align="center"><s:property value="#request.team.closure" /></td>
			</tr>
			<tr>
				<td><s:text name="team.offside" /></td>
				<td align="center"><s:property value="#request.team.offside" /></td>
			</tr>
			<tr>
				<td><s:text name="team.passing" /></td>
				<td align="center"><s:property value="#request.team.passing" /></td>
			</tr>
			<tr>
				<td><s:text name="team.possession" /></td>
				<td align="center"><s:property value="#request.team.possession" /></td>
			</tr>
			<tr>
				<td><s:text name="team.yellow" /></td>
				<td align="center"><s:property value="#request.team.yellow" /></td>
			</tr>
			<tr>
				<td><s:text name="team.red" /></td>
				<td align="center"><s:property value="#request.team.red" /></td>
			</tr>
			<tr>
				<td><s:text name="team.corner" /></td>
				<td align="center"><s:property value="#request.team.corner" /></td>
			</tr>
		</table>
	</s:elseif>
</body>
</html>