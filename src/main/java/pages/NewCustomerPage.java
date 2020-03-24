package pages;

import org.openqa.selenium.WebDriver;
import interfaces.NewCustomerPageUI;
import commons.AbstractPage;

public class NewCustomerPage extends AbstractPage {
	private WebDriver driver;
	
 // ham khoi tao cua home page
	public NewCustomerPage(WebDriver driver_) {
		this.driver = driver_;
	}
 
	public void inputCustomername(String customername) {
		sendkeysToElement(driver, NewCustomerPageUI.CUSTOMERNAME_TXT, customername);
	}
	
	public void selectGender(String gender) {
		selectRadioButton(driver, NewCustomerPageUI.GENDER_RADIOBTN, gender);
	}
	public void inputDateofBirth(String dateofbirth) {
		sendkeysToElement(driver, NewCustomerPageUI.DATEOFBIRTH_TXT, dateofbirth);
	}
	
	public void inputAddress(String address) {
		sendkeysToElement(driver, NewCustomerPageUI.ADDRESS_TXT, address);
	}
	public void inputCity(String city) {
		sendkeysToElement(driver, NewCustomerPageUI.CITY_TXT, city);
	}
	public void inputState(String state) {
		sendkeysToElement(driver, NewCustomerPageUI.STATE_TXT, state);
	}
	public void inputPin(String pin) {
		sendkeysToElement(driver, NewCustomerPageUI.PIN_TXT, pin);
	}
	public void inputMobile(String mobile) {
		sendkeysToElement(driver, NewCustomerPageUI.MOBILE_TXT, mobile);
	}
	public void inputEmail(String email) {
		sendkeysToElement(driver, NewCustomerPageUI.NEW_EMAIL_TXT, email);
	}
	public void inputPassword(String password) {
		sendkeysToElement(driver, NewCustomerPageUI.NEW_PASSWORD_TXT, password);
	}
	public NewCustomerPage clickSubmitButton() {

		clickToElement(driver, NewCustomerPageUI.SUBMIT_BTN);
		return new NewCustomerPage(driver);
	}
	
	public String getNewCustomerMessage() {
		return getTextElement(driver, NewCustomerPageUI.CREATENEWCUSTOMER);
	}

	public String getCustomerID() {
		return getTextElement(driver, NewCustomerPageUI.GETCUSTOMERID_TXT);
	}
	

}
