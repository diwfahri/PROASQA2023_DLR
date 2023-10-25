Feature: Failed_Checkout
  Scenario: Failed checkout with empty firstname
    Given I go to homepage after login
    And I select a product to add to the cart
    When I tap the Add to Cart button
    And I click on the cart icon
    And I tap the Checkout button
    And I input empty first name
    And I input my last name
    And I input my zip or postal code
    And I tap the Continue button
    Then Show error pop up "Error: First Name is required"