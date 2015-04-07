package com.learning.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstClass {
	
	
	@Given("^I have search page$")
	public void searcpage()
	{
		System.out.println("@Given -  I have search page");
	}

	@And("^i have a \"([a-zA-Z]{1,})\" employee record$")
	public void empRecord(String empType)
	{
		System.out.println("@And  - i have a "+empType+" employee record");
	}
	
	@When("^I search for a \"([a-zA-Z]{1,})\" emp$")
	public void searchRecord(String emptype)
	{
		System.out.println("@When - I search for a "+emptype+" emp");
	}
	
	@Then("^search result should show \"([a-zA-Z]{1,})\" records$")
	public void searchResult(String emptype)
	{
		System.out.println("@Then  - search result should show "+emptype+" record");
		System.out.println("***************************************");
	}
	
}
