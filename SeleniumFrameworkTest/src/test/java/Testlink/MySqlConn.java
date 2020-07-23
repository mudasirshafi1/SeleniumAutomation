package Testlink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MySqlConn {
	
  @Test
  public void testDB() throws ClassNotFoundException, SQLException {
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  
	  System.out.println("Driver Loaded successfully");
	  
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testlink","root","");
	  
	  System.out.println("Connected to database successfully");
	  
	  Statement stmt=con.createStatement();
	  	  
	ResultSet rs=stmt.executeQuery("SELECT * FROM users");
	//ResultSet rs=stmt.executeQuery("SELECT * FROM `users` WHERE `login`= 'mudasir'");
	
	 
while (rs.next())
	 {
	
	//	String Username=rs.getString("login");
	//	System.out.println("Username of user added successfully is " +Username );
	
		
		//Get login Name
	String login=rs.getString("login");
	System.out.println("Login Name is" +login);
		
		//Get Email
	String email=rs.getString("email");
	System.out.println("Email address is" +email);
		
		//Get First name
	String Fname=rs.getString("first");
	System.out.println("First name is" +Fname);
		
	 }
	  
  }
}
