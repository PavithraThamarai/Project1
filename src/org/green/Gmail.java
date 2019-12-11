package org.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement txtUser= driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		txtUser.sendKeys("pavishas21@gmail.com");
		WebElement btnclick = driver.findElement(By.xpath("//span[text()='Next']"));
		btnclick.click();
		Thread.sleep(1000);
		WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
		txtPass.sendKeys("chasekutty");
		driver.close();
	}
}
