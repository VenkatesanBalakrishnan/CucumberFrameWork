package SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		
		//System.setProperty("webDriver.edge.driver","C:\\Users\\612387094\\Downloads\\edgedriver_win64");

		WebDriver driver = new EdgeDriver();

		driver.navigate().to("https://accounts.google.com/");
		driver.manage().window().maximize();

		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='identifierId']"));

		txtEmail.sendKeys("glfgjjasxkugysgcj");

		WebElement btnNext = driver.findElement(By.cssSelector("div[id='identifierNext']"));

		//if(btnNext.isDisplayed())
		//if(!(btnNext.isDisplayed()))
		if(btnNext.isEnabled())
			//if(!(btnNext.isEnabled()))
		{
			btnNext.click();
		}
		else {
			System.out.println("Button is Not Available");
		}



		Thread.sleep(3000);

		WebElement txtErrorMsg =driver.findElement(By.xpath("//div[@class='Ekjuhf Jj6Lae']"));

		//String txtmsg = txtErrorMsg.getText();
		String txtInner = txtErrorMsg.getAttribute("innerText");


		System.out.println(txtInner);

		WebElement dumElem =driver.findElement(By.cssSelector("input[name='usi']"));

		String dummytext=dumElem.getAttribute("value");

		String dummyName=dumElem.getAttribute("type");

		System.out.println("Attribute value method"+ dummytext);
		System.out.println("Attribute and its value method"+ dummyName);

		if(txtInner.equals("Couldn’t find your Google Account"))

			System.out.println("Wrong Email ID");

		else {
			System.out.println("Next page of login");
		}


	}}	









//}

