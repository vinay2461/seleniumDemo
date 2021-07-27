package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void launch() {
		
		driver.get("https://www.fisglobal.com/en/");
		driver.manage().window().maximize();
	}
	
  @Test
  public void f() {
	  String expectTitle=driver.getTitle();
	  System.out.println(expectTitle);
	  
	  
  }
  
  @AfterTest
  public void logout() {
	  driver.quit();
	  driver.quit();
  }
}
