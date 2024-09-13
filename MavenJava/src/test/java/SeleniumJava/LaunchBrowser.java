package SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://accounts.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	

	}

}
