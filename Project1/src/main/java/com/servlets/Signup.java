package com.servlets;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DAOEmployee;
import com.Userdata.EmpDetails;

/**
 * Servlet implementation class reg
 */
@WebServlet("/Signup")
public class Signup extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String user=req.getParameter("user");
			String pass=req.getParameter("pass");
			String email=req.getParameter("email");
			//LocalDateTime d=  LocalDateTime.now();
			EmpDetails e=new EmpDetails(user,email,pass,null,null);
			DAOEmployee rd=new DAOEmployee();
			rd.insertEmp(e);
			RequestDispatcher d= req.getRequestDispatcher("login.jsp");
			d.forward(req, resp);
			
	}

}
