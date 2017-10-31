package de.isanuric.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDB {
	
	private static final String DB_URL   = "jdbc:mysql://localhost:3306/DB03";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "einis";
	private static final String SQL      = "select * from login where uname=? and upass=?";
	private boolean result;


	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean checkUserLoginInfo(String uname, String upass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection       = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement statement = connection.prepareStatement(SQL);
			
			statement.setString(1, uname);
			statement.setString(2, upass);
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				setResult(true);
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		return false;
	}
	
	public String getLoginMessage() {
		
		if (!this.result) {
			return "wrong username or password, please try again!";
		}
		return "please login";	
	}
	
	
	
}
