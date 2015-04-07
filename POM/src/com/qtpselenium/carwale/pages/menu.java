package com.qtpselenium.carwale.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menu {
	
	@FindBy (xpath="//*[@id='primary-navbar']/ul/li[4]/a")
	public WebElement newcars;
	
	@FindBy (xpath="//*[@id='primary-navbar']/ul/li[8]/a")
	public WebElement usedcars;
	
	@FindBy (xpath="//*[@id='primary-navbar']/ul/li[10]/a")
	public WebElement sellcars;
	
	
	public void gotonewcars()
	{
		newcars.click();
	}
	
	public void gotousedcars()
	{
		usedcars.click();
	}
	
	public void gotosellcars()
	{
		sellcars.click();
	}

}
