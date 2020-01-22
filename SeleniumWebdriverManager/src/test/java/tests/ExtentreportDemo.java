package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportDemo {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		 // start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
       
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "Test to search in Google");
        
    	WebDriverManager.chromedriver().setup();
    	driver =new ChromeDriver();
    	
    	test1.log(Status.INFO, "Starting Test Case");
    	    	driver.get("https://www.google.com/");
    	    	test1.pass("Navigated to google.com");
    	    	
    	    	
   		driver.findElement(By.name("q")).sendKeys("Automation");
   		 		   		test1.pass("Entered text in searchbox");
   		

		
		
		driver.close();
		test1.pass("Closed the browser");
		
		test1.info("Test Completed");
		
		  // calling flush writes everything to the log file
        extent.flush();
	}

}
