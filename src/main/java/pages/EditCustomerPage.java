package pages;

import org.openqa.selenium.WebDriver;

import interfaces.EditCustomerPageUI;
import commons.AbstractPage;

public class EditCustomerPage extends AbstractPage {
	private WebDriver driver;

	// ham khoi tao cua home page
	public EditCustomerPage(WebDriver driver_) {
		this.driver = driver_;
	}
	public String getCustomerName() {
		return getTextElement(driver, EditCustomerPageUI.CUSTOMERNAME_TXT);
	}
	public void ChangeCustomerName(String customername) {
		 clearTextbox(driver, EditCustomerPageUI.CUSTOMERNAME_TXT, customername);
		sendkeysToElement(driver, EditCustomerPageUI.CUSTOMERNAME_TXT, customername);
	}
	public String getcustomernametext()
	{
		return getTextElement(driver, EditCustomerPageUI.CUSTOMERNAME_TXT);
	}

	public void ChangeGender(String gender) {
		clearTextbox(driver, EditCustomerPageUI.GENDER_TXT, gender);
		sendkeysToElement(driver, EditCustomerPageUI.GENDER_TXT, gender);
	}

	public void ChangeDateofBirth(String dateofbirth) {
		clearTextbox(driver, EditCustomerPageUI.DATEOFBIRTH_TXT, dateofbirth);
		sendkeysToElement(driver, EditCustomerPageUI.DATEOFBIRTH_TXT, dateofbirth);
	}

	public void ChangeAddress(String address) {
		clearTextbox(driver, EditCustomerPageUI.ADDRESS_TXT, address);
		sendkeysToElement(driver, EditCustomerPageUI.ADDRESS_TXT, address);
	}

	public void ChangeCity(String city) {
		clearTextbox(driver, EditCustomerPageUI.CITY_TXT, city);
		sendkeysToElement(driver, EditCustomerPageUI.CITY_TXT, city);
	}

	public void ChangeState(String state) {
		clearTextbox(driver, EditCustomerPageUI.STATE_TXT, state);
		sendkeysToElement(driver, EditCustomerPageUI.STATE_TXT, state);
	}

	public void ChangePin(String pin) {
		clearTextbox(driver, EditCustomerPageUI.PIN_TXT, pin);
		sendkeysToElement(driver, EditCustomerPageUI.PIN_TXT, pin);
	}

	public void ChangeMobile(String mobile) {
		clearTextbox(driver, EditCustomerPageUI.MOBILE_TXT, mobile);
		sendkeysToElement(driver, EditCustomerPageUI.MOBILE_TXT, mobile);
	}

	public void ChangeEmail(String email) {
		clearTextbox(driver, EditCustomerPageUI.NEW_EMAIL_TXT, email);
		sendkeysToElement(driver, EditCustomerPageUI.NEW_EMAIL_TXT, email);
	}

	public EditCustomerPage clickSubmitButtonUpdate() {
		clickToElement(driver, EditCustomerPageUI.SUBMIT_UPDATE_BTN);
		return new EditCustomerPage(driver);
	}

	public String getEditCustomerMessage() {
		return getTextElement(driver, EditCustomerPageUI.EDITCUSTOMER);
	}
	
}
