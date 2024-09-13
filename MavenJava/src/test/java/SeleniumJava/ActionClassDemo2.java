package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
public class ActionClassDemo2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		WebElement movebtn = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[1]"));
		action.moveToElement(movebtn).perform();
		
		WebElement clickbtn = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		action.click().perform();
		driver.navigate().back();
		
		WebElement doubleclick = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		action.doubleClick(doubleclick).perform();
		
		action.contextClick(doubleclick).perform();

	}

}
