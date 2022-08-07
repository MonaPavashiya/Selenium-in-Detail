package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//login
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
		
		//Admin-->User mangement --> Users
	Actions act = new Actions(driver);
		
		WebElement admin =driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		
		WebElement userManage =driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		
		WebElement users =driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		Thread.sleep(500);
		act.moveToElement(admin).build().perform(); //mouseover to admin tab
		Thread.sleep(500);
		act.moveToElement(userManage).build().perform(); //mouseover to usermanagement tab
		Thread.sleep(500);
		act.moveToElement(users).click().build().perform(); //mouserover to users and click the users
			
		int rowcount =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println(rowcount);
		
		int statusCount =0;
		
		for(int i=1; i<=rowcount; i++)
		{
		      String status =driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[5]")).getText();
		      if(status.equals("Enabled"))
		      {
		    	  statusCount = statusCount +1;
		      }
		}
		
		System.out.println("No.of employess Enabled : " + statusCount);
	
	}

}
