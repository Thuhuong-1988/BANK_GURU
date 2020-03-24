package interfaces;

public class BalanceEnqiryPageUI {

	public static final String ACCOUNT_NO_TXT = "//input[@name='accountno']";

	public static final String ACCOUNT_SUBMIT_BTN = "//input[@name='AccSubmit']";
	
	public static final String GET_BALANCE_TXT = "//td[contains(text(),'Balance')]/following-sibling::td";
	
	public static final String GET_ACCOUNT_ID = "//td[contains(text(),'Account No')]/following-sibling::td";
	
	public static final String GET_MESSAGE_BALANCE_ENQIRY="//p[contains(.,'Balance Details for Account ')]";
}
