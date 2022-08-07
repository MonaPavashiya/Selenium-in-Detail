package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
	
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement fname= driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname =driver.findElement(By.xpath("//input[@name='lastname']"));
		
		if(fname.isDisplayed() && fname.isEnabled())
		{
			fname.sendKeys("abcd");
		}
		
		if(lname.isDisplayed() && lname.isEnabled())
		{
			lname.sendKeys("hdks");
		}
		
		Thread.sleep(2000);
		//female
		System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
		//male
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isSelected());
		//custom
		System.out.println(driver.findElement(By.xpath("//label[text()='Custom']")).isSelected());
		
		
		//select female radio button
		if (driver.findElement(By.xpath("//label[text()='Female']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//label[text()='Female']")).click();
		}
		
		driver.close();
	}

}
