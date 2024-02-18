package pages;

import org.openqa.selenium.WebDriver;

import utilities.ElementActions;

public class DashboardPage {

	// parameters
		public WebDriver driver;
		private ElementActions elementActions;
		
		public DashboardPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public String getPageTitle() {
			System.err.println("The page title is: "+driver.getTitle());
			return driver.getTitle();
		}
}
