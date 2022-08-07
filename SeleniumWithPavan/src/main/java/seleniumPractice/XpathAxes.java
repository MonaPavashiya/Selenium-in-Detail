package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();

	//self - selects the current node
	    String text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/self::a")).getText();
	    System.out.println("Self : " + text);
	
	//parent -selects the parent of the current node(always one)
	    text =driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/parent::td")).getText();
	    System.out.println("Parent : " +text);
	    
	//child -selects all the childern of the current node (one or many)
	    List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/child::td"));
	    System.out.println("Number of childs : " + childs.size());
	    
	//Ancestor -selects all Ancestors(parent, grandparent, etc.)
	    text =driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr")).getText();
	    System.out.println("Ancestor : " +text);
	    
	//Descendant - selects all Descendants(children, grandchildren, etc.)
	    List<WebElement> descendants =driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/descendant::*"));
	    System.out.println("Number of descendant nodes : " + descendants.size() );
	    
	//Following - selects everything in the document after the closing tag of the current node
	    List<WebElement> Following= driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following::tr"));
	    System.out.println("Number of Following nodes : " + Following.size() );
	    
	// Following-siblings - selects all siblings after the current node
	    List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following-sibling::tr"));
	    System.out.println("Number of Following-siblings nodes : " + followingsiblings.size() );
	    
	//Preceding - selects all nodes that are appear before the current node in the document
	    List<WebElement> Preceding= driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding::tr"));
	    System.out.println("Number of Preceding nodes : " + Preceding.size() );
   
	//Preceding-siblings - selects all siblings before the current node in the document
	    List<WebElement> Precedingsibling= driver.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding-sibling::tr"));
	    System.out.println("Number of Preceding-sibling nodes : " + Precedingsibling.size() );    
	   
	}

}
