package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/"); 
			
		driver.manage().window().maximize(); 
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername).click()
			.keyDown(txtUsername, Keys.SHIFT).sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername)
            .contextClick().build();
			seriesOfActions.perform();
		}

	}


