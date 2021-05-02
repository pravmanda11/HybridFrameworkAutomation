package com.RanfordBank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	
	WebDriver driver;

	public SearchPage(WebDriver Sdriver) {
		driver = Sdriver;
		PageFactory.initElements(Sdriver, this);
	}
	
	@FindBy(id = "selectProductSort")
	WebElement sortByListbox;
	
	@FindBy(xpath = "//a[@class='product_img_link']/img")
	WebElement image;
	

	public void selectItem() {
		Select item = new Select(sortByListbox);
		item.selectByVisibleText("In stock");
		
	}
	
	public void mouseHoverOnImage() {
		Actions act = new Actions(driver);
		Action mouseHover = act.moveToElement(image).build();
		mouseHover.perform();
	}

}
