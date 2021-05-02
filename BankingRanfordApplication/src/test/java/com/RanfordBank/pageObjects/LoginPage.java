package com.RanfordBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver Ldriver) {
		driver = Ldriver;
		PageFactory.initElements(Ldriver, this);
	}

	@FindBy(id = "email")
	WebElement email_Address_Txt;

	@FindBy(id = "passwd")
	WebElement password_Txt;

	@FindBy(id = "SubmitLogin")
	WebElement signIn_Btn;
	
	@FindBy(id = "email_create")
	WebElement email_Txt;

	@FindBy(id = "SubmitCreate")
	WebElement create_btn;

	public void enterEmailAddress(String UN) {
		email_Address_Txt.sendKeys(UN);
	}

	public void enterPassword(String PWD) {
		password_Txt.sendKeys(PWD);
	}

	public void clickSignInButton() {

		signIn_Btn.click();
	}

}
