package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class WindowManager {
	private WebDriver driver;
	private Navigation navigate;
	
	public WindowManager(WebDriver driver) {
		this.driver = driver;
		navigate = driver.navigate();
	}
	
	public void goBack() {navigate.back();}
	public void goForward() {navigate.forward();}
	public void refreshPage() {navigate.refresh();}
	public void goToUrl(String url) {navigate.to(url);}
	public void deleteCookies() {driver.manage().deleteAllCookies();}
	
}
