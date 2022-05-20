package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	//public static WebElement loginBtn(WebDriver driver) {
	//	return driver.findElement(By.className("login"));
	//}
	
	
	public static WebElement loginTab(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/nav/div/button[2]"));
	}
	
	public static WebElement registeredEmail(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div/div/form/div[1]/div/div[2]/input"));
	}
	
	public static WebElement loginPassword(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div/div/form/div[2]/div/div[2]/div/input"));
	}
	
	public static WebElement submitbtn(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[4]/div/div/div/form/button"));
	}

	public static WebElement aboutUstab(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/footer/div[1]/div/div[4]/div/a[2]"));
	}
	
	public static WebElement userText(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[9]/h3"));
	}
}
