package com.qtpselenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;

public class profilePage {

	WebDriver driver;

	@FindBy(xpath = Constants.friends)
	public WebElement friends;

	public profilePage(WebDriver dr) {
		driver = dr;
	}

	public friendlist gotofriends() {
		System.out.println("in profile Page");
		friends.click();
		friendlist fl = PageFactory.initElements(driver, friendlist.class);

		return fl;
	}

}
