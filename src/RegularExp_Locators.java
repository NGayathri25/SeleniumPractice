import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExp_Locators {
	
	public static void main(String args[]) { 
	
	System.setProperty("webdrive.chrome.driver", "chromedriver.exe"); 
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  
	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  
	  //CSS regular exp
	  
	  driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("Test123@gmail.com");
	  
	  //xpath regular exp
	  
	  driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
	  
	  driver.findElement(By.className("signInBtn")).click();
	  
	}  

}
