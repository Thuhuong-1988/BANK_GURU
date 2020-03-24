package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import interfaces.DeleteCustomerPageUI;
import commons.AbstractPage;

public class DeleteCustomerPage extends AbstractPage {
	private WebDriver driver;
 // ham khoi tao cua home page
	public DeleteCustomerPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputCustomerID(String customerid) {
		sendkeysToElement(driver, DeleteCustomerPageUI.CUSTOMERID_TXT,customerid );
	}

	public DeleteCustomerPage clickSubmitButton() {
		clickToElement(driver, DeleteCustomerPageUI.CUSTOMER_SUBMIT_BTN);
		return new DeleteCustomerPage(driver);
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
