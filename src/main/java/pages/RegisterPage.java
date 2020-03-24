package pages;

import org.openqa.selenium.WebDriver;
import interfaces.RegisterPageUI;
import commons.AbstractPage;

public class RegisterPage extends AbstractPage {
	WebDriver driver;

	// ham khoi tao cua register page
	public RegisterPage(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputEmail(String email) {
		sendkeysToElement(driver, RegisterPageUI.EMAIL_TXT, email);
	}

	public void clickSubmitButton() {
		clickToElement(driver, RegisterPageUI.SUBMIT_BTN);
	}

	public String getUsername() {
		return getTextElement(driver, RegisterPageUI.GETUSERNAME_TXT);
	}

	public String getPassword() {
		return getTextElement(driver, RegisterPageUI.GETPASSWORD_TXT);

	}

	public LoginPage openLoginPage(String loginUrl) {
		openAnyUrl(driver, loginUrl);
		return new LoginPage(driver);
	}

}
