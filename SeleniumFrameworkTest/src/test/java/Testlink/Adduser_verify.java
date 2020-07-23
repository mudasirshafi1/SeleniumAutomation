package Testlink;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Adduser_verify {

	WebDriver driver = null;
	
	@BeforeTest
	public void setuptest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void logintest() {	
		
		driver.get("http://localhost/testlink/login.php");
	    driver.manage().window().setSize(new Dimension(1250, 824));
	    driver.findElement(By.id("login")).sendKeys("admin");
	    driver.findElement(By.name("tl_password")).sendKeys("admin");
	    driver.findElement(By.name("login_submit")).click();
	    driver.switchTo().frame(1);
	    driver.findElement(By.linkText("User Management")).click();
	    driver.findElement(By.name("doCreate")).click();
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.name("login")).sendKeys("user4");
	    driver.findElement(By.name("firstName")).sendKeys("User Number 4");
	    driver.findElement(By.name("lastName")).sendKeys("test");
	    driver.findElement(By.id("password")).sendKeys("user3");
	    driver.findElement(By.id("email")).sendKeys("user4@yopmail.com");
	    driver.findElement(By.name("do_update")).click();
	    System.out.println("User Added successfully");
		}
	
	  @Test
	  public void testDB() throws ClassNotFoundException, SQLException {
		  
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  System.out.println("Driver Loaded successfully");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testlink","root","");
		  
		  System.out.println("Connected to database successfully");
		  
		  Statement stmt=con.createStatement();
		  	  
		  ResultSet rs=stmt.executeQuery("SELECT * FROM users");
		
		 
	while (rs.next())
		 {
								
			//Get login Name
		String login=rs.getString("login");
		System.out.println("Login Name is " +login);
			
			//Get Email
		String email=rs.getString("email");
		System.out.println("Email address is " +email);
			
			//Get First name
		String Fname=rs.getString("first");
		System.out.println("First name is " +Fname);
			
		 }
		  
	  }
	
		
	@AfterTest
	public void teardown() {
		
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}

		
	
	
