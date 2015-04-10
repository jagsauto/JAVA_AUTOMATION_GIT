Feature: salesforce login


@Bokka2
Scenario: User should be able to login
Given I open "loginUrl" on "Mozilla"
And I enter "LoginUserName" as "testuser"
And I enter "LoginPassword" as "testpwd"
And I click on "LoginButton"
Then Login should be "Successful"

@Bokka1 @Bokka
Scenario: User should be able to login
Given I open "loginUrl" on "Mozilla"
And I enter "LoginUserName" as "testuser"
And I enter "LoginPassword" as "testpwd"
And I click on "LoginButton"
Then Login should be "Successful"


@Bokka1
Scenario: User should be able to login
Given I open "loginUrl" on "Mozilla"
And I enter "LoginUserName" as "testuser"
And I enter "LoginPassword" as "testpwd"
And I click on "LoginButton"
Then Login should be "Successful"