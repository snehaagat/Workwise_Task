package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseSteps {

	public static WebDriver driver;

	public static void NavigateToUrl() {
		InitialisingWebBrowser("chrome");
		driver.get("https://www.workwise.io/");
	}

	public static void CloseBrowser() {
		driver.close();
		driver.quit();
	}

	public static void InitialisingWebBrowser(String brwoserName) {
		switch (brwoserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "ie":
			driver = new InternetExplorerDriver();
			break;

		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

}
