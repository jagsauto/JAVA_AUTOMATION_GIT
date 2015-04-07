package com.qtpselenium.suntestdata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

public class acqStep2Payment
{

WebDriver driver;
	
	@FindBy (xpath=Constants.cardName)
	WebElement cardName;
	@FindBy (xpath=Constants.cardNumber)
	WebElement cardNumber;
	@FindBy (xpath=Constants.expiryDateMonth)
	WebElement expiryDateMonth;
	@FindBy (xpath=Constants.expiryDateYear)
	WebElement expiryDateYear;
	@FindBy (xpath=Constants.securityCode)
	WebElement securityCode;
	@FindBy (xpath=Constants.billingAddressLine1)
	WebElement billingAddressLine1;
	@FindBy (xpath=Constants.billingTown)
	WebElement billingTown;
	@FindBy (xpath=Constants.continueOrderSummaryButton)
	WebElement continueOrderSummaryButton;
	
	public acqStep2Payment (WebDriver dr)
	{
		
		driver = dr;
	}
	
	
	public acqStep3Summary fillPaymentDetails(String cardHolderName, String cardnumber, 
			String expiryMonth, String expiryYear, String secureCode, String billingAddLine1, String town)
	{
		try
		{
		cardName.sendKeys(cardHolderName);
		cardNumber.sendKeys(cardnumber);
		expiryDateMonth.sendKeys(expiryMonth);
		expiryDateYear.sendKeys(expiryYear);
		securityCode.sendKeys(secureCode);
		billingAddressLine1.sendKeys(billingAddLine1);
		billingTown.sendKeys(town);
		continueOrderSummaryButton.click();
		
		if(TestUtil.isElementPresent(Constants.termsCondition))
		{
			return 	PageFactory.initElements(driver, acqStep3Summary.class);
		}else
			return null;
		
		}catch(Throwable t)
		{
			TestUtil.takeScreenshot("acqStep3Summary_fillPaymentDetails");
			ErrorUtil.addVerificationFailure(t);
			return null;
		}

	}
	
}
