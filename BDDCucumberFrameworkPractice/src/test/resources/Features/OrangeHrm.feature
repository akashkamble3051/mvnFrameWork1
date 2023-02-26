#Author: your.email@your.domain.com

Feature: OrangeHram Login functionality test scenarios			

  
  Scenario: OrangeHrm Login successfull with valid creadentials	
    Given user open chrome browser and OrangeHrm application is loaded
    And user should have userID and password
    When user enter userID and Password 
    And click on login button
    Then user should login successfully
    And Navigate to Home page