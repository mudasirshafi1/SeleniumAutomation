package Testlink;

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

public class LoginTestcase_TestNG {

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
	    driver.findElement(By.name("login")).sendKeys("user3");
	    driver.findElement(By.name("firstName")).sendKeys("user3");
	    driver.findElement(By.name("lastName")).sendKeys("test");
	    driver.findElement(By.id("password")).sendKeys("user3");
	    driver.findElement(By.id("email")).sendKeys("user3@yopmail.com");
	    driver.findElement(By.name("do_update")).click();
		}
	
	
	
		
	@AfterTest
	public void teardown() {
		
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}

		
	
	
