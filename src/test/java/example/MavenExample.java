package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class MavenExample {
	private static WebDriver driver;
	
  @Test
  public void Calculation() {
	  
	  driver.findElement(By.id("email")).sendKeys("212345678965");
	  driver.findElement(By.id("pass")).sendKeys("123456789");
	  driver.findElement(By.xpath(".//[@value = 'Log In']")).click();
  }
  @BeforeMethod
  public void Openbrowser() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT"
				+ "\\Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
  }

  @AfterMethod
  public void browserclose() {
	  driver.quit();
  }

}
