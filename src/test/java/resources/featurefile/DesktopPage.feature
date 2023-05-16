Feature: Desktop Page Test
  As As a user I want to be able to explore the different features and pages on the Desktop page

  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify that products arrange in an Alphabetical order when user selects sort by Name Z to A
    When  I mouse hover on Desktops tab and click
    And   I select Show All Desktops from Drop down
    Then  I am able to see that the products are arranged in Alphabetical oder when user selects sort by Name Z to A

  @Sanity @Regression
  Scenario: Verify that the user is able to add product to shopping cart successfully
    When  I click on Currency tab to change currency to "£ Pound Sterling"
    And   I mouse hover on Desktops tab and click
    And   I select Show All Desktops from Drop down
    And   I sort product by "Name (Z - A)"
    And   I select hpProduct
    And   I am able to see the "HP LP3065"
    And   I select the deliver date year "2023", month "November", Date "30"
    And   I add product to cart
    And   I am able to see the shopping cart success message "Success: You have added HP LP3065 to your shopping cart!"
    And   I click on shopping cart link success message
    And   I am navigated to the Shopping cart page and I can see "Shopping Cart" text
    And   I verify that the product name in the cart is "HP LP3065"
    And   I verify that the delivery date is "2023-11-30"
    And   I verify that the model name of the selected product is "Product 21"
    Then  I verify that the total amount in the shopping cart is "£74.73"