package com.validate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.*;

/**
 * Servlet implementation class ValidateUserData
 */
@WebServlet("/ValidateLoginData")
public class ValidateLoginData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateLoginData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter write= response.getWriter();
		 HttpSession session=request.getSession();
		session.setAttribute("errorMessage", null);
		String userEmail=request.getParameter("uname");
		String userPassword=request.getParameter("psw");
		UserAccountDao user=new UserAccountDao();
		String usern=null;
		try {
			usern=user.fetchName(userEmail);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
			 int i = 0;
			try {
				i = user.read(userEmail,userPassword);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(i==1) {
				 session.setAttribute("email", userEmail);
				 session.setAttribute("errorMessage", null);
				 response.sendRedirect("HomePage.jsp");
				 session.setAttribute("user", usern);
			 }
			 else {
				 session.setAttribute("errorMessage", "Invalid Username or Password");
				 request.getRequestDispatcher("Login.jsp").forward(request, response);
			 }
			
			 
		
		
		
		
	}

}
