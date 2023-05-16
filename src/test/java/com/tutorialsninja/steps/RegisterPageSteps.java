package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RegisterPageSteps {
    @Then("^I am navigated to the Register page successfully$")
    public void iAmNavigatedToTheRegisterPageSuccessfully() {
        Assert.assertEquals("Not navigated to Register Page", "Register Account", new RegisterPage().verifyTextRegisterAccount());
    }

    @And("^I am able to see account created message \"([^\"]*)\"$")
    public void iAmAbleToSeeAccountCreatedMessage(String expected) {
        Assert.assertEquals("Account created text not displayed",expected, new AccountPage().verifyAccountCreatedText());
    }
}
