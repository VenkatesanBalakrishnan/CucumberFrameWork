package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		
		driver.manage().window().maximize();
		
		WebElement clickEle = driver.findElement(By.xpath("//li[@id='Accepted Elements']"));
		
		Actions action = new Actions(driver);
		
		action.click(clickEle).perform();
		
		Thread.sleep(3000);
		
		WebElement FrameEle =driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		
		driver.switchTo().frame(FrameEle);
		
		//Way - 1:
			
		WebElement SourceEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement DisEle = driver.findElement(By.xpath("//div[@id='droppable']"));

		//action.dragAndDrop(SourceEle, DisEle).build().perform();
		
		//Way - 2:
		
		
		//Point location = DisEle.getLocation();
		//System.out.println("X point is "+ location.getX());
		//System.out.println("Y point is "+ location.getY());
		//action.dragAndDropBy(SourceEle, 272, 18).build().perform();
		
		
		//Way-3:
		
		action.moveToElement(SourceEle).click().clickAndHold().release(DisEle).build().perform();
	}

}
