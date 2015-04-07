package com.qtpselenium.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pages.LoginPage;
import com.qtpselenium.facebook.pages.friendlist;
import com.qtpselenium.facebook.pages.landingPage;
import com.qtpselenium.facebook.pages.profilePage;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class findFriend extends TestBase

{
	@BeforeTest
	public void checkRunMode() {
		System.out.println("Executing Before method");
		// throw new SkipException("Skipping the test");
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")
				+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		if (!TestUtil.IsExecutable("TC2", reader)) {
			throw new SkipException("Skipping the test");

		}

	}
	
	@Test
	public void findFriend() throws IOException
	{
		
		String friendName = "Jelena";
		landingPage LandingPage=null;
		APPLICATION_LOGS.debug("Started the execution of find friend test");
		if(!isLoggedIn)
		{
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		LandingPage= login.doLogin("1506.sunil.uk@gmail.com", "Sathiya85");
		isLoggedIn=true;
		} else
		{
			LandingPage  =gotoHomePage().gotoLandingpage();

		}
		
		
		APPLICATION_LOGS.debug("Reached to landing page");
		
		profilePage profilePage = LandingPage.gotoProfile();
		APPLICATION_LOGS.debug("Reached to profile page");

		friendlist friendList = profilePage.gotofriends();
		APPLICATION_LOGS.debug("Reached to friend list page");
		boolean b=friendList.findfriend(friendName);
		
		
		try {
			Assert.assertTrue(b, "Could not found friend" + friendName);
		}catch (Throwable t)
		{
			ErrorUtil.addVerificationFailure(t);
			TestUtil.takeScreenshot("findFriend");
		}
		
		LandingPage  =gotoHomePage().gotoLandingpage();
		
	}
	
	
	

}
