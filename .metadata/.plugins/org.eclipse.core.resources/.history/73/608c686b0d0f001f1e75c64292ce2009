package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;


public class WebTableDemo {
	

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://letcode.in/table");	
		driver.manage().window().maximize();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='simpletable']//tr//td[1]"));
		
	for(WebElement element : findElements)
		{
			String text = element.getText();
			System.out.println("Text value is : "+ text);
	}
		
		
		
	}

}
