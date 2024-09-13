package SeleniumJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement btnEle= driver.findElement(By.cssSelector("button[id='newTabBtn']"));
		btnEle.click();
		//
		
		String parentwindowhandel = driver.getWindowHandle();
		System.out.println("Parent window handle is " + parentwindowhandel); // it will return particular window ID
		
		Set<String> WindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = WindowHandles.iterator();
		while(iterator.hasNext())
		{
			String ChildWindowHandle=iterator.next();
			
			if(!(parentwindowhandel.equals(ChildWindowHandle)))
			{
				driver.switchTo().window(ChildWindowHandle);
			}
			
			//
			
			//WebElement titleAlert = driver.findElement(By.xpath("//h1[@itemprop='name']"));
			WebElement titleEle =driver.findElement(By.cssSelector("h1[align='center']"));
			if(titleEle.isDisplayed())
			{
				System.out.println("Alert New tab navigated");
			}
			else {
				
				System.out.println("Alert new tab not navigated ");
			}
			
		}
		
	}

}
