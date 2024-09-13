package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement clickbtn = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		JavascriptExecutor jse =(JavascriptExecutor)driver; // Type casting
		jse.executeScript("arguments[0].click();", clickbtn); // click
		
		
		
		WebElement scrollbtn = driver.findElement(By.xpath("//h2[text()='Bestsellers in Bags, Wallets and Luggage']"));
		
		jse.executeScript("arguments[0].scrollIntoView();", scrollbtn);// Scroll based on element
		
		jse.executeScript("window.scroll(0, 300);", ""); // scroll based on X, Y 
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, 600);", "");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 1000);", "");
		
		WebElement texttype =driver.findElement(By.cssSelector("input[type='text']"));
		jse.executeScript("arguments[0].setAttribute('value', 'Testing Purpose');", texttype);
		
		

		
		
	}

}
