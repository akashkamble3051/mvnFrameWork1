#Author: your.email@your.domain.com
Feature: SwagLab login functionality related test scenarios

	@Smoke
  Scenario: Test the login functionality of Swag Lab using valid credentials
    Given User launchs "chrome" browser and opens the SwagLab appilcation using "https://www.saucedemo.com/"
    And User has username as "standard_user" and password as "secret_sauce"
    When User enters the username and password
    And User click on Swaglab login button
    Then Verify user is on the home page
