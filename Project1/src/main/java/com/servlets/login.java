package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOEmployee;
import com.Userdata.EmpDetails;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession se= req.getSession();
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		se.setAttribute("user", user);
		se.setAttribute("pass", pass);
	
//		rd.forward(req, resp);
//		p.println(user+pass);
		DAOEmployee ed=new DAOEmployee ();
		String pass2= ed.checkUser(user);
		p.print(user+pass2+pass);

		if (pass.equals(pass2)){
			RequestDispatcher rd= req.getRequestDispatcher("view.jsp");
			rd.include(req, resp);
			ed.updateEmpIn(user);
			ed.inser2(user);
			LocalDateTime l= LocalDateTime.now();	
			}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
			p.println("<p>Invalid user or password.Try login again.");			

		}
	
			
		}
	

}
