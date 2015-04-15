package com.learning.cucumber.login;

import com.learning.cucumber.util.WebConnector;

import cucumber.api.java.en.And;

public class common_annotation_util
{
	WebConnector Selenium = WebConnector.getInstance();
	
	@And("^I click on \"([^\"]*)\"$")  
	public void I_click_On(String object)
	{
		System.out.println("I clicks on menu link");
		Selenium.click(object);
	}
	

}
