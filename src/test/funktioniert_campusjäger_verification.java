package test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class funktioniert_campusjäger_verification {
	public static WebDriver driver;

	public static void main(String[] args) {
		funktioniert_campusjäger_verification();
	}

	public static WebElement legDirektLosTxt(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[1]/h3"));
	}

	public static WebElement nextStep1(WebDriver driver) {
		return driver.findElement(
				By.xpath("html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[2]/div/button/div/span"));
	}

	public static WebElement nextStep2(WebDriver driver) {
		return driver
				.findElement(By.xpath("//*[@id=\"processSection\"]/div/div/div[2]/div/div[2]/div/button[2]/div/span"));
	}

	public static WebElement nextStep3(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[2]/div/button[2]/div/span"));
	}

	public static WebElement nextStep4(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[2]/div/button[2]/div/span"));
	}

	public static WebElement nextStep5(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[2]/div/button[2]/div/span"));
	}

	public static WebElement nextStep6(WebDriver driver) {
		return driver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[2]/div/button[2]/div/span"));
	}

	public static WebElement erstelleDeinJobangebotTxt(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[1]/h3"));
	}

	public static WebElement stelleOptimierenTxt(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"processSection\"]/div/div/div[2]/div/div[1]/h3"));
	}

	public static WebElement stelleTxt(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"processSection\"]/div/div/div[2]/div/div[1]/h3"));
	}

	public static WebElement kandidatenVerwaltenTxt(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[1]/h3"));
	}

	public static WebElement mitWenigenKlicksTerminevereinbarenTxt(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[1]/h3"));
	}

	// gesprächeDurchführenTxt

	public static WebElement gesprächeDurchführenTxt(WebDriver driver) {
		return driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/section[3]/div/div/div[2]/div/div[1]/h3"));
	}

	public static void funktioniert_campusjäger_verification() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://arbeitgeber.campusjaeger.de");

		// maximized the browser window
		driver.manage().window().maximize();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Validate that user has created
		if (legDirektLosTxt(driver).getText().contains("1. Leg direkt los")) {
			System.out.println("Step 1- leg Direkt Los Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 1- leg Direkt Los Txt Failed,Test case Failed");
		}

		// Click on Next step
		nextStep1(driver).click();

		// Wait till 'Erstelle dein Jobangebot element' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Validate that user has created
		if (erstelleDeinJobangebotTxt(driver).getText().contains("2. Erstelle dein Jobangebot")) {
			System.out.println("Step 2- Erstelle dein Jobangebot Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 2- Erstelle dein Jobangebot Txt Failed,Test case Failed");
		}

		// Click on Next step
		nextStep2(driver).click();

		// Wait till 'Stelle optimieren element' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Validate that user has created
		if (stelleOptimierenTxt(driver).getText().contains("3. Stelle optimieren und von Experten prüfen lassen")) {
			System.out.println("Step 3- Stelle optimieren Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 3- Stelle optimieren Txt Failed,Test case Failed");
		}

		// Click on Next step
		nextStep3(driver).click();

		// Wait till 'Stelle optimieren element' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate that user has created
		if (stelleTxt(driver).getText().contains("4. Stelle auf über 1.000 Kanälen schalten")) {
			System.out.println("Step 4- Stelle Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 4- Stelle Txt Failed,Test case Failed");
		}

		// Click on Next step
		nextStep4(driver).click();

		// Wait till 'Kandidaten verwalten element' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate Step Kandidaten verwalten
		if (kandidatenVerwaltenTxt(driver).getText().contains("5. Kandidaten verwalten und bewerten")) {
			System.out.println("Step 5- Kandidaten verwalten Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 5- Kandidaten verwalten Txt Failed,Test case Failed");
		}

		// Click on Next step
		nextStep4(driver).click();

		// Wait till 'Mit wenigen Klicks Termine vereinbaren' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate Step Mit wenigen Klicks Termine vereinbaren
		if (mitWenigenKlicksTerminevereinbarenTxt(driver).getText()
				.contains("6. Mit wenigen Klicks Termine vereinbaren")) {
			System.out.println("Step 6- Mit wenigen Klicks Termine vereinbaren Txt Verified,Test case Passed");
		} else {
			System.out.println("Step 6- Mit wenigen Klicks Termine vereinbaren Txt Failed,Test case Failed");
		}

		// Wait till 'Gespräche durchführen element' visible
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Validate Step Gespräche durchführenund Ergebnisse dokumentieren
		if (gesprächeDurchführenTxt(driver).getText().contains("Gespräche durchführen und Ergebnisse dokumentieren")) {
			System.out.println(
					"Step 7- Gespräche durchführen und Ergebnisse dokumentieren Txt Verified,Test case Passed");
		} else {
			System.out
					.println("Step 7- Gespräche durchführen und Ergebnisse dokumentieren txt Failed,Test case Failed");
		}

		// Close the browser
		driver.quit();

	}

}
