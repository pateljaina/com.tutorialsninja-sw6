package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AccountLoginSteps {
    @When("^I click on my Account link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("^I select \"([^\"]*)\" from my Account options$")
    public void iSelectFromMyAccountOptions(String option) {
        new HomePage().selectMyAccountOptions(option);

    }

    @Then("^I am navigated to the Login page successfully$")
    public void iAmNavigatedToTheLoginPageSuccessfully() {
        Assert.assertEquals("Not navigated to Login Page", "Returning Customer", new LoginPage().verifyLoginPageText());
    }

    @And("^I enter First name \"([^\"]*)\"and last name \"([^\"]*)\"$")
    public void iEnterFirstNameAndLastName(String first, String last) {
        new RegisterPage().enterFirstName(first);
        new RegisterPage().enterLastName(last);
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new RegisterPage().enterEmailAddress(email);
    }

    @And("^I enter Telephone number \"([^\"]*)\"$")
    public void iEnterTelephoneNumber(String phNo) {
        new RegisterPage().enterTelephoneNo(phNo);
    }

    @And("^I enter password \"([^\"]*)\" and confirm password \"([^\"]*)\"$")
    public void iEnterPasswordAndConfirmPassword(String pass , String confirmPass) {
        new RegisterPage().enterPassword(pass);
        new RegisterPage().enterConfirmPassword(confirmPass);
    }

    @And("^I select \"([^\"]*)\" radio button to subscribe$")
    public void iSelectRadioButtonToSubscribe(String text) {
        new RegisterPage().selectRadioButtonToSubscribe(text);
    }

    @And("^I click on the privacy policy checkbox$")
    public void iClickOnThePrivacyPolicyCheckbox() {
        new RegisterPage().clickOnPrivacyPolicyCheckbox();
    }

    @And("^I click on continue to Register$")
    public void iClickOnContinueToRegister() {
        new RegisterPage().clickOnContinueToRegister();
    }

    @And("^I click on continue to navigate to account$")
    public void iClickOnContinueToNavigateToAccount() {
        new AccountPage().clickOnContinueToNavigateToAccount();
    }


    @And("^I enter email address \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterEmailAddressAndPassword(String email, String pass) {
        new LoginPage().enterEmailAddress(email);
        new LoginPage().enterPassword(pass);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I am able to see \"([^\"]*)\" page name$")
    public void iAmAbleToSeePageName(String expected) {
        Assert.assertEquals("Not navigated to My account page", expected,  new AccountPage().verifyMyAccountPageName());
    }

    @And("^I am able to see the \"([^\"]*)\" text$")
    public void iAmAbleToSeeTheText(String expected) {
        Assert.assertEquals("Not logged out of the account", expected,  new AccountPage().verifyAccountLogoutText());
    }

    @Then("^I click on continue to navigate to Homepage$")
    public void iClickOnContinueToNavigateToHomepage() {
        new AccountPage().clickOnContinueToNavigateToHomepage();
    }

}
