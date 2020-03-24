package pages;

import org.openqa.selenium.WebDriver;
import interfaces.WithDrawalPageUI;
import commons.AbstractPage;

public class WithDrawalPage extends AbstractPage {
	private WebDriver driver;

	public WithDrawalPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputAccountID(String accountid) {
		sendkeysToElement(driver, WithDrawalPageUI.ACCOUNTID_TXT,accountid );
	}
	public void inputAmountWithDraw(String amount) {
		sendkeysToElement(driver, WithDrawalPageUI.AMOUNT_TXT,amount );
	}
	public void inputDescription(String description) {
		sendkeysToElement(driver, WithDrawalPageUI.DESCRIPTION_TXT,description );
	}

	public WithDrawalPage clickAccountSubmitButton() {
		clickToElement(driver, WithDrawalPageUI.ACCOUNT_SUBMIT_BTN);
		return new WithDrawalPage(driver);
	}
	public String getWithDrawalMessage() {
		return getTextElement(driver, WithDrawalPageUI.GET_MESSAGE_WITHDRAWAL);
	}
	public String getCurrentWithDrawal() {
		return getTextElement(driver, WithDrawalPageUI.GET_CURRENT_WITHDRAWAL_TXT);
	}
		
	public String getIDAccountWithDrawal() {
		return getTextElement(driver, WithDrawalPageUI.GET_IDACCOUNT_WITHDRAWAL_TXT);
	}
}
