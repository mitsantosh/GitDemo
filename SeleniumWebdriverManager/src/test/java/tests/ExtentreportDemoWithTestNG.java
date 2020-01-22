package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportDemoWithTestNG {

	ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
	 WebDriver driver;
	 
	@BeforeSuite
	public void setup() {
		 htmlReporter = new ExtentHtmlReporter("extent.html");
		 extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	    
	       		
}

	@BeforeTest   
	public void setupTest() {
			WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		   
	   }
	
	@Test
	public void test1() throws IOException {
		 ExtentTest test1 = extent.createTest("My First Test with TestNG", "Description of Test");
		 
		 driver.get("https://www.google.com/");
	    	test1.pass("Navigated to google.com");
	    	
		 test1.log(Status.INFO, "This step shows usage of log(status, details)");
		 
			

	        // info(details)
	        test1.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	        
		
	}
	
	@Test
	public void test2() throws IOException {
		 ExtentTest test1 = extent.createTest("My Second Test with TestNG", "Description of Test");
		 
		 test1.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test1.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test1.addScreenCaptureFromPath("screenshot.png");
	        
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully");
	}

	
	@AfterSuite
	public void teardown() {
		// calling flush writes everything to the log file
        extent.flush();
		
	}
}
