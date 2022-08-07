package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebTable2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
       
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
		//Admin-->User mangement --> Users
	Actions act = new Actions(driver);
		
		WebElement PIM =driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
		WebElement employeeList =driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
		
		act.moveToElement(PIM).build().perform(); 
		act.moveToElement(employeeList).click().build().perform(); 
		
		Thread.sleep(500);	
		int rowcount =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("Number of Rows : " + rowcount);
		
		int statusCount =0;
		for(int i=1; i<=rowcount; i++)
		{
			for(int j=2; j<=4; j++)
			{
		      String rowText =driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText();
		      System.out.print(rowText + "  ");
		      statusCount = statusCount +1; 
			}
	
			System.out.println();
		}
	}		
}
