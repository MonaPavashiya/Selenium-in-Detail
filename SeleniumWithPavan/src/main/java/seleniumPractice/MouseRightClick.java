package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act =new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(button).build().perform(); //will right lick on element
		
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click(); //click the edit option
		
		System.out.println(driver.switchTo().alert().getText()); //capture the text from alert box
		
		driver.switchTo().alert().accept(); //close the alert box or accept the alert
	
	}

}
