package com.RanfordBank.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RanfordBank.pageObjects.HomePage;
import com.RanfordBank.pageObjects.LoginPage;
import com.RanfordBank.utilities.CaptureScreeShot;
import com.RanfordBank.utilities.ReadConfig;
import com.RanfordBank.utilities.ReadDataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TC_01_VerifyLoginFunctionaltiy extends BaseClass {

	@DataProvider
	public Object[][] getLoginData() {
		Object data[][] = ReadDataProvider.getDataFromExcel("Login");
		return data;
	}

	@Test(dataProvider = "getLoginData")
	public void loginTest(String Uname, String Pword) throws IOException {

		ExtentHtmlReporter HtmlFilePath = new ExtentHtmlReporter("./Reports/Results.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(HtmlFilePath);
		ExtentTest logger = extent.createTest("loginTest");

		ReadConfig configObj = new ReadConfig();
		driver.get(configObj.getAppURL());

		HomePage hp = new HomePage(driver);
		LoginPage Lp = new LoginPage(driver);

		hp.clickSignInLink();
		logger.info("CLicked on Login");
		// CaptureScreeShot.TakeScreenShot(driver);

		// Lp.enterEmailAddress(configObj.getUsername());

		Lp.enterEmailAddress(Uname);
		logger.pass("User Entered Email successfully");
		logger.fail("Not entered UN",
				MediaEntityBuilder.createScreenCaptureFromPath("/Users/prave/OneDrive/Desktop/sc.png").build());

		// Lp.enterPassword(configObj.getPasswordL());
		Lp.enterPassword(Pword);
		Lp.clickSignInButton();
		logger.pass("SIgnin button clicked successfully");

		if (driver.getTitle().equals("My account - My Store")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		extent.flush();
	}

	@DataProvider
	public Object[][] getRegisterData() {
		Object data[][] = ReadDataProvider.getDataFromExcel("Register");
		return data;
	}

	@Test(dataProvider = "getRegisterData")
	public void TC02RegisterFunctionalityValid(String Fname, String Lname, String Email, int Mobile) {
		String mobileFormat = Integer.toString(Mobile);

		driver.findElement(By.id("fname")).sendKeys(Fname);
		driver.findElement(By.id("lname")).sendKeys(Lname);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("mobile")).sendKeys(mobileFormat);

	}
	
	
	@Test(dataProvider = "getRegisterData")
	public void TC03RegisterFunctionalityInval(String Fname, String Lname, String Email, int Mobile) {
		String mobileFormat = Integer.toString(Mobile);

		driver.findElement(By.id("fname")).sendKeys(Fname);
		driver.findElement(By.id("lname")).sendKeys(Lname);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("mobile")).sendKeys(mobileFormat);

	}


}
