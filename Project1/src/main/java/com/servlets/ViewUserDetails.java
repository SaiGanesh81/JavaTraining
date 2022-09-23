package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.DAOEmployee;
import com.Userdata.EmpDetails;


@WebServlet("/ViewUserDetails")
public class ViewUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOEmployee dao = new DAOEmployee();
		HttpSession hs= request.getSession();
		String user = (String) hs.getAttribute("user");
		List<EmpDetails> list = dao.ViewUserDetails( user);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<font> <center> <h1> Details Of Employee </h1> </center> </font>");
		out.println("<div id='table-container' align='center'>");
		out.println("<table border='1px' border-radius:'1px'>");
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<th> Employee Name </th>");
		
		out.println("<th> Login </th>");
		out.println("<th> Logout </th>");
		out.println("<th> Email </th>");
		out.println("</tr>");
		for (EmpDetails users : list) {
			out.println("<tr>");
			out.println("<td>" + users.getEmpName() + "</td>");
			out.println("<td>" + users.getLogin() + "</td>");
			out.println("<td>" + users.getLogout() + "</td>");
			out.println("<td>" + users.getEmail() + "</td>");
			out.println("<td> <a href = 'Delete?empName=" + users.getEmpName() + "'> Delete" + "</td>");
			
			out.println("</tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("</div>");
		
		out.println("<font color=dodgerblue> <center> <h3> <a href = 'view.jsp'> Home Page </a>  </h3> </center> </font> ");
		out.println("</body>");
		out.println("</html>");
	}

}
