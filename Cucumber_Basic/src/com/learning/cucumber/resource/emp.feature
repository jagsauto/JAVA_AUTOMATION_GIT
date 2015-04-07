Feature: Employee

Scenario: Search test Employee 
Given I have search page
And i have a "test" employee record
When I search for a "test" emp
Then search result should show "test" records 

Scenario: Search dev Employee 
Given I have search page
And i have a "dev" employee record
When I search for a "dev" emp
Then search result should show "dev" records 