<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css\Login.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header" bgcolor="yellow">
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
								Customer Support - Contact us | Home | 
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
<form action="ValidateUserData" method="post">
  <div class="imgcontainer">
    <img src="C:\Users\shreyapr\Downloads\avatar.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <button type="submit">Login</button>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn" href="HomePage.jsp">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</body>
</html>