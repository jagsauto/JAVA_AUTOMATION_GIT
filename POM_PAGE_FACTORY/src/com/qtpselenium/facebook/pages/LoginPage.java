package com.qtpselenium.facebook.pages;

import junit.framework.Assert;

import org.apache.xerces.impl.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = Constants.username)
	public WebElement username;

	@FindBy(xpath = Constants.password)
	public WebElement password;

	public LoginPage(WebDriver dr) {
		driver = dr;
	}

	public landingPage doLogin(String uemail, String Upwd) {
		driver.get("https://www.facebook.com/");
		try{
			Assert.assertEquals(driver.getTitle(), "Welcome to Facebook — Log in, sign up or learn more");

		}catch (Throwable e)
		{
			System.out.println("Erro---Title do not match");
			ErrorUtil.addVerificationFailure(e);
		}
		username.sendKeys(uemail);
		password.sendKeys(Upwd);
		password.sendKeys(Keys.ENTER);
		int i= driver.findElements(By.xpath(Constants.profileLink)).size();
		if (i==0)
		{
			return null;
		}
		else 
		{
			landingPage LP =PageFactory.initElements(driver, landingPage.class);
			
			return LP;
			
		}
		

	}

}
