#Author: your.email@your.domain.com
Feature: ActiTime login functionality with multiple credentials test scenario

	@Regression
  Scenario Outline: Test the login functionaliy of Actitime with multiple credentials "<scenario>" and "<Environment>"
    Given User open the "<browser_name>" browser and launch the actitime login page using "<appUrl>"
    When User enter "<username>" and "<password>" on the login page
    And User click on the login button after enetring username and password
    Then Verify that login is successful if "<scenario>" is positive and login is not successful if scenario is negative

    Examples: 
      | scenario | browser_name | username | password | appUrl                             | Environment |
      | positive | chrome       | admin    | manager  | https://demo.actitime.com/login.do | Dev         |
      | positive | Edge         | trainee  | trainee  | https://demo.actitime.com/login.do | QA          |
      | Negative | chrome       | Admin    | Admin123 | https://demo.actitime.com/login.do | QA          |
