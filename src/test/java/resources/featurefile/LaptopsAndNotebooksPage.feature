Feature: Laptops And Notebooks Page
  As a user I want to be able to explore the different features and pages on the Laptops And Notebooks Page


  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify that products arrange from High to Low price order when user selects sort by Price (High > Low)
    When  I mouse hover on Laptops and Notebooks tab and click
    And   I select Show All Laptops and Notebooks from Drop down
    Then  I am able to see that the products are arranged  from High to Low price order when user selects sort by Price (High > Low)

  @Sanity @Regression
  Scenario: Verify that the user is able to place order successfully
    When  I click on Currency tab to change currency to "£ Pound Sterling"
    And   I mouse hover on Laptops and Notebooks tab and click
    And   I select Show All Laptops and Notebooks from Drop down
    And   I sort product by price "Price (High > Low)"
    And   I click on Mac Book
    And   I can verify that I am navigated to the "MacBook" product page
    And   I click on the add to cart button
    And   I am able to verify the message "Success: You have added MacBook to your shopping cart!"
    And   I click on the shopping cart link in the success message
    And   I can verify that I am navigated to the "Shopping Cart" page
    And   I can verify that the product name in the cart is "MacBook"
    And   I update the quantity of the product to "2"
    And   I click on update button to update quantity
    And   I am able to see the shopping cart updated message "Success: You have modified your shopping cart!"
    And   I am able to verify that the total amount in the cart is "£737.45"
    And   I click on checkout button
    And   I can verify that I am navigated from shopping cart to the "Checkout" page
    And   I am able to see the page text "New Customer"
    And   I click on the guest checkout radio button
    And   I click on new customer continue button
    And   I enter first name "Abc"
    And   I enter last name "Xyz"
    And   I enter email "test123z@gmail.com"
    And   I enter phone no "0987654321"
    And   I enter Address "10 Downing Street"
    And   I enter city name "London"
    And   I enter postcode "EC1B 2JL"
    And   I select Country "United Kingdom" from drop down
    And   I select Region "Greater London" from drop down
    And   I click on the Continue as Guest button
    And   I add comments about the order "Thank You"
    And   I click on Terms and conditions check box
    And   I click on continue button to proceed to payment
    Then  I get payment warning message "Warning: Payment method required!"

