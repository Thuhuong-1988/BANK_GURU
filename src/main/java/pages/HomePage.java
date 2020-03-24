package pages;

import org.openqa.selenium.WebDriver;

import interfaces.HomePageUI;
import commons.AbstractPage;

public class HomePage extends AbstractPage {
	private WebDriver driver;
 // ham khoi tao cua home page
	public HomePage(WebDriver driver_) {
		this.driver = driver_;
	}

	public String getWelcomeHomePageMessage() {
		return getTextElement(driver, HomePageUI.WELCOME_MESSAGE);
	}

}
