package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	// Test Data
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = " Dashboard ";
	String contactsHeaderText = "Contacts";
	String addContactHeaderText = "Add Contact";
	String fullName = "Taba Khan";
	String company = "Apple";
	String email = "framework@techfios.com";
	String phone = "817494";
	String country = "Uzbekistan";
	String currency = "USD";
	String group = "Selenium";
	String welcomeEmail = "No";

	@Test
	public void userShouldBeAbleToAddCustomer() {

		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickSigninButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);
		dashboardPage.clickCustomersMenuElement();
		dashboardPage.clickAddCustomerMenuElement();

		AddCustomerPage addContactPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addContactPage.clickNavMenu();
		addContactPage.validateContactsHeader(contactsHeaderText);
		addContactPage.validateAddContactHeader(addContactHeaderText);
		addContactPage.insertFullName(fullName);
		addContactPage.selectCompany(company);
		addContactPage.insertEmail(email);
		addContactPage.insertPhone(phone);
		addContactPage.selectCountry(country);
		addContactPage.selectCurrency(currency);
		addContactPage.selectGroup(group);
		addContactPage.toggleWelcomeEmail();
		addContactPage.clickSaveButton();
		
	}

}
