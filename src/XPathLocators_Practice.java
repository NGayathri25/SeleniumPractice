import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author Gayathri
 *
 */
public class XPathLocators_Practice {

	
	
	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdrive.chrome.driver", "chromedriver.exe"); 
  
  
  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
  
  driver.get("https://rahulshettyacademy.com/locatorspractice/");
  
  //LInk text locator
  driver.findElement(By.linkText("Forgot your password?")).click();
  
  //Indexing xpath
  driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Test123");
  
  //indexing css
  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Test123@gmail.com");
  
  
  //traversing xpath from parent to child
  driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
  
  Thread.sleep(2000);
  
  //using css class name
  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
  
 
  
   String returnString=  driver.findElement(By.cssSelector("p")).getText();
   System.out.println(returnString);
  
  
  driver.quit();
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}

}
