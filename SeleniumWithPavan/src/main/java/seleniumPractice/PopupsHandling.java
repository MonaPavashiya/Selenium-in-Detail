package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsHandling {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); //maximize window
			
			//driver.get("http://the-internet.herokuapp.com/basic_auth");
			
			//how to skip pop window
			//you need to know username and password
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			//capture the text message
			 String text =  driver.findElement(By.cssSelector("p")).getText();
			 System.out.println(text);

			 
	}

}
