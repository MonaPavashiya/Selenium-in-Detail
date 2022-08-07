package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	// URL launch
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		
	// object of Actions class to scroll up and down
	Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

	// identify element on scroll down
		Thread.sleep(2000);
		WebElement l = driver.findElement(By.linkText("Jasmine.Morgan"));

		String strn = l.getText();
		System.out.println("Text obtained by scrolling down is :" + strn);

		at.sendKeys(Keys.PAGE_UP).build().perform();

	// identify element on scroll up
		WebElement m = driver.findElement(By.id("branding"));
		String s = m.getText();
		System.out.println("Text obtained by scrolling up is :" + s);

	}

}
