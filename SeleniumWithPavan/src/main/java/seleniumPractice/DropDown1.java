package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropDown1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);

		Thread.sleep(2000);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(2000);
		// Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		
		Thread.sleep(2000);
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
	}
}
