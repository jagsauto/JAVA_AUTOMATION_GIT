package test.qtpselenium.salesforce.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest
{

	
	@Given("^I go to \"([^\"]*)\" page on \"([^\"]*)\"$")
	public void I_Go_To(String sitename, String browser)
	{
		System.out.println("I go to "+sitename+ " page on "+ browser);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_Enter(String uName, String pwd)
	{
		System.out.println("I enter "+uName+" as "+pwd);
	}
	
	@And("^I click on login \"([^\"]*)\"$")
	public void I_Click(String lButton)
	{
		System.out.println("I click on login "+lButton);
	}
	
	@Then("^Login should be \"([^\"]*)\"$")
	public void Login_Status(String status)
	{
		System.out.println("Login should be "+status);
	}
	
	
}
