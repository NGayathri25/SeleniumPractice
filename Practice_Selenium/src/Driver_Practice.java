import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Practice {

	public static void main(String[] args) {
		
		
          
          //setting the path of chromedriver.
          System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
          
        //Invoking chrome browser
          WebDriver driver=new ChromeDriver();
          
          //hitting url from browser and getting the title
          
          driver.get("https://rahulshettyacademy.com/");
          String title=driver.getTitle();
          System.out.println(title);
          
          //To get the current url
          
          String curl=driver.getCurrentUrl();
          System.out.println(curl);
          
          //To close the existing active window
          driver.close();
          
          //To close all the windows opened by automation
         // driver.quit();
          
          
	}


}