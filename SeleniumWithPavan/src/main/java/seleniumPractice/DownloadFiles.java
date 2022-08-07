package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException 
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/FileDownload.html"); 
		driver.manage().window().maximize(); 
		
		//Download text file
		driver.findElement(By.id("textbox")).sendKeys("Testing files");
		Thread.sleep(2000);
		Actions at = new Actions(driver);
		driver.findElement(By.id("createTxt"));
		at.click().build().perform();
		
		//at.moveToElement(l).click().build().perform();
		
		/*Thread.sleep(2000);
		driver.findElement(By.id("link-to-download")).click();*/
		
	}

}
