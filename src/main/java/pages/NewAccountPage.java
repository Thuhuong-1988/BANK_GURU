package pages;

import org.openqa.selenium.WebDriver;
import interfaces.NewAccountPageUI;
import commons.AbstractPage;

public class NewAccountPage extends AbstractPage {
	private WebDriver driver;

	public NewAccountPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputCustomerID(String customerid) {
		sendkeysToElement(driver, NewAccountPageUI.CUSTOMERID_TXT, customerid);
	}
	public void selectAccountType(String accounttype) {
		selectItemDropdown(driver, NewAccountPageUI.ACCOUNT_TYPE_LIST, accounttype);
	}
	
	public void inputInitialDesposit(String initialdesposit) {
		sendkeysToElement(driver, NewAccountPageUI.INITIAL_DEPOSIT_TXT, initialdesposit);
	}

	public NewAccountPage clickSubmitButton() {
		clickToElement(driver, NewAccountPageUI.SUBMIT_BTN);
		return new NewAccountPage(driver);
	}
	public String getNewAccountMessage() {
		return getTextElement(driver, NewAccountPageUI.GET_TEXT_NEW_ACCOUNT);
	}
	public String getAccountID() {
		return getTextElement(driver, NewAccountPageUI.GET_ACCOUNT_ID);
	}
	public String getCurrentAmount() {
		return getTextElement(driver, NewAccountPageUI.GET_CURRENT_AMOUNT);
	}

}
