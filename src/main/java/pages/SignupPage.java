package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class SignupPage {

	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	// parameters
	public WebDriver driver;
	private ElementActions elementActions;

	// SignupPage elements
	private By firstName = By.id("firstname");
	private By lastName = By.id("last_name");

	private By countryOptions = By.className("filter-option-inner-inner");
	private By selectedCountry = By.id("bs-select-1-63");

	private By phone = By.id("phone");
	private By userEmail = By.id("user_email");
	private By passwordTxt = By.id("password");
	private By IamNotRobotCheckbox = By.id("recaptcha-anchor");
	private By submitBTN = By.id("submitBTN");

	// SignupPage Methods

	public void typeFirstName(String fName) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(firstName, fName);
	}

	public void typeLastName(String lName) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(lastName, lName);
	}

	public void clickOnCountryFilter() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(countryOptions);
	}

	public void clickOnEgyptCountry() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(selectedCountry);
	}

	public void typePhoneNumber(String phoneNumber) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(phone, phoneNumber);
	}
	public void typeEmail(String email) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(userEmail, email);
	}
	public void typePassword(String password) {
		elementActions = new ElementActions(driver);
		elementActions.typeValue(passwordTxt, password);		
	}
	
	public void checkIamNotRobot() {
		elementActions = new ElementActions(driver);
		elementActions.clickButton(IamNotRobotCheckbox);
	}
	public void submit() {
		elementActions = new ElementActions(driver);
		elementActions.typeEnter(submitBTN);
	}
}
