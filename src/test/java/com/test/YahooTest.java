package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooTest {
	
	@Test
	public void testYahoo(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		String title = driver.getTitle();
		System.out.println("Testing yahoo " + title);
		System.out.println("Hello Abdi");
	}
}
