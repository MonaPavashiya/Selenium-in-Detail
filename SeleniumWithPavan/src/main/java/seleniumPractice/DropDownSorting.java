package seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSorting {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); //maximize window
			driver.navigate().to("https://testautomationpractice.blogspot.com/"); //launch URL
			
			WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
            
		Select se =new Select(element);
            
            List<String> originalList = new ArrayList<String>();
            List<String> tempList = new ArrayList<String>();
            
            List <WebElement> options = se.getOptions();
            
            for(WebElement e : options)
            {
            	originalList.add(e.getText());
            	tempList.add(e.getText());
            }
            System.out.println("Before sorting Original list : " + originalList);
            System.out.println("Before sorting Temp list : " + tempList);
            
            Collections.sort(tempList);
            System.out.println("After sorting original list : " + originalList);
            System.out.println("After sorting Temp list : " + tempList);
	
            if(originalList == tempList)
            {
            	System.out.println("DropDown sorted");
            }
            else
            {
            	System.out.println("DropDown not sorted");
            }
 
            se.selectByIndex(1); //by index
            se.selectByValue("cat"); //by value
            se.selectByVisibleText("Baby Cat"); //by visible text
            
            se.getOptions().size(); // will get Numbers of elements present in dropdown
            System.out.println("Numbers of elements present in dropdown : " + se.getOptions().size());    
	}
}
