package pages;

import org.openqa.selenium.WebDriver;

import interfaces.BalanceEnqiryPageUI;
import commons.AbstractPage;

public class BalanceEnquiryPage extends AbstractPage {
	private WebDriver driver;

	public BalanceEnquiryPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputAccountNo(String accountid) {
		sendkeysToElement(driver, BalanceEnqiryPageUI.ACCOUNT_NO_TXT,accountid );
	}

	public BalanceEnquiryPage clickSubmitButton() {
		clickToElement(driver, BalanceEnqiryPageUI.ACCOUNT_SUBMIT_BTN);
		return new BalanceEnquiryPage(driver);
	}
	public String getBalance() {
		return getTextElement(driver, BalanceEnqiryPageUI.GET_BALANCE_TXT);
	}
	public String getMessage_BalanceEnquiry() {
		return getTextElement(driver, BalanceEnqiryPageUI.GET_MESSAGE_BALANCE_ENQIRY);
	}
	public String getAccountID() {
		return getTextElement(driver, BalanceEnqiryPageUI.GET_ACCOUNT_ID);
	}

}
