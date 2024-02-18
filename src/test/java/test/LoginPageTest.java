package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

	//Login page Parameter
	LoginPage loginPage;
	String loginURL= "https://www.phptravels.net/login";
	
	//Data
	private String email = "xigoh59291@astegol.com";
	private String password = "xigoh59291@astegol.com";
	private String loginPageTitle="Login";
	private String dashboardPageTitle = "Dashboard";
	
	@Test
	public void testSuccessfullLoginByAddingCorrectUserNameAndCorrectPassword() {
		navigateTopage(loginURL);
		loginPage = new LoginPage(driver);
		loginPage.typeUserName(email);
		loginPage.typePassword(password);
		loginPage.submitLogin();
		assertTrue(dashboardPage.getPageTitle().contains(dashboardPageTitle),"User can't login with CORRECT Data");
	}
	
	@Test
	public void testNOTSuccessfullLoginByAddingWRONGUserNameAndCorrectPassword() {
		navigateTopage(loginURL);
		loginPage = new LoginPage(driver);
		loginPage.typeUserName("abc@abc.com");
		loginPage.typePassword(password);
		loginPage.submitLogin();
		assertTrue(loginPage.getPageTitle().contains(loginPageTitle),"User can login with WRONG Data");
	}
	@Test
	public void testNOTSuccessfullLoginByAddingWRONGUserNameAndWRONGPassword() {
		navigateTopage(loginURL);
		loginPage = new LoginPage(driver);
		loginPage.typeUserName("abc@abc.com");
		loginPage.typePassword("password");
		loginPage.submitLogin();
		assertTrue(loginPage.getPageTitle().contains(loginPageTitle),"User can login with WRONG Data");
	}
}
