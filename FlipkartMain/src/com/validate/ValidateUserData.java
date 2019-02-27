package com.validate;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.pojo.*;

/**
 * Servlet implementation class ValidateUserData
 */
@WebServlet("/ValidateUserData")
public class ValidateUserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUserData() {
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
		String name=request.getParameter("uname");
		String pass=request.getParameter("psw");
		UserAccountDao user=new UserAccountDao();
		
		
			 int i = 0;
			try {
				i = user.read(name, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(i==1) {
				 write.print("Success");
			 }
			 else
				 write.print("Gaa<ar");
			  
			
			 
		
		
		
		
	}

}
