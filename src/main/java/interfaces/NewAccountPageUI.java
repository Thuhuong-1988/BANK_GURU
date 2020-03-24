package interfaces;

public class NewAccountPageUI {

	public static final String CUSTOMERID_TXT="//input[@name='cusid']";
	public static final String ACCOUNT_TYPE_LIST = "//select[@name='selaccount']";

	public static final String INITIAL_DEPOSIT_TXT = "//input[@name='inideposit']";

	public static final String SUBMIT_BTN = "//input[@name='button2']";
	
	public static final String GET_TEXT_NEW_ACCOUNT = "//p[contains(.,'Account Generated Successfully!!!')]";

	public static final String GET_ACCOUNT_ID = "//td[contains(text(),'Account ID')]/following-sibling::td";
	
	public static final String GET_CURRENT_AMOUNT= "//td[contains(text(),'Current Amount')]/following-sibling::td";
	
}
