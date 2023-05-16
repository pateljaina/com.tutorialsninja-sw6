Feature: Account Login Page
  As a user I want to Login to the tutorials ninja website

  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify user should navigate to Login Page successfully
    When  I click on my Account link
    And   I select "Login" from my Account options
    Then  I am navigated to the Login page successfully

  @Sanity @Regression
  Scenario: Verify that user should Login and Logout successfully
    When  I click on my Account link
    And   I select "Register" from my Account options
    And   I enter First name "Abc"and last name "Xyz"
    And   I enter email address "test123@gmail.com"
    And   I enter Telephone number "0987654321"
    And   I enter password "test123" and confirm password "test123"
    And   I select "Yes" radio button to subscribe
    And   I click on the privacy policy checkbox
    And   I click on continue to Register
    And   I click on continue to navigate to account
    And   I click on my Account link
    And   I select "Logout" from my Account options
    And   I click on continue to navigate to Homepage
    And   I click on my Account link
    And   I select "Login" from my Account options
    And   I enter email address "test123@gmail.com" and password "test123"
    And   I click on Login button
    And   I am able to see "My Account" page name
    And   I click on my Account link
    And   I select "Logout" from my Account options
    And   I am able to see the "Account Logout" text
    Then  I click on continue to navigate to Homepage