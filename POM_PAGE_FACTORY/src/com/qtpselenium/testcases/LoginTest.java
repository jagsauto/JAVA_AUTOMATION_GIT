package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pages.LoginPage;
import com.qtpselenium.facebook.pages.landingPage;
import com.qtpselenium.util.Constants;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class LoginTest extends TestBase{

	@BeforeSuite
	public void init() throws IOException
	{
		initConfig();
		initdriver();
	}
	@BeforeTest
	public void checkRunMode() {
		//System.out.println("Executing Before method");
		// throw new SkipException("Skipping the test");
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")
				+ "\\src\\com\\qtpselenium\\data\\testdata.xlsx");
		if (!TestUtil.IsExecutable("TC1", reader)) {
			throw new SkipException("Skipping the test");

		}

	}

	@Test
	public void TestLogin() throws IOException 
	{
		//System.out.println("Executing Login test via testng");
		
		initConfig();
		initdriver();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		landingPage LP= login.doLogin(Config.getProperty("defaultUserName"), Config.getProperty("defaultPassword"));
		Assert.assertTrue("Could not logged in", LP!=null);
		isLoggedIn=true;
		driver.close();
		driver=null;
	}

}
