package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// parameters
	public WebDriver driver;
	private ElementActions elementActions;
	
	//LoginPage elements
	private By userName = By.name("email");
	private By password = By.name("password");
	private By submitBtn = By.id("submitBTN");
	
	//Login Methods
	public void typeUserName(String userNameValue) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(userName, userNameValue);
	}
	
	public void typePassword(String passwordValue) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(password, passwordValue);		
	}
	public DashboardPage submitLogin() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(submitBtn);
		return new DashboardPage(driver);
	}
	public String getPageTitle() {
		System.err.println("The page title is: "+driver.getTitle());
		return driver.getTitle();
	}
}
