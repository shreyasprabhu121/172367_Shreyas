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

import com.pojo.UserAccount;

/**
 * Servlet implementation class ValidateSignupData
 */
@WebServlet("/ValidateSignupData")
public class ValidateSignupData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateSignupData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter write= response.getWriter();
		HttpSession session=request.getSession();
		String email=request.getParameter("email");
		String pass=request.getParameter("psw");
		String name=request.getParameter("uname");
		String phone=request.getParameter("pno");
		UserAccountDao user=new UserAccountDao();
			int i = 0;
			try {
				i = user.insert(new UserAccount(email, pass, name, phone));
				 if(i==1) {
					 session.setAttribute("email", name);
					 session.setAttribute("errorMessage", null);
					 session.setAttribute("user", name);
					 request.getRequestDispatcher("HomePage.jsp").forward(request, response);
					
				 }
			} catch (SQLException e) {
				if(i!=1) {
					 session.setAttribute("errorMessage", "Invalid credentials or username already exists");
					 request.getRequestDispatcher("SignUp.jsp").forward(request, response);
				}
				e.printStackTrace();
			}
			
			 
	}

}
