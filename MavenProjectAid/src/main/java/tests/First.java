
package tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class First {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog1() {
 driver.get("https://www.softwaretestingmaterial.com/");
  }
  @Test
  public void openMyBlog2() {
 driver.get("https://www.guru99.com/testng-execute-multiple-test-suites.html");
  }
  
  @BeforeClass
  public void beforeClass() {
   
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayurb\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}