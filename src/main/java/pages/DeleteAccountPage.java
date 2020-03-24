package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import interfaces.BalanceEnqiryPageUI;
import commons.AbstractPage;

public class DeleteAccountPage extends AbstractPage {
	private WebDriver driver;

	public DeleteAccountPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputAccountNo(String accountid) {
		sendkeysToElement(driver, BalanceEnqiryPageUI.ACCOUNT_NO_TXT,accountid );
	}

	public DeleteAccountPage clickSubmitButton() {
		clickToElement(driver, BalanceEnqiryPageUI.ACCOUNT_SUBMIT_BTN);
		return new DeleteAccountPage(driver);
	}
	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

}
