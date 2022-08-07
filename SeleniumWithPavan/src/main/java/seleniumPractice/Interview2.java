package seleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter URL : ");
		String url = sc.nextLine();
		System.out.println("URL is: " + url);
		
	
		System.out.println("Enter any number between 1 to 20 : ");
		int n= sc.nextInt();
		System.out.println("Total number of links want to check: "+ n);
		sc.close();
		
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 driver.get(url); 
		 List<WebElement> links =driver.findElements(By.tagName("a"));
		 System.out.println("All found links : " + links.size());
		 
		 
		 WebElement link1 = driver.findElement(By.linkText("About")); link1.click();
			List<WebElement> links2 =driver.findElements(By.tagName("a"));
			System.out.println(links2.size());
		 for (WebElement link : links)
		 {
			System.out.println(link.getSize());
			
		 }
		 
			 
			 
			 
			 
			 
			 
			 
			 
				/*
				 * WebElement link1 = driver.findElement(By.linkText("About")); link1.click();
				 * List<WebElement> links2 =driver.findElements(By.tagName("a"));
				 * System.out.println(links2.size());
				 */
		 
		 driver.quit();
		 
		
		

	}

}
