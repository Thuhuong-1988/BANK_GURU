package pages;

import org.openqa.selenium.WebDriver;

import interfaces.EditCustomerPageUI;
import interfaces.EditCustomerUI;
import commons.AbstractPage;

public class EditCustomer extends AbstractPage {
	private WebDriver driver;
 // ham khoi tao cua home page
	public EditCustomer(WebDriver driver_) {
		this.driver = driver_;
	}
	public void inputCustomerID(String customerID) {
		
		sendkeysToElement(driver, EditCustomerUI.CUSTOMERID_TXT, customerID);
	}
	public EditCustomerPage clickSubmitButton() {
		clickToElement(driver, EditCustomerUI.SUBMIT_BTN);
		return new EditCustomerPage(driver);
	}

	
	public String getEditCustomerMessage() {
		return getTextElement(driver, EditCustomerPageUI.EDITCUSTOMER);
	}
}
