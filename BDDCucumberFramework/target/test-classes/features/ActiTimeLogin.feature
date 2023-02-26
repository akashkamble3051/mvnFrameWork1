#Author: your.email@your.domain.com
Feature: Actitime login functionality test scenarios

	@Smoke
  Scenario: Actitime login test with valid credentials from Data Table as List
    Given User launchs chrome browser and opens the Actitime appilcation
    When User enters user name and password as
      | admin   | manager |
      | trainee | trainee |
    And User click on the login button
    Then User should navigate to home page

	@Smoke
  Scenario: Actitime login test with valid credentials from Data Table as Map
    Given User launchs chrome browser and opens the Actitime appilcation
    When User enters user name and password from data table as Map
      | UserName | Password |
      | admin    | manager  |
      | trainee  | trainee  |
    And User click on the login button
    Then User should navigate to home page
