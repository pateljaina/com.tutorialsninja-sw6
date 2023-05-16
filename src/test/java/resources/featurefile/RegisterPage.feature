Feature: Register Page Test

  As a user I am able to register on the tutorials ninja website

  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify user should navigate to Register page successfully
    When  I click on my Account link
    And   I select "Register" from my Account options
    Then  I am navigated to the Register page successfully

  @Sanity @Regression
  Scenario: Verify that the user is able to register account successfully
    When  I click on my Account link
    And   I select "Register" from my Account options
    And   I enter First name "Abc"and last name "Xyz"
    And   I enter email address "test123z@gmail.com"
    And   I enter Telephone number "0987654321"
    And   I enter password "test123" and confirm password "test123"
    And   I select "Yes" radio button to subscribe
    And   I click on the privacy policy checkbox
    And   I click on continue to Register
    And   I am able to see account created message "Your Account Has Been Created!"
    And   I click on continue to navigate to account
    And   I click on my Account link
    And   I select "Logout" from my Account options
    And   I am able to see the "Account Logout" text
    Then  I click on continue to navigate to Homepage