package com.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class GoogleTest {
	
	
	@Test
	public void testGoogle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println("Hello world ");
	}
	
	

}
