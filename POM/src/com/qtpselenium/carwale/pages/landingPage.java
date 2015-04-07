package com.qtpselenium.carwale.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPage {
	
	@FindBy(xpath="//*[@id='findCityContentNew']/div/div/div[1]/span")
	public WebElement popup;

	@FindBy(xpath="//*[@id='drpMakeNew']")
	public WebElement make;
	
	@FindBy(xpath="//*[@id='drpModelNew']")
	public WebElement model;
	
	@FindBy(xpath="//*[@id='divMakeNew']/input")
	public WebElement search;
	
	public menu mn = null;
	public landingPage (WebDriver driver)
	{
		//System.out.println("created landingPage class object");
		if (mn == null)
		{
			mn = PageFactory.initElements(driver, menu.class);
		}
		
	}
	public void GetPriceQuote(String mymake, String mymodel)
	{
		popup.click();
		make.sendKeys(mymake);
		make.sendKeys(Keys.ENTER);
		model.sendKeys(mymodel);
		search.click();
	}
}
