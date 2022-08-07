package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// implicit wait for 10 secs

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dollarama.com/en-CA/");

		Thread.sleep(5000);

		// capture links from a webpage
		WebElement footer = driver.findElement(By.className("footer"));
		List<WebElement> links = footer.findElements(By.tagName("a"));

		// Number of links

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			// by using href attributr we ca get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);

			// create connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			Thread.sleep(2000);
			// establish connection
			httpConn.connect();

			int rescode = httpConn.getResponseCode(); // return response if res code is above 400: broken link

	
			if (rescode >= 400) {
				System.out.println(url + " - " + "is broken link");
			} else {
				System.out.println(url + " - " + "is valid link");
			}

		}

	}

}
