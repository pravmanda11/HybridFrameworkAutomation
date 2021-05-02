package com.RanfordBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	
	WebDriver driver;

	public MyProfilePage(WebDriver Mdriver) {
		driver = Mdriver;
		PageFactory.initElements(Mdriver, this);
	}
	
	@FindBy(xpath = "//a[text()='Women']")
	WebElement womenMenuLink;
	
	@FindBy(xpath = "//a[text()='Dresses']")
	WebElement dressesMenuLink;
	
	@FindBy(xpath = "//a[text()='T-shirts']")
	WebElement tshirtsMenuLink;
	
	public void verifyWomenMneu() {
		System.out.println("Menu item for Women =" +  womenMenuLink.isDisplayed());
	}
	
	public void verifydressesMneu() {
		System.out.println("Menu item for Dresses =" +  dressesMenuLink.isDisplayed());
	}
	
	public void verifytshirtsMneu() {
		System.out.println("Menu item for Tshirts =" +  tshirtsMenuLink.isDisplayed());
	}
	
	

}
