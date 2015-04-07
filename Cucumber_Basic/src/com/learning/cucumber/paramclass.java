package com.learning.cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paramclass

{
	
	@Given("there are \"([a-zA-z]{1,})\" cucumbers")
	public void totalcucum(String totalcucu, DataTable table)
	{
		List<Map<String,String>> data= table.asMaps();
		System.out.println("totalcue "+data.get(0).get("TotalCu")+" Ate cucue "+data.get(0).get("AteCucu")+" remaining cucke "+ data.get(0).get("RemaiCu"));
		System.out.println("there are "+totalcucu+" cucumbers");
	}
	@When("I eat \"([a-zA-z]{1,})\" cucumbers")
	public void atecucum(String atecucu)
	{
		System.out.println("I eat "+atecucu+" cucumbers");
		
	}
	
	@Then("I should have left \"([a-zA-z]{1,})\" cucumbers")
	public void remaincucum(String remaincucu)
	{
		System.out.println("I should have left "+remaincucu+" cucumbers");
		System.out.println("*********");
	}

}
