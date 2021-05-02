package com.RanfordBank.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import com.RanfordBank.pageObjects.HomePage;
import com.RanfordBank.pageObjects.LoginPage;
import com.RanfordBank.pageObjects.MyProfilePage;
import com.RanfordBank.pageObjects.SearchPage;
import com.RanfordBank.utilities.ReadConfig;

public class TC_05_EndToEndPayment extends BaseClass {

	@Test()
	public void endToEndPayment() throws InterruptedException {

		ReadConfig configObj = new ReadConfig();
		driver.get(configObj.getAppURL());

		HomePage hp = new HomePage(driver);
		LoginPage Lp = new LoginPage(driver);
		MyProfilePage MP = new MyProfilePage(driver);
		SearchPage SP = new SearchPage(driver);

		hp.clickSignInLink();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Lp.enterEmailAddress(configObj.getUsername());
		Lp.enterPassword(configObj.getPasswordL());
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		MP.verifydressesMneu();
		Thread.sleep(5000);
		MP.verifyWomenMneu();
		Thread.sleep(5000);
		MP.verifytshirtsMneu();
		Thread.sleep(5000);
		hp.enterSearchText();
		Thread.sleep(5000);
		hp.clickSearchButton();
		
		Assert.assertEquals(driver.getTitle(), "Search - My Store", "page is valid");
		Thread.sleep(5000);
		SP.selectItem();
		Thread.sleep(5000);
		SP.mouseHoverOnImage();
		
		
	}
}
