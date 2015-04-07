package com.qtpselenium.suntestdata.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

public class acqStep1PersonalInfo

{

	WebDriver driver;
	
	@FindBy (xpath=Constants.firstName)
	WebElement firstName;
	@FindBy (xpath=Constants.lastName)
	WebElement lastName;
	@FindBy (xpath=Constants.email)
	WebElement email;
	@FindBy (xpath=Constants.confirmEmail)
	WebElement confirmEmail;
	@FindBy (xpath=Constants.createPwd)
	WebElement createPwd;
	@FindBy (xpath=Constants.confirmPwd)
	WebElement confirmPwd;
	@FindBy (xpath=Constants.continuePaymentButton)
	WebElement continuePaymentButton;
	@FindBy (xpath=Constants.acceptCookie)
	WebElement acceptCookie;
	public static String useremail="";
	public acqStep1PersonalInfo (WebDriver dr)
	{
		
		driver = dr;
	}
	
	public acqStep2Payment fillPersonalInfo(String fName, String lName, String password)
	{
		try
		{
		Random randomGenerator = new Random();
		int num= randomGenerator.nextInt(1000);
		String email1="email_";
		String email2="@yop.com";
		String emails = email1+num+email2;
		useremail=emails;
		
		acceptCookie.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email.sendKeys(emails);
		confirmEmail.sendKeys(emails);
		createPwd.sendKeys(password);
		confirmPwd.sendKeys(password);
		Thread.sleep(100);
		continuePaymentButton.click();
		
		if(TestUtil.isElementPresent(Constants.cardName))
		{
			return 	PageFactory.initElements(driver, acqStep2Payment.class);
		}else
			return null;

		}catch(Throwable t)
		{
			TestUtil.takeScreenshot("acqStep2Payment_fillPersonalInfo");
			ErrorUtil.addVerificationFailure(t);
			return null;
		}
	}
	
}
