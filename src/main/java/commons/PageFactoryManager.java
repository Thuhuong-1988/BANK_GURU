package commons;

import org.openqa.selenium.WebDriver;

import pages.BalanceEnquiryPage;
import pages.DeleteAccountPage;
import pages.DeleteCustomerPage;
import pages.DepositPage;
import pages.EditCustomer;
import pages.FundTransferPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewCustomerPage;
import pages.NewAccountPage;
import pages.RegisterPage;
import pages.WithDrawalPage;


public class PageFactoryManager {

	// mỗi lần gọi tới 1 page thì;
	// kiểm tra page đó tồn tại hay chưa
	// nếu như tồn tại rồi thì nó k khởi tạo
	// chưa tồn tại thì nó khởi tạo

	private static HomePage homePage;
	private static LoginPage loginPage;
	private static RegisterPage registerPage;
	private static NewCustomerPage newCustomerPage;
	private static EditCustomer editCustomer;
	private static DeleteCustomerPage deleteCustomerPage;
	private static NewAccountPage newAccountPage;
	private static DepositPage depositPage;
	private static WithDrawalPage withDrawalPage;
	private static FundTransferPage fundTransferPage;
	private static BalanceEnquiryPage balanceEnquiryPage;
	private static DeleteAccountPage deleteAccountPage;
	
	
	WebDriver driver;

	/*
	 * public PageFactoryManager(WebDriver driver_) { this.driver = driver_; }
	 */
	public static HomePage getHomePage(WebDriver driver) {
		if (homePage == null) {
			return new HomePage(driver);
		}
		return homePage;
	}

	public static LoginPage getLoginPage(WebDriver driver) {
		if (loginPage == null) {
			return new LoginPage(driver);
		}
		return loginPage;
	}

	public static RegisterPage getRegisterPage(WebDriver driver) {
		if (registerPage == null) {
			return new RegisterPage(driver);
		}
		return registerPage;
	}

	public static NewCustomerPage getnewCustomerPage(WebDriver driver) {
		if (newCustomerPage == null) {
			return new NewCustomerPage(driver);
		}
		return newCustomerPage;
	}

	public static EditCustomer geteditCustomer(WebDriver driver) {
		if (editCustomer == null) {
			return new EditCustomer(driver);
		}
		return editCustomer;
	}

	public static DeleteCustomerPage getdeleteCustomerPage(WebDriver driver) {
		if (editCustomer == null) {
			return new DeleteCustomerPage(driver);
		}
		return deleteCustomerPage;
	}
	
	public static NewAccountPage getnewAccountPage(WebDriver driver) {
		if (newAccountPage == null) {
			return new NewAccountPage(driver);
		}
		return newAccountPage;
	}
	public static DepositPage getdepositPage(WebDriver driver) {
		if (depositPage == null) {
			return new DepositPage(driver);
		}
		return depositPage;
	}
	public static WithDrawalPage getWithdrawalPage(WebDriver driver) {
		if (withDrawalPage == null) {
			return new WithDrawalPage(driver);
		}
		return withDrawalPage;
	}
	public static FundTransferPage getFundTransferPage(WebDriver driver) {
		if (fundTransferPage == null) {
			return new FundTransferPage(driver);
		}
		return fundTransferPage;
	}
	public static BalanceEnquiryPage getBalanceEnquiryPage(WebDriver driver) {
		if (balanceEnquiryPage == null) {
			return new BalanceEnquiryPage(driver);
		}
		return balanceEnquiryPage;
	}
	public static DeleteAccountPage getDeleteAccountPage(WebDriver driver) {
		if (deleteAccountPage == null) {
			return new DeleteAccountPage(driver);
		}
		return deleteAccountPage;
	}
}
