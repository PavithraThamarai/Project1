package org.green;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
    WebElement branch = driver.findElement(By.name("branch"));
    Select s= new Select(branch);
	//s.selectByIndex(5);
    List<WebElement> li = s.getOptions();
    //for (int i = 0; i < li.size(); i++) {
    for (WebElement eachElement : li) {}
					
       	WebElement eachElement = li.get(3);
    	String b = eachElement.getAttribute("value");
    	s.selectByVisibleText(b);
    	
    	System.out.println(b);
		
	}   	
	}


