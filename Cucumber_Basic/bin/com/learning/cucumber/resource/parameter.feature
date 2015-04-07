Feature: Meal

Scenario: eating
Given there are "Ten" cucumbers
 |TotalCu |AteCucu | RemaiCu |
 |three   |four    | eight   |
 |Ten     |two     | eight   |
When I eat "Two" cucumbers
Then I should have left "Eight" cucumbers

 
 