package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLoginwithTestNG1 {
	public static WebDriver driver;

	@BeforeTest   
	public void setupTest() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

	}

	@Test
	public void adminLogin1() {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	}
	@Test
	public void adminLogin2() {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	}
	
	@Test
	public void adminLogin3() {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
