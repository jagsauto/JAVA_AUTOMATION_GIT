package com.qtpselenium.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pages.LoginPage;
import com.qtpselenium.facebook.pages.friendlist;
import com.qtpselenium.facebook.pages.landingPage;
import com.qtpselenium.facebook.pages.profilePage;
import com.qtpselenium.util.Constants;



public class TestLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// initialize config file
		// init logging
		WebDriver driver=null;
		Properties pro = new Properties();
		FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
		
		pro.load(fs);
		
		if(pro.getProperty("browser").equals("Mozilla"))
		{
			driver = new FirefoxDriver();
			
		}
		 
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		landingPage LP= login.doLogin("1506.sunil.uk@gmail.com", "Sathiya85");
		
		/*profilePage PP =LP.gotoProfile();
		friendlist FL = PP.gotofriends();
		FL.findfriend("Sunil Yadav");
		*/
		

	}

}
