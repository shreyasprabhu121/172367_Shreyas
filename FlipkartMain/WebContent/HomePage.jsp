<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css\HomePage.css">
<meta charset="ISO-8859-1">
<title>Online Shopping Portal</title>
</head>
<body>
	<div id="header" bgcolor=yellow"">
		<table height="40" border="0">
			<tr>
				<td width="205" height="60"><img
					src="C:\Users\shreyapr\Downloads\logo.png" width="190" height="70"
					alt="Logo" /></td>
				<td>
					<table height="60" border="0">
						<tr>
							<td id="info" class="right">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
								&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
								&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
								&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;24X7
								Customer Support - Contact us | Home | <%
									if (session.getAttribute("email") == null) {
								%> <a href="Login.jsp">Login</a> | <a href="SignUp.jsp">SignUp</a>
								<%
									} else {
								%> <b>Welcome</b> <b>${user}</b>|<a href="Logout" style="text-decoration: none">&nbsp;Logout</a>
								 <%}%>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<table id="prod" width="725" height="300" border="0" align="center">
		<tr>
			<td height="30"><h3>CATEGORIES</h3>
		</tr>
		<tr>
			<td height="261"><table width="714" height="258" border="0">
					<tr>
						<td width="228"><table width="120" height="173" border="0"
								align="center">
								<tr>
									<td><form action="Mobile.jsp">

											<input type="image"
												src="C:\Users\shreyapr\Downloads\mobile.png" width="114"
												height="165">
										</form></td>
								</tr>
							</table>
							<p class="center1">
								<b>MOBILES</b>
							</p></td>
						<td width="240" class="center1"><table width="200"
								height="173" border="0" align="center">
								<tr>
									<td width="200"><form action="Laptops.jsp">

											<input type="image"
												src="C:\Users\shreyapr\Downloads\laptop.png" width="180"
												height="165">
										</form></td>
								</tr>
							</table>
							</p>
							<p>
								<b>LAPTOPS</b>
							</p>
						<td width="250"><table width="20" height="173" border="0"
								align="center">
								<tr>
									<td><form action="Accessories.jsp">

											<input type="image"
												src="C:\Users\shreyapr\Downloads\earphone.png" width="170"
												height="165">
										</form></td>
								</tr>
							</table>
							<p class="center1">
								<b>ACCESSORIES</b>
							</p></td>
					</tr>
				</table></td>
		</tr>

	</table>

</body>
</html>