package pages;

import org.openqa.selenium.WebDriver;
import interfaces.DepositPageUI;
import commons.AbstractPage;

public class DepositPage extends AbstractPage {
	private WebDriver driver;

	public DepositPage(WebDriver driver_) {
		this.driver = driver_;
	}

	public void inputAccountID(String accountid) {
		sendkeysToElement(driver, DepositPageUI.ACCOUNTID_TXT, accountid);
	}

	public void inputAmountDeposit(String amountdeposit) {
		sendkeysToElement(driver, DepositPageUI.AMOUNT_TXT, amountdeposit);
	}

	public void inputDescription(String description) {
		sendkeysToElement(driver, DepositPageUI.DESCRIPTION_TXT, description);
	}

	public DepositPage clickAccountSubmitButton() {
		clickToElement(driver, DepositPageUI.ACCOUNT_SUBMIT_BTN);
		return new DepositPage(driver);
	}

	public String getDepositMessage() {
		return getTextElement(driver, DepositPageUI.GET_DESPOSIT_MESSAGE);
	}

	public String getTotalMoney() {
		return getTextElement(driver, DepositPageUI.GET_TOTAL_MONEY);
	}

	public String getIDAccountDeposit() {
		return getTextElement(driver, DepositPageUI.GET_IDACCOUNT_DESPOSIT_TXT);
	}

	public String getAccountNo() {
		return getTextElement(driver, DepositPageUI.GET_ACCOUNT_NO);
	}

}
