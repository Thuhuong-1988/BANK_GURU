package pages;

import org.openqa.selenium.WebDriver;
import interfaces.LoginPageUI;

import commons.AbstractPage;

public class LoginPage extends AbstractPage {
	WebDriver driver;

	// tao ham khoi tao
	public LoginPage(WebDriver driver_) {
		this.driver = driver_;
	}

	public String getURL() {
		return getCurrentUrl(driver);
	}

	public RegisterPage clickHereLink() {
		clickToElement(driver, LoginPageUI.HERE_LINK);
		return new RegisterPage(driver);
	}

	public void inputUsername(String username) {
		sendkeysToElement(driver, LoginPageUI.USERNAME_TXT, username);
	}

	public void inputPassword(String password) {

		sendkeysToElement(driver, LoginPageUI.PASSWORD_TXT, password);
	}

	public HomePage clickLoginButton() {

		clickToElement(driver, LoginPageUI.LOGIN_BTN);
		return new HomePage(driver);
	}

}
