package interfaces;

public class DepositPageUI {

	public static final String ACCOUNTID_TXT = "//input[@name='accountno']";
	
	public static final String GET_ACCOUNT_NO = "//td[contains(text(),'Account No')]/following-sibling::td";
	
	public static final String AMOUNT_TXT = "//input[@name='ammount']";

	public static final String DESCRIPTION_TXT = "//input[@name='desc']";

	public static final String ACCOUNT_SUBMIT_BTN = "//input[@name='AccSubmit']";
	
	public static final String GET_TEXT_NEW_ACCOUNT = "//p[contains(.,'Account Generated Successfully!!!')]";

	public static final String GET_TOTAL_MONEY = "//td[contains(text(),'Current Balance')]/following-sibling::td";
	
	public static final String GET_DESPOSIT_MESSAGE="//p[contains(.,'Transaction details of Deposit for Account')]";
	
	public static final String GET_IDACCOUNT_DESPOSIT_TXT = "//td[contains(text(),'Account No')]/following-sibling::td";
	
}
