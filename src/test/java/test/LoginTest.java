package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	// Test Data
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); // Creating a loginPage object

		loginPage.enterUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();

		// create object with the help of PageFactory
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);

		// BrowserFactory.tearDown();

	}

}
