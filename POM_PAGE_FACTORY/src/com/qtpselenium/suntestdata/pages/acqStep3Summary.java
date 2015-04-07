package com.qtpselenium.suntestdata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

public class acqStep3Summary
{
	WebDriver driver;
	@FindBy(xpath=Constants.termsCondition)
	WebElement termsCondition;
	@FindBy (xpath=Constants.getMeStartedButton)
	WebElement getMeStartedButton;
	
	public acqStep3Summary (WebDriver dr)
	{
		
		driver = dr;
	}
	
	
	public void acceptSummaryText()
	{
		try
		{
		termsCondition.click();
		getMeStartedButton.click();
		//int i=driver.findElements(By.xpath("//*[@class='image-header']/header/p[2]/a")).size();
		
		//System.out.println(driver.findElement(By.xpath(Constants.appStore)).getText());
		int i=driver.findElements(By.xpath(Constants.thanksPageTopNavBar)).size();
		System.out.println(i);
		if(TestUtil.isElementPresent(Constants.thanksPageTopNavBar))
		//if(i!=0)
		{
			System.out.println("*******************");
			System.out.println("User Registered with Email id: "+acqStep1PersonalInfo.useremail);
			System.out.println("*******************");
			driver.close();
			driver=null;
			
		}else
		{
			System.out.println("Error occured on thank you page ");
			//TestUtil.takeScreenshot("acceptSummaryText Page");
		}
		
		}catch(Throwable t)
		{
			TestUtil.takeScreenshot("acceptSummaryText_trycatch");
			ErrorUtil.addVerificationFailure(t);
		}
	}
}
	
	
	
	


