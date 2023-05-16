Feature: Top Menu
  As a user I want to explore the top menu tabs

  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify user should navigate to Desktops Page successfully
    When  I mouse hover on Desktops tab and click
    And   I select Show All Desktops from Drop down
    Then  I am navigated to the Desktops page successfully

  @Sanity @Regression
  Scenario: Verify user should navigate to Laptops and Notebooks Page successfully
    When  I mouse hover on Laptops and Notebooks tab and click
    And   I select Show All Laptops and Notebooks from Drop down
    Then  I am navigated to the Laptops and Notebooks page successfully

  @Regression
  Scenario: Verify user should navigate to Components Page successfully
    When  I mouse hover on Components tab and click
    And   I select Show All Components from Drop down
    Then  I am navigated to the Components page successfully