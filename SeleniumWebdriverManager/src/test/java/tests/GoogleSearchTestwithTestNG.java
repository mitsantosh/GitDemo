package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFIle;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTestwithTestNG {
	public static WebDriver driver;
	public static String browserName=null;


	@BeforeTest   
	public void setupTest() {

		PropertiesFIle.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}


	}


	@Test
	public void googleSarch() {

		GoogleSearchPage searchpageObj=new GoogleSearchPage(driver);

		//Create test
		driver.get("https://www.google.com/");
		searchpageObj.setTextinSearchBox("abcd");

	}


	@AfterTest
	public void tearDown() {
		driver.close();
	}



}

