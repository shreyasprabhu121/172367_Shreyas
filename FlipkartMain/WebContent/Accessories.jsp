<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
#header {
	background-color: yellow;
}
body{
font-family: "Century Gothic", CenturyGothic, Geneva, AppleGothic, sans-serif;
}
</style>
<title>Earphones,Charger,etc..</title>
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
								&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
								&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;24X7
								Customer Support - Contact us | Home | <%
									if (session.getAttribute("uname") == null) {
								%> <a href="login.jsp">Login</a> | <a href="register.jsp">SignUp</a>
								<%
									} else {
								%> <a href="logout.jsp">Logout</a> <%
 	}
 %>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>