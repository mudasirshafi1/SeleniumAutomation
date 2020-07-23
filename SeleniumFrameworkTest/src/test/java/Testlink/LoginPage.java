package Testlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;

	public static WebElement Login_username(WebDriver driver) 
	{
		element = driver.findElement(By.name("userName"));
		return element;
	}
	
	public static WebElement Login_Password(WebDriver driver)
	{
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement Login_Button(WebDriver driver)
	{
		element = driver.findElement(By.id("login"));
		return element;
		
	}
}
