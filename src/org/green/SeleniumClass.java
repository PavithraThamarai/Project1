package org.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebElement txtUser = driver.findElement(By.name("email"));
	//txtUser.sendKeys("Greens");
	//WebElement txtpass= driver.findElement(By.name("pass"));
	//txtpass.sendKeys("pass");
	WebElement txtUser= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
	txtUser.sendKeys("pavishas");
	WebElement txtpass =driver.findElement(By.xpath("//input[@placeholder='Password']"));
	txtpass.sendKeys("pavi");
		
	}
}