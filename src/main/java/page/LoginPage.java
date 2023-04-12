package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) { 	
		this.driver = driver;
		
	}
	
//	WebElement userNameElement = driver.findElement(By.xpath("//input[@id='username']"));
//	By userNameField = By.xpath("//input[@id='username']");
	
	//List of Elements
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//Corresponding methods for each elements
	public void enterUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	//another way to write the above by combining methods
//	public void loginTest(String userName, String password) {
//		userNameElement.sendKeys(userName);
//		passwordElement.sendKeys(password);
//		signinButton.click();
//	}
//	
}
