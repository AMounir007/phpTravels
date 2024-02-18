package test;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.SignupPage;

public class SignupTest extends BaseTest {

	//Parameters
	private SignupPage signupPage; 
	//Signup URL
	private String signupURL = "https://www.phptravels.net/signup";
	
	// Data
	private Faker dataFake = new Faker();
	String firstName = dataFake.name().username().toString();
	String lastName = dataFake.name().name().toString();
	String phoneNumber = dataFake.phoneNumber().cellPhone();
	String password = dataFake.random().toString();
			
	// Test Case methods
	@Test
	public void testSuccessfulSignup() {
		navigateTopage(signupURL);
		signupPage = new SignupPage(driver);
		signupPage.typeFirstName(firstName);
		signupPage.typeLastName(lastName);
		signupPage.clickOnCountryFilter();
		signupPage.clickOnEgyptCountry();
		signupPage.typePhoneNumber(phoneNumber);
		signupPage.typeEmail(firstName+"@gmail.com");
		signupPage.typePassword(password);
		System.out.println("the generated password: "+password);
		signupPage.checkIamNotRobot();
		
	}
	
}
