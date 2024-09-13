package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindowHandle {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement btnClick = driver.findElement(By.cssSelector("button[id='newWindowsBtn']"));
		btnClick.click();
		
		Set<String>WindowHandle = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<>(WindowHandle);
		System.out.println("Window ID'd are :");
		for(String k:list)
		{
			System.out.println(k);
		}
		
		driver.switchTo().window(list.get(1));
		
		WebElement firstEle =driver.findElement(By.xpath("//h1[text()='Register']"));
		
		if(firstEle.isDisplayed())
		{
			System.out.println("first window navigated");
		}
		else
		{
			System.out.println("Unable to navigate first window");
		}
		
		
driver.switchTo().window(list.get(2));
		
		WebElement SecEle =driver.findElement(By.xpath("//h1[text()='Basic Controls in HTML']"));
		
		if(SecEle.isDisplayed())
		{
			System.out.println("Second window navigated");
		}
		else
		{
			System.out.println("Unable to navigate Second window");
		}
		
		//driver.switchTo().defaultContent();// it will switch the control back to the parent window
		driver.switchTo().window(list.get(0));
		
	WebElement whiteTxt =driver.findElement(By.cssSelector("input[id='name']"));
	
	whiteTxt.sendKeys("Parent window Navigated");
	
	
	//driver.quit();// Used to closed all the windows including parent & child
	}
	
	

}
