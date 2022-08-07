package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.navigate().to("https://www.facebook.com/");
		
		
		WebElement newAcc =driver.findElement(By.linkText("Create new account"));
		WebElement fname= driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname =driver.findElement(By.xpath("//input[@name='lastname']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(newAcc)).click();
		wait.until(ExpectedConditions.visibilityOf(fname)).sendKeys("abcd");
		wait.until(ExpectedConditions.visibilityOf(lname)).sendKeys("mnop");

		//driver.quit();
	}

}


