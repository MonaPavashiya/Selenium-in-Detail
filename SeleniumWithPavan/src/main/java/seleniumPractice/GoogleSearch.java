package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.ca/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("javatpoint");
	    Thread.sleep(2000);
	    
	    List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
	    System.out.println(list.size());

	    Thread.sleep(2000);
	    
	    for(int i =0; i<list.size(); i++)
	    {
	    	String listitems = list.get(i).getText();
	    	System.out.println(listitems);
	    	
	    	if(listitems.contains("javatpoint interview questions"))
	    	{
	    		list.get(i).click();
	    		break;
	    		
	    	}
	    }
	    driver.close();
	  
	}

}
