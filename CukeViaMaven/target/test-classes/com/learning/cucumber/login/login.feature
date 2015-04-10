
Feature: salesforce login


@Bokka5
Scenario Outline: User should be able to login
Given I open "loginUrl" on "<BrowserType>"
And I enter "LoginUserName" as "<UserName>"
And I enter "LoginPassword" as "<UserPwd>"
And I click on "LoginButton"
Then Login should be "Successful"

Examples:
 | BrowserType   | UserName | UserPwd      |
 | Mozilla       | Test     | Tester       |
 | Mozilla       | Dev      | Developer    |

@Bokka
Scenario: User should be able to login to UAT thesun.co.uk
Given I open "loginUrl" on "Mozilla"
And I enter "loginEmailAddress" as "sunil.yadav+uat@news.co.uk"
And I enter "loginPassword" as "Password123"
And I click on "loginSignInButton"
Then Login should be "Successful"