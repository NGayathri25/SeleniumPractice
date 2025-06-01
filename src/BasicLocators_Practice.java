import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators_Practice {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Locators by id
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		//By name
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahul123");
		
		//By class name
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		//By Tag Name
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
	}

}
