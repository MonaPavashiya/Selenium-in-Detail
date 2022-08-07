package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.navigate().to("https://www.facebook.com/");
		
//implicitly wait is always define at driver level or globally... is available for all webelements.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement fname= driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname =driver.findElement(By.xpath("//input[@name='lastname']"));
		
		fname.sendKeys("abcd");
		lname.sendKeys("mnop");
		
		driver.quit();
	}

}
