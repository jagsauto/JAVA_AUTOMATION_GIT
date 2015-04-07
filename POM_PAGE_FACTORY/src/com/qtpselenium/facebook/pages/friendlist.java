package com.qtpselenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qtpselenium.util.Constants;
import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

public class friendlist {

	public WebDriver driver;
	@FindBy(xpath = Constants.findFriendtextbox)
	public WebElement findFriendtextbox;

	@FindBy(xpath = Constants.searchedfriendlink)
	public WebElement searchedfriendlink;

	public friendlist(WebDriver dr) {
		driver = dr;
	}

	public boolean findfriend(String friendName)
	{
		findFriendtextbox.sendKeys(friendName);
		
		//System.out.println(searchedfriendlink.getText());
		System.out.println("value of iselement function" +TestUtil.isElementPresent(Constants.searchedfriendlink));
		if(TestUtil.isElementPresent(Constants.searchedfriendlink)==false)
		{
			System.out.println("In element present check");
			return false;
		}
		
		else if (searchedfriendlink.getText().equals(friendName))
			{
				System.out.println("Searched friend found");
				return true;
			} else
			{
				System.out.println("searched friend does not exist");
				return false;
			}
	}

	}


