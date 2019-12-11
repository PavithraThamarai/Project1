package org.green;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("http://demo.automationtesting.in/Alerts.html");
      WebElement okBtn = driver.findElement(By.xpath("//a[@href='#OKTab']"));
      okBtn.click();
      Thread.sleep(3000);
      WebElement alertText = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
      alertText.click();
      // driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
      Alert a = driver.switchTo().alert();
      a.accept();
      //a.sendKeys("Greens");
     // a.dismiss();
	
	}
	

}
