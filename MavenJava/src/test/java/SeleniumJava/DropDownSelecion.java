package SeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelecion {
	
	static WebDriver driver;
	
	public WebDriver launchURL(String url)
	{
		WebDriverManager.edgedriver().setup();
		
		 driver =new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public WebDriver selectClass(WebDriver driver) throws InterruptedException
	{
		WebElement element= driver.findElement(By.cssSelector("select[name='country']"));
		
		Select select = new Select(element);
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@name='country']/option"));
		
		//List<WebElement> options = select.getOptions();
		
		for(WebElement tem : options)
		{
			System.out.println(tem.getText());
			String actualtext=tem.getText();
			
			if(actualtext.equals("NEPAL"))
			{
				tem.click();
			}
		
		}
		
		//select.selectByIndex(10);
		//Thread.sleep(3000);
		//select.selectByValue("BANGLADESH");
		//Thread.sleep(3000);
		//select.selectByVisibleText("INDIA");
		
		return driver;
	}
	public void multiSelectDropDown(WebDriver driver) throws InterruptedException
	{
		WebElement multiselectEle = driver.findElement(By.cssSelector("select[id='cars']"));
		Select select = new Select(multiselectEle);
       System.out.println("If the multi select available ? " + select.isMultiple());
		
       if(select.isMultiple()) {
		select.selectByIndex(3);
		Thread.sleep(3000);
		select.selectByValue("opel");
		Thread.sleep(3000);
		select.selectByVisibleText("Volvo");
		
		select.deselectByIndex(0);
		select.deselectByValue("opel");
		select.deselectByVisibleText("Audi");
		}
       
		else {
			
			System.out.println("Multi select option is not available");
		}
		
		
	}
	
	public void bootStrapSelect(WebDriver driver)
	{
		WebElement drpProducttype = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		drpProducttype.click();
		WebElement drpproductvalue = driver.findElement(By.xpath("//li[text()='Accounts']"));
		drpproductvalue.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		DropDownSelecion D = new DropDownSelecion();
		
		D.launchURL("https://demo.guru99.com/test/newtours/register.php");
		D.selectClass(driver);
		//D.multiSelectDropDown(driver);
		//D.bootStrapSelect(driver);
	}

}
