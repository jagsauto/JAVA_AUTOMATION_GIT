Feature: Salesforce login

Scenario: Login to salesforce
Given I go to "http://salesforce.com" page on "Mozilla"
And I enter "username" as "test"
And I enter "password" as "password"
And I click on login "button"
Then Login should be "successful"