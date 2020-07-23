package Testlink;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsertest {

	public static void main(String[] args) {
		
		//Set Firefox browser
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\MudasirShafi\\Selenium Test Cases\\SeleniumFramework\\Drivers\\Geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Set Chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MudasirShafi\\Selenium Test Cases\\SeleniumFramework\\Drivers\\Chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//using webdriver manager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Launch Website
		driver.get("https://ksa1.aconex.com/Logon");
		 // Login
        driver.findElement(By.name("userName")).sendKeys("supportpmis");  
        driver.findElement(By.name("password")).sendKeys("P*ssw0rd$9999");  
        driver.findElement(By.id("login")).click();
        //Wait for 10 seconds to load the page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  driver.findElement(By.id("nav-bar-CORRESPONDENCE")).click();
       // driver.findElement(By.xpath("//button[@id=\'nav-bar-CORRESPONDENCE\']/div/div/div")).click();
         //driver.findElement(By.cssSelector("body.regType-DOC:nth-child(2) div.nav div.nav-barRow div.navBar button.uiButton.navBarButton.open:nth-child(4) div.uiButton-content div.bicon.ic-CORRESPONDENCE > div.uiButton-label")).click();
        driver.findElement(By.xpath("//button[@id=\'nav-bar-CORRESPONDENCE\']/div/div/div")).click();
        driver.findElement(By.id("nav-bar-CORRESPONDENCE-CORRESPONDENCE-SEARCHINBOX")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("rawQueryText")).sendKeys("payment");
        //driver.findElement(By.id("nav-bar-CORRESPONDENCE-CORRESPONDENCE-SEARCHINBOX")).click();
        //driver.close(); 
        //driver.quit();
	}
}
