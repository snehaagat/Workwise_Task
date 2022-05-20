package test;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.loginpage;

public class about_us_verification {
	public static WebDriver driver;

	public static void main(String[] args) {
		about_us_verification();
	}

	public static void about_us_verification() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.workwise.io");

		// maximized the browser window
		driver.manage().window().maximize();

		// wait for cookie acceptance
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		loginpage.loginTab(driver).click();

		// wait for 'login' pop up load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// login with valid Email address and Password
		loginpage.registeredEmail(driver).sendKeys("snehaagat@gmail.com");
		loginpage.loginPassword(driver).sendKeys("Sneha1415");
		loginpage.submitbtn(driver).click();

		// Wait till 'about us element' visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/footer/div[1]/div/div[4]/div/a[2]")));

		// navigate to 'about us' window
		loginpage.aboutUstab(driver).click();

		// wait for 'about us' page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate that user name verification
		if (loginpage.userText(driver).getText().contains("Frag Franzi")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}

		// Close the browser
		driver.quit();

	}

}
