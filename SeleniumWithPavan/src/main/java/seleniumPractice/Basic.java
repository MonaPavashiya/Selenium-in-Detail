package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.dollarama.com/en-CA/"); //launch URL
		driver.manage().window().maximize(); //maximize window
		
		String exptitle = "Bulk sales, cases of retail good | Dollarama"; //expected title
		
		//get the title page
		String acttitle = driver.getTitle();  //will get actual title
		System.out.println("Page Title : "  + driver.getTitle());
		
		//validation
		if(exptitle.equals(acttitle))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.close(); //close current window
		//driver.quit(); //close multiple windows
	}

}
