#Author: your.email@your.domain.com
Feature: VTiger compaign create delete functionality test scenarios

  Background: Pre-requisite
    Given User is on the Vtiger login page
    And User login with valid credentials
    And User navigates to compaign page
@regression
  Scenario Outline: Test the new compaign creation functionality with "<compaignName>"
    When Click on Add compaing button
    And User enters "<compaingName>" and "<expectedClosingData>" and click on save button
    And User click on Compaign header link
    Then Verify the created compaing with "<compaingName>"

    Examples: 
      | compaingName     | expectedClosingData |
      | JavaLearning     | 31-03-2023          |
      | SeleniumLearning | 30-04-2023          |
@smoke @Rerun 
  Scenario: Test the delete funtionality of compaign
    When User click on select all compaign checkbox
    And User click on delete button
    And User click on confirm delete button appeared on the pop up
    Then Verify that all the created compaings are deleted
