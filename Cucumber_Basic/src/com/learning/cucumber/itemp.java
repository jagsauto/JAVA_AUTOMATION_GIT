package com.learning.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class itemp
{

	@Given("I am a \"([a-zA-z]{1,})\" Tester")
	public void testerType(String testertype)
	{
		System.out.println("I am a " +testertype+" Tester");
	}
	@When("I go to office")
	public void I_go_toWork()
	{
		System.out.println("I go to work");
		
	}
	
	@Then("I do \"([a-zA-z]{1,})\" testing")
	public void workType(String testertype)
	{
		System.out.println("I do "+testertype+" testing");
		System.out.println("*********");
	}
}
