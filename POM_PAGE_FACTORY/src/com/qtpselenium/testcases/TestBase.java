package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pages.TopMenu;
import com.qtpselenium.facebook.pages.accountSetting;
import com.qtpselenium.util.Constants;



public class TestBase
{
	
	public static WebDriver driver=null;
	public static Properties Config=null;
	public static TopMenu topMenu=null;
	public static Logger APPLICATION_LOGS = null;
	public static boolean isLoggedIn=false;
	
	
	
	public void initConfig() throws IOException
	{
		if (Config==null)
		{
			Config = new Properties();
			FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
			
			Config.load(fs);
		}
		
	}
	
	public void initdriver()
	{
		if(driver==null)
		{
			APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
			
			if(Config.getProperty("browser").equals("Mozilla"))
			{
				driver = new FirefoxDriver();
				
			}
			 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
	}
	
	public void quitdriver()
	{
		driver.quit();
	}
	
	public void logOut()
	{
		isLoggedIn=false;
	}
	
	public TopMenu gotoHomePage()
	{
		if (topMenu==null)
		{
			System.out.println("init top menu object");
			topMenu= PageFactory.initElements(driver, TopMenu.class);
			 
		}
		return topMenu;
	}
	
	

}
