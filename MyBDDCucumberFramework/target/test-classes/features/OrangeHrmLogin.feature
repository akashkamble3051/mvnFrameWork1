#Author: tester.qa@abc.com
Feature: OrangeHrm Login functionality test scenarios

  Scenario: OrangeHrm login functionality test with valid credentials
    Given User opens the chrome browser and OrangeHrm application is loaded
    And User has username and password
    When User enters userName and password
    And User click on the sign in button
    Then User should login successfully and navigated to home page