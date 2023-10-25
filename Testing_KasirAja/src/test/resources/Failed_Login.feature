Feature: Failed_Login
  Scenario: Failed login with empty username
    Given I open browser
    And open website saucedemo
    And Located on saucedemo website
    When I input empty username
    And I input valid password
    Then I should see an error message "Epic sadface: Username is required"
