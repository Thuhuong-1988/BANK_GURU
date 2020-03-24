package pages;

import org.openqa.selenium.WebDriver;
import interfaces.FundTransferPageUI;
import commons.AbstractPage;

public class FundTransferPage extends AbstractPage {
	private WebDriver driver;

	public FundTransferPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputAccountIDPay(String accountid) {
		sendkeysToElement(driver, FundTransferPageUI.ACCOUNT_PAY_TXT,accountid );
	}
	public void inputAccountIDReceive(String accountid) {
		sendkeysToElement(driver, FundTransferPageUI.ACCOUNT_RECEIVE_TXT,accountid );
	}
	public void inputAmount(String amount) {
		sendkeysToElement(driver, FundTransferPageUI.AMOUNT_TXT,amount );
	}
	public void inputDescription(String description) {
		sendkeysToElement(driver, FundTransferPageUI.DESCRIPTION_TXT,description );
	}

	public FundTransferPage clickSubmitButton() {
		clickToElement(driver, FundTransferPageUI.ACCOUNT_SUBMIT_BTN);
		return new FundTransferPage(driver);
	}
	public String getAccountPay() {
		return getTextElement(driver, FundTransferPageUI.GET_PAY_ACCOUNT_FUND_TRANSFER_TXT);
	}
	public String getMessage_Fund_Transfer() {
		return getTextElement(driver, FundTransferPageUI.GET_MESSAGE_FUND_TRANSFER);
	}
	
	public String geCurrentAmountFundTransfer() {
		return getTextElement(driver, FundTransferPageUI.GET_MONEY_FUND_TRANSFER_TXT);
	}

}
