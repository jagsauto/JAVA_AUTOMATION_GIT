package com.qtpselenium.suntestdata.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pages.accountSetting;
import com.qtpselenium.facebook.pages.landingPage;
import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

public class promoCodePage

{
	WebDriver driver;
	@FindBy (xpath=Constants.promoTextBox)
	WebElement promoTextBox;
	
	@FindBy (xpath=Constants.promoContinueButton)
	WebElement promoContinueButton;
	
	public promoCodePage (WebDriver dr)
	{
		driver=dr;
	}
	
	public acqStep1PersonalInfo validatePromoCode(String promoCode) 
	{
		try
		{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://join.uat-thesun.ie/promoCodeEntry");

		promoTextBox.sendKeys(promoCode);
		Thread.sleep(1000);
	  
		promoTextBox.sendKeys(Keys.ENTER);
		
		//promoTextBox.sendKeys(Keys.ENTER);

		//promoContinueButton.click();
		
		//acqStep1PersonalInfo LP =PageFactory.initElements(driver, acqStep1PersonalInfo.class);
		//return LP;
			if(TestUtil.isElementPresent(Constants.firstName))
			{
			return 	PageFactory.initElements(driver, acqStep1PersonalInfo.class);
			}else
				return null;
		
	}catch(Throwable t)
		{
		TestUtil.takeScreenshot("validatePromoCode_Page");
		ErrorUtil.addVerificationFailure(t);
		return null;
		}
	}
		
}
