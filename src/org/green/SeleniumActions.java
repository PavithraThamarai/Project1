package org.green;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
     WebElement txtuser = driver.findElement(By.id("identifierId"));
    // txtuser.sendKeys("pavishas");
     Actions ac= new Actions(driver);
     ac.contextClick(txtuser).perform();
   //  ac.doubleClick(txtuser).perform();
    // driver.get("http://demo.guru99.com/test/drag_drop.html");
     //WebElement source = driver.findElement(By.id("fourth"));
     //WebElement destination = driver.findElement(By.id("amt7"));
     //Actions ac= new Actions(driver);
     //ac.dragAndDrop(source, destination).perform();
     
    
     
     }

}
