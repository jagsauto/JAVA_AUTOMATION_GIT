package com.qtpselenium.suntestdata.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pages.LoginPage;
import com.qtpselenium.suntestdata.pages.acqStep1PersonalInfo;
import com.qtpselenium.suntestdata.pages.acqStep2Payment;
import com.qtpselenium.suntestdata.pages.acqStep3Summary;
import com.qtpselenium.suntestdata.pages.promoCodePage;
import com.qtpselenium.util.Constants;
import com.qtpselenium.util.TestUtil;

public class testpromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		//promoCodePage obj = new promoCodePage();
		promoCodePage obj = PageFactory.initElements(driver, promoCodePage.class);

		acqStep1PersonalInfo perInfo= obj.validatePromoCode("Test_si4");
		acqStep2Payment payObj= perInfo.fillPersonalInfo("Sunil","Yadav", "Password123");
		acqStep3Summary summryObj = payObj.fillPaymentDetails("Test", "4111111111111111", "02", "2017", "123", "add line 1", "Dublin");
		summryObj.acceptSummaryText();
		
		

	}
}
