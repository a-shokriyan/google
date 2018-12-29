package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	@Test
	public void browser () {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.get("http://www.yahoo.com");
		
		driver.close();
		
	}
	
	@Test
	public void failTest() {
		Assert.assertEquals(11, 12);
	}

}
