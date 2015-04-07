package com.qtpselenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;

public class landingPage {

	WebDriver driver;

	@FindBy(xpath = Constants.profileLink)
	public WebElement profileLink;
	
	@FindBy(xpath = Constants.droplist)
	public WebElement droplist;
	

	public landingPage(WebDriver dr)

	{
		driver = dr;
	}

	public profilePage gotoProfile() {

		profileLink.click();
		profilePage pp = PageFactory.initElements(driver, profilePage.class);
		return pp;

	}

	
	public accountSetting gotoMenu()
	{
		droplist.click();
		return PageFactory.initElements(driver, accountSetting.class);
		
	}
}
