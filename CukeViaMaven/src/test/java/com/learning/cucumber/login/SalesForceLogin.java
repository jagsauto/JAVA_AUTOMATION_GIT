package com.learning.cucumber.login;

import com.learning.cucumber.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SalesForceLogin 
{
	
	WebConnector Selenium = new WebConnector();
	@Given("^I open \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To(String sitename, String browserName)
	{
		System.out.println(" I Open  "+sitename+" site"+" on "+browserName);
		Selenium.openbrowser(browserName);
		Selenium.navigate(sitename);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_Enter(String username, String uName)
	{
		System.out.println(" I enter "+username+" as "+uName);
		//Selenium.type(username, uName);
	}
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on_LoginButton(String loginButton)
	{
		System.out.println(" I click on "+loginButton);
		//Selenium.click(loginButton);
	}
	
	@Then("^Login should be \"([^\"]*)\"$")
	public void Login_Statu(String status)
	{
		System.out.println(" Login should be "+status);
		//String actualResult=null;
	/*	Boolean value = Selenium.isElementPresent("Username");
		if(value)
		{
			actualResult="Successful";
		}else
			actualResult="Failure";
		System.out.println("Value of logged in function is : "+ actualResult);
		//Assert.assertEquals(status, actualResult);
		 * 
		 */
	}
	

}
