package com.qtpselenium.suntestdata.rough;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtpselenium.suntestdata.pages.acqStep1PersonalInfo;
import com.qtpselenium.suntestdata.pages.acqStep2Payment;
import com.qtpselenium.suntestdata.pages.acqStep3Summary;
import com.qtpselenium.suntestdata.pages.promoCodePage;
import com.qtpselenium.testcases.TestBase;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class testngPromo extends TestBase
{
	
	@BeforeTest
	public void checkRunMode() {
		System.out.println("Executing Before method");
		// throw new SkipException("Skipping the test");
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")
				+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		
		if (!TestUtil.IsExecutable("TC3", reader)) {
			throw new SkipException("Skipping the test");

		}

	}
	
	@Test
	public void createPromo()
	{
		
		try
		{
		//WebDriver driver=new FirefoxDriver();
			initConfig();
			initdriver();
		
		//promoCodePage obj = new promoCodePage();
		promoCodePage obj = PageFactory.initElements(driver, promoCodePage.class);

		acqStep1PersonalInfo perInfo= obj.validatePromoCode("Test_si2");
		Assert.assertTrue("Could not procced from promo page", perInfo!=null);

		acqStep2Payment payObj= perInfo.fillPersonalInfo("Sunil","Yadav", "Password123");
		Assert.assertTrue("Could not procced from personal info page", payObj!=null);

		acqStep3Summary summryObj = payObj.fillPaymentDetails("Test", "4111111111111111", "02", "2017", "123", "add line 1", "Dublin");
		Assert.assertTrue("Could not procced from personal info page", summryObj!=null);

		summryObj.acceptSummaryText();
		
		}catch(Throwable t)
		{
		System.out.println("Error occured in createPromo testng function");
		ErrorUtil.addVerificationFailure(t);
		TestUtil.takeScreenshot("createPromo");
		driver.close();
		
		}
		

		
	}
	
	

}
