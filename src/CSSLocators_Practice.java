import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators_Practice {

	public static void main(String[] args)  {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Implicit wait
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//BY CSS Selectors
		
		//using id 
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		
		
		//using attribute and values
		
		driver.findElement(By.cssSelector("input[placeholder=Password")).sendKeys("123");
		
		//using class Name tagname.className
		
		driver.findElement(By.cssSelector("button.submit")).click();
		
		
		//using class Name .className
		
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
		
		
		
		
		
		
		
		
	}

}
