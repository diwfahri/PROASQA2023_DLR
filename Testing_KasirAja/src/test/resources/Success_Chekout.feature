Feature: Success_Checkout
  Scenario: Successful checkout
    Given I go to homepage after login
    And I select a product to add to the cart
    When I tap the Add to Cart button
    And I click on the cart icon
    And I tap the Checkout button
    And I input my first name
    And I input my last name
    And I input my zip or postal code
    And I tap the Continue button
    Then Launch checkout overview
    And I tap the finish button
    Then I go to checkout complete