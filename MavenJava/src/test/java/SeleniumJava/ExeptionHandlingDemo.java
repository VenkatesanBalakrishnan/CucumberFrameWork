package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExeptionHandlingDemo {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");	
		driver.manage().window().maximize();

		System.out.println("Execution Started");
		try {

			WebElement logo = driver.findElement(By.cssSelector("a[aria-label='Amazon.in']"));
			if(logo.isDisplayed())
			{
				System.out.println("Logo is available");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		catch(Exception e)
		{
			System.out.println("Issue in code");
		}



		




	}}
