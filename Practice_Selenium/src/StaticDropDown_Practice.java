import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticDropDown_Practice {
	public static void main(String args[])
	{
		System.setProperty("webdrive.chrome.driver", "chromedriver.exe"); 
		  
		  
		  WebDriver driver = new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  
		 //static dropdown
		  WebElement dp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  
		  Select s = new Select(dp);
		  
		 s.selectByIndex(3);
		 
		 String text= s.getFirstSelectedOption().getText();
		 
		 System.out.println(text);
		 
		 s.selectByVisibleText("INR");
		 System.out.println(s.getFirstSelectedOption().getText());
		 
		 s.selectByValue("AED");
		 System.out.println(s.getFirstSelectedOption().getText());
		 

		 
		 
		 
		 //dynamic dropdown where dont have select tag
		 
		 
		 
		 
		  
		  
	}

}
