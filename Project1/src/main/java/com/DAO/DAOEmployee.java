package com.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Userdata.EmpDetails;
import com.dbconnection.DBConnection;

public class DAOEmployee {
	public boolean insertEmp(EmpDetails e) {
		String sql="insert into emp(email,empName,empPass,regDate) values(?,?,?,now())";
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1, e.getEmail());
			p.setString(2,e.getEmpName());
			p.setString(3,e.getPass());
			//p.setDate(4,   e.getRegDate());
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
		
	}
	
public int validateUser() {
        
        DAOEmployee dao = new DAOEmployee();
        String empName = "Gana";
        String pass = "123";
        boolean isValidUser = dao.validateUser(empName,pass);
        if (isValidUser)
            return 1;
        return 0;
        
    }
	public String checkUser(String user ) {
		String sql="select empPass from emp where empName=?";
		String pass1 = null;
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			ResultSet rd= p.executeQuery();
			
			while(rd.next()) {
			  pass1=rd.getString("empPass");
			}
			return pass1;
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		
	}
	
	
	
	public boolean deleteRegistration(String empName) {
		String query = "delete from emp where empName = ?";

		try {
			PreparedStatement statement = DBConnection.getConnect().prepareStatement(query);
			statement.setString(1, empName);
			return statement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	public boolean updateRegistration(String email, String empName) {
		String query = "update emp set email = ? where empName = ?";

		try {
			PreparedStatement statement = DBConnection.getConnect().prepareStatement(query);
			statement.setString(1, empName);
			statement.setString(2, email);
			return statement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
	
	
	
	public List<EmpDetails> ViewUserDetails( String s){
		List<EmpDetails> l= new ArrayList<>();
		String sql="select * from empdet where empName=?";
		
		try {
			PreparedStatement p= DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,s);
			EmpDetails em= null;
			ResultSet res=p.executeQuery();
			while(res.next()) {
				String user=res.getString("empName");
				String email=res.getString("email");				
				String login=res.getString("Login");
				String logout=res.getString("Logout");
				em= new EmpDetails(user,email,null,login,logout);
			l.add(em);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
	}
	public boolean validateUser(String empName, String password) {
		
		return false;
	}
	
	public boolean updateEmpIn(String user) {
		String sql="update emp set logdate=now() where empName=?"; 
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
		
	}
	public boolean updateEmpOut(String user) {
		String sql="update emp set logout=now() where login=?"; 
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean inser2(String user) {
		String sql="insert into empdet (empName,login) values(?,now())";
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return false;
		
	}
	public boolean updatel(String dl) {
		String sql="update empdet set logout=now() where login=?";
		try {
			PreparedStatement p=DBConnection.getConnect().prepareStatement(sql);
			p.setString(1,dl);
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return false;
		
	}
	public String getI(String user) {
		String sql="select login from empdet where empName=?  order by login desc limit 1";
		try {
			PreparedStatement p= DBConnection.getConnect().prepareStatement(sql);
			p.setString(1, user);
			ResultSet r=p.executeQuery();
			String d=null;
			while(r.next()) {
				d=r.getString("login");
						
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public String getO(String user) {
		String sql="select logout from empdet where empName=? order by login desc limit 1";
		try {
			PreparedStatement p= DBConnection.getConnect().prepareStatement(sql);
			p.setString(1, user);
			ResultSet r=p.executeQuery();
			String d=null;
			while(r.next()) {
				d=r.getString("logout");
						
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	


}
