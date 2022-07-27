package Testcaseorange;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeTest {
	WebDriver driver;
  @Test
  public void valid() {
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	 
  }
  @Test
  public void Invalid() {
	  driver.findElement(By.id("txtUsername")).sendKeys("admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	 
	  
  }
  @BeforeMethod
  public void Browserinitiate() {
	WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver","C:\\Seleniumjars\\chromedriver.exe");
	         driver=new ChromeDriver();
	         Reporter.log("Browser");
	         driver.get("https://opensource-demo.orangehrmlive.com");
	         driver.manage().window().maximize();
	        
  }
  
  @AfterMethod
  public void close() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
	  
  }
}
