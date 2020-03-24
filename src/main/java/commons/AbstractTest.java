package commons;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AbstractTest {
	WebDriver driver;
	public final Log log;

	// ham nay se in cosole
	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	// nhung ham dung chung trong testcase se duoc luu trong file nay
	public WebDriver openMultiBrower(String browser, String version) {
		if (browser.equalsIgnoreCase("firefox")) {
			FirefoxDriverManager.getInstance().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// add thu vien tu dong tai chrome ve can dung cacch ben duoi nua
			ChromeDriverManager.getInstance().version(version).setup();
			// System.setProperty("webdriver.chrome.driver",
			// ".\\resources\\chromedriver");
			driver = new ChromeDriver();
		}
		driver.get(Constants.BANK_URL);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public Object executeForWebElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public int randomData() {
		Random rand = new Random();
		int number = rand.nextInt(10000) + 1;
		return number;
	}

	public int randomDataAccountID() {
		Random rand = new Random();

		int number = rand.nextInt(2) - 1;
		return number;
	}

	protected boolean verifyPassed(boolean condition, boolean flag) {
		boolean pass = true;
		if (flag == false) {
			try {
				if (condition == true)
					log.info("===Passed====");
				else
					log.info("====Failed====");
				Assert.assertTrue(condition);
			} catch (Throwable e) {
				pass = false;
				Reporter.getCurrentTestResult().setThrowable(e);
			}
		} else {
			Assert.assertTrue(condition);
		}
		return pass;
	}

	protected boolean verifyTrue(boolean condition) {
		return verifyPassed(condition, false);
	}

	protected boolean verifyFailed(boolean condition, boolean flag) {
		boolean pass = true;
		if (flag == false) {
			try {
				if (condition == false)
					log.info("===Passed====");
				else
					log.info("====Failed====");
				Assert.assertTrue(condition);
			} catch (Throwable e) {
				pass = false;
				Reporter.getCurrentTestResult().setThrowable(e);
			}
		} else {
			Assert.assertTrue(condition);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		return verifyFailed(condition, false);
	}

	protected boolean verifyEquals(Object actual, Object expected, boolean flag) {
		boolean pass = true;
		if (flag == false) {
			try {
				Assert.assertEquals(actual, expected);
			} catch (Throwable e) {
				pass = false;
				Reporter.getCurrentTestResult().setThrowable(e);
			}
		} else {
			Assert.assertEquals(actual, expected);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return verifyEquals(actual, expected, false);
	}

	public void closeBrowser() {
		try {
			driver.quit();
			if (driver.toString().toLowerCase().contains("chrome")) {
				String cmd = "taskkill /IM chromedriver.exe/F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
