package interfaces;

public class DeleteCustomerPageUI {

	public static final String CUSTOMERID_TXT = "//input[@name='cusid']";

	public static final String CUSTOMER_SUBMIT_BTN = "//input[@name='AccSubmit']";
	
	public static final String GET_BALANCE_TXT = "//td[contains(text(),'Balance')]/following-sibling::td";
	
	public static final String GET_MESSAGE_BALANCE_ENQIRY="//p[contains(.,'Balance Details for Account 39839')]";
}
