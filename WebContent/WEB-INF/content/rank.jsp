<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="江辰">
<title><s:text name="rank.title" /></title>
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
		<s:text name="index.subtitle-5" />
		<s:a href="manage">
			<s:text name="index.subtitle-6" />
		</s:a>
	</div>
	<br />
	<s:if test="#request.it1!=null">
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.goals" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it1.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.goals" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.assists" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it2.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.assists" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.shooting" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it3.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.shooting" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.passing" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it4.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.passing" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.ball" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it5.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.ball" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.foul" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it6.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.foul" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.closure" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it7.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.closure" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.yellow" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it8.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.yellow" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
		<table align="center">
			<tr>
				<th colspan="4" align="center"><s:text name="rank.red" /></th>
			</tr>
			<tr>
				<th><br /></th>
			</tr>
			<tr>
				<th><s:text name="rank.rank" /></th>
				<th><s:text name="rank.player" /></th>
				<th><s:text name="rank.data" /></th>
				<th><s:text name="rank.team" /></th>
			</tr>
			<s:bean name="org.apache.struts2.util.Counter" id="counter">
				<s:param name="first" value="1" />
				<s:param name="last" value="5" />
				<s:iterator>
					<s:iterator id="playerlist" value="#request.it9.next">
						<tr>
							<td align="center"><s:property value="#counter.current-1" /></td>
							<td align="center"><s:property
									value="#request.playerlist.name" /></td>
							<td align="center"><s:property
									value="#request.playerlist.red" /></td>
							<td align="center"><s:property
									value="#request.playerlist.team" /></td>
						</tr>
					</s:iterator>
				</s:iterator>
			</s:bean>
			<tr>
				<th><br /></th>
			</tr>
		</table>
	</s:if>
</body>
</html>