package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitsInSelenium {

	public static void main(String[] args) {
	
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
WebElement element = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		element.sendKeys("headset");
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='button']//following::span[text()=' cover']")));

		System.out.println("End of the Execution");
		driver.quit();
	}

}
