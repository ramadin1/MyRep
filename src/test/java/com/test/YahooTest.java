package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class YahooTest {
	
	@Test
	public void testYahoo(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		System.out.println("Testing yahoo ");
	}
}
