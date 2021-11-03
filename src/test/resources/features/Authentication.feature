Feature: Test

  Background: Setup
    Given chrome browser

  Scenario: Open OneHome and login
    When open site https://rozetka.com.ua/
    And click category
    And click subcategory
    And add an item to the cart
    And open cart
    Then item is present in the cart


