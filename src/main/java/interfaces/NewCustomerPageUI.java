package interfaces;

public class NewCustomerPageUI {
	
	public static final String CUSTOMERNAME_TXT="//input[@name='name']";
	
	public static final String GENDER_RADIOBTN="//input[@value='m']";
	
	public static final String DATEOFBIRTH_TXT="//input[@name='dob']";
	
	public static final String ADDRESS_TXT="//textarea[@name='addr']";
	
	public static final String CITY_TXT="//input[@name='city']";
	
	public static final String STATE_TXT="//input[@name='state']";
	
	public static final String PIN_TXT="//input[@name='pinno']";
	
	public static final String MOBILE_TXT="//input[@name='telephoneno']";
	
	public static final String NEW_EMAIL_TXT="//input[@name='emailid']";
	
	public static final String NEW_PASSWORD_TXT="//input[@name='password']";
	
	public static final String SUBMIT_BTN="//input[@name='sub']";
	
	public static final String CREATENEWCUSTOMER="//p[contains(.,'Customer Registered Successfully!!!')]";
	
	public static final String GETCUSTOMERID_TXT = "//td[contains(text(),'Customer ID')]/following-sibling::td";
	
}
