package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomer;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginButton;


    public String verifyLoginPageText() {
        log.info("Verify the Login Page name" + returningCustomer.toString());
        return getTextFromElement(returningCustomer);
    }

    public void enterEmailAddress(String text) {
        log.info("Enter the email address in the email address field" + emailAddressField.toString());
        sendTextToElement(emailAddressField, text);
    }

    public void enterPassword(String text) {
        log.info("Enter the password in the password field" + passwordField.toString());
        sendTextToElement(passwordField, text);
    }

    public void clickOnLoginButton() {
        log.info("Click on the Login button" + loginButton.toString());
        clickOnElement(loginButton);
    }
}
