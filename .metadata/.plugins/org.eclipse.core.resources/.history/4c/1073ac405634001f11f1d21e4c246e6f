package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

	WebDriver driver;

	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	/*************Web Element Declaration*********/

	@FindBy(how=How.XPATH,using="//a[text()='Best Sellers']")
	private WebElement btnBestSeller;


	@FindBy(how=How.CSS,using="input[id='twotabsearchtextbox']")
	WebElement txtBoxSearch;

	@FindBy(how=How.CSS,using="input[type='submit']")
	private WebElement btnsearchmagnifier;

	/************Reusable***********/

	/**
	 * Used to click "Best Seller in home page"
	 * @author 612387094
	 * @param driver
	 * @return BestSellerPage
	 */
	public BestSellerPage clickBestSeller(WebDriver driver)

	{
		//btnBestSeller =driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		btnBestSeller.click();
		return new BestSellerPage(driver); // it will use way 2
	}

	/**
	 * Used to enter "Search Text" value in the text box
	 * @author 612387094
	 * @param driver, text
	 * @return HeaderPage
	 */
	public HeaderPage enterSearchAmazonResultValue(WebDriver driver, String text)

	{
		txtBoxSearch.sendKeys(text);
		return this;
	}

	/**
	 * Used to click on "Magnifier Search"
	 * @author 612387094
	 * @param driver
	 * @return HeaderPage
	 */
	public SearchResultPage clickMagifireSearch(WebDriver driver)

	{
		btnsearchmagnifier.click();
		return new SearchResultPage(driver);
	}

}

