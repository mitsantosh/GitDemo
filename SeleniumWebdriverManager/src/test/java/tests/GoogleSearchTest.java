package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

	public static WebDriver driver;


	@BeforeTest   
	public void setupTest() {

		//Instantiate browser driver
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}


	@Test
	public void googleSarch() {

		//Create object of page class
		GoogleSearchPage searchpageObj=new GoogleSearchPage(driver);

		//Create test
		driver.get("https://www.google.com/");
		searchpageObj.setTextinSearchBox("Selenium");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}



}

