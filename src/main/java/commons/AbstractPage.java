package commons;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BalanceEnquiryPage;
import pages.DeleteAccountPage;
import pages.DeleteCustomerPage;
import pages.DepositPage;
import pages.EditCustomer;
import pages.FundTransferPage;
import pages.NewAccountPage;
import pages.NewCustomerPage;
import pages.WithDrawalPage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AbstractPage {

	public void openAnyUrl(WebDriver driver, String url) {
		driver.get(url);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void clearTextbox(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		Log log = LogFactory.getLog("Name");
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void sendkeysToElement(WebDriver driver, String locator, String text) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(text);
	}

	public void selectItemDropdown(WebDriver driver, String locator, String item) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		// lay item trong dropdown
		select.selectByVisibleText(item);
	}

	public void selectRadioButton(WebDriver driver, String locator, String item) {
		WebElement radiobutton = driver.findElement(By.xpath(locator));
		radiobutton.isSelected();
	}

	public String getFirstItemSelected(WebDriver driver, String locator) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		// lay item dau tien
		return select.getFirstSelectedOption().getText();
	}

	public String getAttributerValue(WebDriver driver, String locator, String AttributerName) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(AttributerName);
	}

	public String getTextElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public int getSize(WebDriver driver, String locator) {
		Select select = new Select(driver.findElement(By.xpath(locator)));
		return select.getOptions().size();
	}

	public void uncheckCheckBox(WebDriver driver, String locator) {
		// WebElement checkbox = driver.findElement(By.xpath(locator));
		// executeForWebElement(checkbox);
	}

	public boolean isControlDisplayed(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlDisplayed(WebDriver driver, String locator, String value) {
		locator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();

	}

	public boolean isControlEnable(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();

	}

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendKeyAlert(WebDriver driver, String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);

	}

	public void switchToChildWindow(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindow : allWindows) {
			if (!runWindow.equals(parent)) {
				driver.switchTo().window(runWindow);
				break;
			}
		}
	}

	public void switchToWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			driver.switchTo().window(runWindows);
			String currentWin = driver.getTitle();
			if (currentWin.equals(title)) {
				break;
			}
		}
	}

	public void switchToWindowByID(WebDriver driver, String ID) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			driver.switchTo().window(runWindows);
			String currentWin = driver.getTitle();
			if (currentWin.equals(ID)) {
				break;
			}
		}
	}

	public void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px groove red'", element);
	}

	public Object executeForBrowser(WebDriver driver, String javaSript) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript(javaSript);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object executeForWebElement(WebDriver driver, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object removeAttributeInDOM(WebDriver driver, WebElement element, String attribute) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].removeAttribute('" + attribute + "');", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollToBottomPage(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public void waitForElementVisible(WebDriver driver, String locator) {

		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(driver,ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.visibilityOf(element));

		// hoac su dung ham by: visibilityOfElementLocated
		/*
		 * By by = By.xpath(locator); WebDriverWait wait1 = new
		 * WebDriverWait(driver, 30);
		 * wait1.until(ExpectedConditions.visibilityOfElementLocated(by));
		 */
	}

	public void waitForElementVisible(WebDriver driver, String locator, String value) {
		// locator= "//a[text()='%s']";
		// value= New Customer
		locator = String.format(locator, value);

		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void waitForElementPresence(WebDriver driver, String locator) {
		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	public void waitForElementClickable(WebDriver driver, String locator) {

		WebElement element = driver.findElement(By.xpath(locator));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForElementNotVisible(WebDriver driver, String locator) {

		By by = By.xpath(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	// mở menu page bằng dynamic xpath

	public NewCustomerPage openNewCustomerPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "New Customer");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "New Customer");
		return PageFactoryManager.getnewCustomerPage(driver);
	}

	public EditCustomer openEditCustomer(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Edit Customer");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Edit Customer");
		return PageFactoryManager.geteditCustomer(driver);
	}

	public DeleteCustomerPage openDeleteCustomerPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Delete Customer");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Edit Customer");
		return PageFactoryManager.getdeleteCustomerPage(driver);
	}

	public NewAccountPage openNewAccount(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "New Account");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "New Account");
		return PageFactoryManager.getnewAccountPage(driver);
	}

	public DepositPage openDepositPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Deposit");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Deposit");
		return PageFactoryManager.getdepositPage(driver);
	}

	public WithDrawalPage openWithDrawalPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Withdrawal");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Withdrawal");
		return PageFactoryManager.getWithdrawalPage(driver);
	}

	public FundTransferPage openFundTransferPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Fund Transfer");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Fund Transfer");
		return PageFactoryManager.getFundTransferPage(driver);
	}

	public BalanceEnquiryPage openBalanceEnquiryPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Balance Enquiry");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Balance Enquiry");
		return PageFactoryManager.getBalanceEnquiryPage(driver);
	}

	public DeleteAccountPage openDeleteAccountPage(WebDriver driver) {
		waitForElementVisible(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Delete Account");
		clickToElement(driver, interfaces.AbstractPageUI.DYNAMIC_MENU_PAGE, "Delete Account");
		return PageFactoryManager.getDeleteAccountPage(driver);
	}
}
