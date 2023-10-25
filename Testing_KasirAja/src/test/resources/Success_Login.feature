Feature: Success_Login
  Scenario: Sucessfull login
    Given I open browser
    And open website saucedemo
    And Located on saucedemo website
    When I input valid username
    And I input valid password
    Then I go to homepage