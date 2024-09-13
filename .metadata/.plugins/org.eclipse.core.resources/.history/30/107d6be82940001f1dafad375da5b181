package TestNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BestSellerPage;
import pages.HeaderPage;
import pages.SearchResultPage;
import webDriverFactorypackage.WebDriverFactory;

public class AnnotationExampleSmokeSuite extends WebDriverFactory{
	
	WebDriver driver;

@Test
public void TC_01() throws Exception
{
	driver=WebDriverFactory.driverLaunch();
	driver.get("https://www.amazon.in/");
	HeaderPage homepage = new HeaderPage(driver);
	homepage.clickBestSeller(driver);
	BestSellerPage bestSellerpage = new BestSellerPage(driver);
	bestSellerpage.verifyRanking(driver);
	bestSellerpage.Colorverify(driver);
	
	}

@Test
public void TC_02() throws Exception
{
	driver=WebDriverFactory.driverLaunch();
	driver.navigate().to("https://www.amazon.in/");
	HeaderPage headerpage = new HeaderPage(driver);
	headerpage.enterSearchAmazonResultValue(driver, "HeadPhone");
	SearchResultPage searchResultPage = headerpage.clickMagifireSearch(driver);
	searchResultPage.verifyResult(driver);
	
	}
@Test
public void TC_03() throws IOException
{
	driver=WebDriverFactory.driverLaunch();
	System.out.println("Test Case 3");
	
	driver.get("https://mail.google.com/");
	}

//@BeforeMethod
//public void driverLaunching() throws IOException
//{
//	AnnotationExampleSmokeSuite annotationExample = new AnnotationExampleSmokeSuite();
//	driver= annotationExample.driverLaunch();
//	}
//
//@AfterMethod
//public void driverClose()
//{
//	driver.quit();
//	}
@BeforeClass
public void beforeClassEX()
{
	System.out.println("Before Class Example");
	}
@AfterClass
public void afterClassEX()
{
	System.out.println("After Class Example");

	}
@BeforeTest
public void beforeTestEX()
{
	System.out.println("Before Test Example");
	}
@AfterTest
public void afterTestClassEX()
{
	System.out.println("After Test Example");
	}
@BeforeSuite
public void beforeSuiteEX()
{
	System.out.println("Before Suite Example");
	}
@AfterSuite
public void afterSuiteEX()
{
	System.out.println("After Suite Example");

	}

}
