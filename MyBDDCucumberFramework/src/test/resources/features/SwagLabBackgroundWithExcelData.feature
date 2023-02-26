#Author: your.email@your.domain.com
Feature: SwagLab product buy functionality test scenario with excel data

  Background: SwagLab test background
    Given User opens the browser and SwagLab application using data provided on "UserData1" sheet
    When User enter username and password provided on "UserData1" sheet
    And User click on the login button after enter data from sheet

  Scenario: Test the product but functionality for lowest price product
    When User sort the product list in ascending order of price
    And User add the lowest price product in the cart
    And User navigate to cart page
    Then Lowest price product should be added to the cart
    When User click on checkout button
    And User enter firstname, lastname and zip code provide on "UserData1" sheet
    Then Verify the total amount is addition of item cost and tax amount
    When User click on the finish button
    Then Order confirmation message should be displayed

  Scenario: Test the product buy functionality of highest price product
    When User sort the product list in descending order of price
    And User add the highest price product in the cart
    And User navigate to cart page
    Then Highest price product should be added to the cart
    When User click on checkout button
    And User enter firstname, lastname and zip code provide on "UserData1" sheet
    Then Verify the total amount is addition of item cost and tax amount
    When User click on the finish button
    Then Order confirmation message should be displayed
