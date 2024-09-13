package SeleniumJava;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		EdgeOptions ops = new EdgeOptions();
		ops.addArguments("--incognito");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://cacert.com/");
		driver.manage().window().maximize();

}}
