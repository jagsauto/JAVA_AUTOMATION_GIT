Feature: my account access

@Bokka22
Scenario: loggged in User should be able to access my account
Given I am a logged in user on the site
And I click on "sunMenuLink"
Then Menu bar should get opened
