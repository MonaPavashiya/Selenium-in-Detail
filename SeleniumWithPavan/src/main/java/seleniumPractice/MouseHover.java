package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//login
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		
		//Admin-->User mangement --> Users
	Actions act = new Actions(driver);
		
		WebElement admin =driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement userManage =driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users =driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		act.moveToElement(admin).build().perform(); //mouseover to admin tab
		act.moveToElement(userManage).build().perform(); //mouseover to usermanagement tab
		act.moveToElement(users).click().build().perform(); //mouserover to users and click the users
		
		//act.moveToElement(admin).moveToElement(userManage).moveToElement(users).click().build().perform();
		
	}

}
