package com.qtpselenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qtpselenium.util.Constants;

public class accountSetting 
{

	@FindBy(xpath=Constants.passwordLink)
	WebElement passwordLink;
	@FindBy(xpath=Constants.currentPwd)
	WebElement currentPwd;
	@FindBy(xpath=Constants.newPwd)
	WebElement newPwd;
	@FindBy(xpath=Constants.confirmtPwd)
	WebElement confirmtPwd;
	@FindBy(xpath=Constants.saveButton)
	WebElement saveButton;
	@FindBy(xpath=Constants.cancelButton)
	WebElement cancelButton;
	
	
	WebDriver driver;
	public accountSetting (WebDriver dr)
	{
		driver=dr;
	}
	
	
	public void changePwd(String oldPwd, String nePwd)
	{
		
		passwordLink.click();
		currentPwd.sendKeys(oldPwd);
		newPwd.sendKeys(nePwd);
		confirmtPwd.sendKeys(nePwd);
		saveButton.click();
		cancelButton.click();
		
	}
	
	
	
}
