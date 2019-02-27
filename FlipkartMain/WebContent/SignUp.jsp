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
	
<form action="ValidateSignupData" method="post">
  <div class="imgcontainer">
    <img src="C:\Users\shreyapr\Downloads\avatar.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" maxlength="30" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" maxlength="15" required>
    
    <label for="uname"><b>Name</b></label>
    <input type="text" placeholder="Enter Username" name="uname" maxlength="10" required>

    <label for="psw"><b>Phone No.</b></label>
    <input type="text" placeholder="Enter Phone number" name="pno" maxlength="10" required >
    <div style="color:red">${errorMessage}</div>

    <button type="submit">Sign Up</button>
  </div>
	<%
	session.setAttribute("errorMessage", null);
	%>
  <div class="container" style="background-color:#f1f1f1">
    <a style="text-decoration:none" href="HomePage.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
    <span class="psw">Already Have an Account? <a s href="Login.jsp">Login</a></span>
  </div>
</form>
</body>
</html>