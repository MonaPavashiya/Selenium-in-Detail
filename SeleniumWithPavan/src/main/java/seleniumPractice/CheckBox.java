package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); //maximize window
		
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//b[text()='Admin']")).click();
			
			driver.findElement(By.xpath("//input[@value='10']")).click();
			driver.findElement(By.xpath("//input[@value='46']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='32']")).click();
			driver.findElement(By.xpath("//input[@value='43']")).click();
			driver.findElement(By.xpath("//input[@value='17']")).click();
			driver.quit();
	}

}
