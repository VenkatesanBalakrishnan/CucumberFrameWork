package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrameDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frm3"); // parent frame
		
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='frm2']"));
		
		driver.switchTo().frame(frameEle);
		
		WebElement txtfirstEle =driver.findElement(By.cssSelector("input[id='firstName']"));
		
		txtfirstEle.sendKeys("Selenium Practice");
		System.out.println("End of Excecution");
		
	}

}
