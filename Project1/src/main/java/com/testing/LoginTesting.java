package com.testing;

import java.sql.Connection;
import java.sql.SQLException;

import com.DAO.DAOEmployee;
import com.dbconnection.DBConnection;

public class LoginTesting 

{
	public boolean isConnected() throws SQLException {
		Connection con = DBConnection.getConnect();
		return con != null;
		
	}
	
	public int isUser() {
		
		DAOEmployee dao = new DAOEmployee();
		String empName = "Gana";
		String empPass="12";
		

		
		boolean isValidUser = dao.checkUser(empName,empPass);
		if (isValidUser) return 1;
		return 0;
		
	}
}
