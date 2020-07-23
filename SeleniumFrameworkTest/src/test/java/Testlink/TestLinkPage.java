package Testlink;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestLinkPage {


	public static class TLoginPage {

		private static WebElement element = null;

		public static WebElement Login_Tusername(WebDriver driver) 
		{
			element = driver.findElement(By.id("login"));
			return element;
		}
		
		public static WebElement Login_TPassword(WebDriver driver)
		{
			element = driver.findElement(By.name("tl_password"));
			return element;
		}
		
		public static WebElement Login_TButton(WebDriver driver)
		{
			element = driver.findElement(By.id("login_div"));
			return element;
			
		}
	}

}
