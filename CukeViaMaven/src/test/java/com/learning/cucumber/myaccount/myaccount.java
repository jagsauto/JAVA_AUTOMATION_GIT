package com.learning.cucumber.myaccount;

import com.learning.cucumber.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myaccount
{
	WebConnector Selenium = WebConnector.getInstance();
	
	@Given("^I am a logged in user on the site$")
	public void userstate()
	{
		System.out.println("I am a logged in user on the site");
	
		if(!Selenium.isLoggedIn())
		{
			Selenium.openbrowser("Mozilla");
			Selenium.navigate("loginUrl");
		/*Selenium.navigate("loginUrl");
		Selenium.type("loginEmailAddress", "sunil.yadav+uat@news.co.uk");
		Selenium.type("loginPassword", "Password123");
		Selenium.click("loginSignInButton");*/
			Selenium.defaultLogin();
			Selenium.log("Default user is logged in");

		}
	}
	
	/*@And("^I click on \"([^\"]*)\"$")  
	public void I_click_On(String object)
	{
		System.out.println("I clicks on menu link");
		Selenium.click(object);
	}*/
	
	@Then("^Menu bar should get opened$")
	public void Manu_Status()
	{
		if(Selenium.isElementPresent("sunlogoutlink"))
		{
			System.out.println("Menu bar has extended");
		}else
			System.out.println("Menu bar is not clicked");
	}
}
