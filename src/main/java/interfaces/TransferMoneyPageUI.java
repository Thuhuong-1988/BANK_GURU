package interfaces;

public class TransferMoneyPageUI {

	public static final String ACCOUNT_PAY_TXT = "//input[@name='payersaccount']";
	
	public static final String ACCOUNT_RECEIVE_TXT = "//input[@name='payeeaccount']";

	public static final String AMOUNT_TXT = "//input[@name='ammount']";

	public static final String DESCRIPTION_TXT = "//input[@name='desc']";

	public static final String ACCOUNT_SUBMIT_BTN = "//input[@name='AccSubmit']";
	
	public static final String GET_RECEIVE_ACCOUNT_FUND_TRANSFER_TXT = "//td[contains(text(),'Account Number ')]/following-sibling::td";
	
	public static final String GET_MONEY_FUND_TRANSFER_TXT = "//td[contains(text(),'Amount')]/following-sibling::td";
	
	public static final String GET_MESSAGE_FUND_TRANSFER="//p[contains(.,'Fund Transfer Details')]";
}
