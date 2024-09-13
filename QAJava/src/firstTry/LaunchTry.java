package firstTry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchTry {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL:" + currentUrl );
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		
		driver.manage().window().maximize();
		Thread.sleep(2000); // wait 2sec
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
	
		//driver.close();
	
	WebElement textEmail = driver.findElement(By.id("identifierId")); //Store location as a webElement
	
	textEmail.sendKeys("Venkateshkrish1996");
	textEmail.clear();
	
	
WebElement textEmail2 = driver.findElement(By.name("identifier")); 
	
	textEmail2.sendKeys("00000");
	
WebElement textEmail3 = driver.findElement(By.tagName("input")); 
	
	textEmail3.sendKeys("1111");
	
	//driver.close();
	
driver.get("https://www.flipkart.com/");

WebElement E = driver.findElement(By.linkText("Microwave Ovens")); 

E.click();

WebElement E1 = driver.findElement(By.partialLinkText("Bati")); 

E1.click();
	
	}
	
}