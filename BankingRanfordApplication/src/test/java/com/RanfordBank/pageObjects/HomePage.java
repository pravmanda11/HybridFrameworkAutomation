package com.RanfordBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;

	public HomePage(WebDriver Hdriver) {
		ldriver = Hdriver;
		PageFactory.initElements(Hdriver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	WebElement signIn_lnk;

	@FindBy(xpath = "//img[@class='logo img-responsive'] ")
	WebElement yourLogo_img;

	@FindBy(id = "search_query_top")
	WebElement search_Txt;

	@FindBy(name = "submit_search")
	WebElement searchButton;

	public void clickSignInLink() {
		signIn_lnk.click();
	}

	public void verifyLogoDisplayed() {
		System.out.println("Logo is displayed  = " + yourLogo_img.isDisplayed());
	}

	public void enterSearchText() {
		search_Txt.sendKeys("shirts");
	}

	public void clickSearchButton() {
		searchButton.click();
	}

}
