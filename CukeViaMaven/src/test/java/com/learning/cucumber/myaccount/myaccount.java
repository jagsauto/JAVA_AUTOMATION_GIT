package com.learning.cucumber.myaccount;

import cucumber.api.java.en.Given;

public class myaccount
{
	
	@Given("^I am a logged in user on the site$")
	public void userstate()
	{
		System.out.println("I am a logged in user on the site");
	}
	
	
	
}
