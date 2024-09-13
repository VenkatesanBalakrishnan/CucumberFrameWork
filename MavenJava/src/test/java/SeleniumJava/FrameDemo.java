package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frm1");
		
		WebElement drpCourse = driver.findElement(By.cssSelector("select[id='course']"));
		
		Select select = new Select(drpCourse);
		
		select.selectByVisibleText("Java");
		System.out.println("End of the Excecution");
		
	}

}
