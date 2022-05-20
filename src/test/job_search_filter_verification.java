package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.loginpage;

public class job_search_filter_verification {
	public static WebDriver driver;

	public static void main(String[] args) {
		about_us_verification();
	}

	public static WebElement jobSearchTab(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/button"));
	}

	/// html/body/div[1]/div/div[3]/aside/div/div/div[6]/button/div/span
	/// html/body/div[1]/div/nav/div[1]/div/div
	/// html/body/div[1]/div/nav/div[1]/div/div/div[1]/img

	public static WebElement resetFiltersTab(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/aside/div/div/div[6]/button/div/span"));
	}

	public static WebElement searchBar(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[1]/div/div/div[1]/input"));
	}

	public static WebElement searchIcon(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[1]/div/div/div[1]/img"));
	}

	public static WebElement jobText(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/main/article/section[1]/h1"));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/nav/div/button")));

		// navigate to 'Job Search' window
		jobSearchTab(driver).click();

		// wait to load the page and click on reset filter tab
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		resetFiltersTab(driver).click();

		// Search for applied Job through search bar
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		searchBar(driver).sendKeys("Quality Assurance Engineer - Software Testing Frontend-/ Backend (m/f/d)");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		searchIcon(driver).click();

		// wait for 'seach job' page to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate that user name verification
		if (jobText(driver).getText().contains("Quality Assurance Engineer - Software Testing Frontend-/ Backend")) {
			System.out.println("Job Search Verification Passed,Test case Passed");
		} else {
			System.out.println("Job Search Verification Failed,Test case Failed");
		}

		// Close the browser
		driver.quit();

	}
}
