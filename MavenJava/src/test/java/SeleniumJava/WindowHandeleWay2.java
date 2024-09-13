package SeleniumJava;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandeleWay2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement btnEle =driver.findElement(By.cssSelector("button[id='newTabBtn']"));
		btnEle.click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		ArrayList<String> list =new ArrayList<>(windowhandles);
		driver.switchTo().window(list.get(1));
		
		WebElement titleEle =driver.findElement(By.cssSelector("h1[align=\"center\"]"));
		
		if(titleEle.isDisplayed())
		{
			System.out.println("Alert new tab navigated");
		}
		else
		{
			System.out.println("Unable to navigate new tab");
		}
		
		
		
	}

}
