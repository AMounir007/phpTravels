package pages;

import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class HomePage {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver driver;
	private ElementActions elementActions;	
}
