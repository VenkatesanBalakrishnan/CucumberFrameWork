package SeleniumJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionClassDemoAndTakescreenShot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		Actions action = new Actions(driver);
		
//		WebElement lstHome =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
//		
//		action.moveToElement(lstHome).perform();
//		
//		WebElement lstAll =driver.findElement(By.xpath("//span[text()='Your Account']"));
//		action.click(lstAll).perform();
//		
//		WebElement scrollbtn =driver.findElement(By.xpath("//h2[text()='Subscriptions']"));
//		
//		action.scrollToElement(scrollbtn).perform();
	
		
		//Key board actions:
		
//WebElement txtEle = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//txtEle.sendKeys("headset");
//action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform(); // -- method chaining
////action.sendKeys(Keys.ENTER).perform();
//action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_DOWN).build().perform();
	
		
		//Take ScreenShots :
		
		TakesScreenshot ts = (TakesScreenshot)driver; // type casting
		
		File Source = ts.getScreenshotAs(OutputType.FILE); // actual screenshot step
		File desti = new File("./Screenshot/"+ System.currentTimeMillis()+".png"); // creating destination folder
		FileUtils.copyFile(Source, desti);
		
		
		
		
	}

}
