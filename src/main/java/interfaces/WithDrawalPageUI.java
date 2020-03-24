package interfaces;

public class WithDrawalPageUI {

	public static final String ACCOUNTID_TXT = "//input[@name='accountno']";

	public static final String AMOUNT_TXT = "//input[@name='ammount']";

	public static final String DESCRIPTION_TXT = "//input[@name='desc']";

	public static final String ACCOUNT_SUBMIT_BTN = "//input[@name='AccSubmit']";
	
	public static final String GET_CURRENT_WITHDRAWAL_TXT = "//td[contains(text(),'Current Balance')]/following-sibling::td";
	
	public static final String GET_IDACCOUNT_WITHDRAWAL_TXT = "//td[contains(text(),'Account No')]/following-sibling::td";

	public static final String GET_MESSAGE_WITHDRAWAL="//p[contains(.,'Transaction details of Withdrawal for Account ')]";
}
