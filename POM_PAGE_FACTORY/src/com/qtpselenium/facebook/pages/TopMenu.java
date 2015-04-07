package com.qtpselenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;


public class TopMenu

{
	@FindBy (xpath=Constants.droplist)
	WebElement droplist;
	@FindBy (xpath=Constants.Settings)
	WebElement Settings;
	@FindBy (xpath=Constants.homepage)
	WebElement Homepage;
	
	WebDriver driver;
	public TopMenu(WebDriver dr)
	{
		driver=dr;
	}
	
	public accountSetting gotosettings()
	
	{
		droplist.click();
		System.out.println(Settings.getText());
		Settings.click();
		return 	PageFactory.initElements(driver, accountSetting.class);

		
	}
	
	public landingPage gotoLandingpage()
	{
		
		System.out.println(driver.getTitle());
		Homepage.click();
		return 	PageFactory.initElements(driver, landingPage.class);
	}
	
	
	

}
