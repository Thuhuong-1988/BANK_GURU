package commons;

import java.util.Random;

public class Constants {

	// Luu thong tin cua url, username, pass dung chung cho ca project
	public static final String BANK_URL = "http://demo.guru99.com/v4";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	
	public static final String customerName = "huongvtt";
	public static final String gender = "MALE";
	public static final String dateOfBirth = "01/01/1988";
	public static final String addess = "THANH XUAN";
	public static final String city = "HA NOI";
	public static final String state = "HA NOI";
	public static final String pin = "123456";
	public static final String mobile = "987773333";
	public static final String newEmail = "automation" + randomData() + "@gmail.com";
	public static final String newPassword = "123456";
	public static final String customerID = "";
	public static final String editCustomerName = "Thu Huong";
	public static final String editGender = "MALE";
	public static final String editDateOfBirth = "1988/09/09";
	public static final String editAddess = "HA DONG";
	public static final String editCity = "HA NAM";
	public static final String editState = "HA NAM";
	public static final String editPin = "222222";
	public static final String editMobile = "999999999";
	public static final String editNewEmail = "automation" + randomData() + "@gmail.com";
	public static final String editNewPassword = "123456";
	
	public static final String initialDesposit = "50000";
	public static final String desposit = "5000";
	public static final String description = "transfer money";
	public static final String amountwithdraw = "15000";
	public static final String amountFundTransfer = "10000";
	
	
	public static final String CHROME_DRIVER_PATH = "./resources/chromedriver";


	
	public static int randomData() {
		Random rand = new Random();
		
		int number = rand.nextInt(100000) + 1;
		return number;
	}
}
