package com.RanfordBank.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void setUpChrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

	}

	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

}
