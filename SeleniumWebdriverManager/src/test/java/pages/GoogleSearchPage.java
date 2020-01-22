package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;

	
	//Create element using element locator
	By textBoxSearch=By.xpath("//input[@name='q']");
	By buttonSearch=By.name("btnK");
	
	
	//Create constructor - A constructor in Java is a block of code similar to a method
	//That is called an instance of object is created
	//this keyword is used to invoke or instantiate current class constructor
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Create user actions/methods
	public void setTextinSearchBox(String text) {
		driver.findElement(textBoxSearch).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(buttonSearch).click();
		
	}
	
	
	}
