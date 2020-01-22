import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
	
		
		
		/*
		 * WebDriverManager.firefoxdriver().setup(); WebDriver driver=new
		 * FirefoxDriver(); driver.get("https://mvnrepository.com/");
		 */
			
			WebDriverManager.iedriver().setup();
			WebDriver driver=new InternetExplorerDriver();
			driver.get("https://mvnrepository.com/");
	}

}
