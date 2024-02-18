package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.WindowManager;

public class BaseTest {

	protected WebDriver driver;
	protected WindowManager windowManager;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected SignupPage signupPage;
	protected DashboardPage dashboardPage;
	
	protected String phptravelsURL = "https://www.phptravels.net/";

	/**
	 * Setup driver
	 * 
	 * @throws IOException
	 */
	@BeforeMethod
	public void setup() throws IOException {
		driver = new ChromeDriver();
		openSystem();
	}

	/**
	 * taking screenshot for failure TC
	 */
	@AfterMethod

	public void screenshotFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			var camera = (TakesScreenshot) driver;
			File screenshot = camera.getScreenshotAs(OutputType.FILE);
			System.out.println("screenshot taken: " + screenshot.getAbsolutePath());
			try {
				Files.move(screenshot, new File("src/main/resources/Screenshots/" + result.getName() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 driver.close();
		 driver.quit();
	}

	/**
	 * Navigate to phptravels HomePage system
	 */
	private void openSystem() {
		driver.manage().window().maximize();
		assignDrivertoPages();
		windowManager.goToUrl(phptravelsURL);

	}

	/**
	 * assign Driver to Pages
	 */
	private void assignDrivertoPages() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		signupPage = new SignupPage(driver);
		windowManager = new WindowManager(driver);
		dashboardPage = new DashboardPage(driver);
	}

	// Helping Methods
	protected void navigateTopage(String pageURL) {
		windowManager.goToUrl(pageURL);
	}

}
