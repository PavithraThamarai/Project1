package org.green;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	   WebElement courses = driver.findElement(By.name("courses"));
	  Select s= new Select(courses);
	  s.selectByIndex(5);
	  s.selectByIndex(9);
	  s.selectByIndex(3);
	//boolean m = s.isMultiple();
	//System.out.println(m);
	//s.deselectByIndex(4);
	//List<WebElement> li = s.getAllSelectedOptions();
	  List<WebElement> li = s.getAllSelectedOptions();
	for (WebElement eachElement : li) {
		String st = eachElement.getAttribute("label");
		System.out.println(st);
		
	}
	}	
	}
	
	
