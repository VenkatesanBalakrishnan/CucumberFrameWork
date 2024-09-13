package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		WebElement btnpromtEle = driver.findElement(By.cssSelector("button[id='promptBox']"));
		 btnpromtEle.click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Selenium");
		alt.dismiss();
		btnpromtEle.click();
		System.out.println(alt.getText());
		alt.accept();
		
		
	}

}
