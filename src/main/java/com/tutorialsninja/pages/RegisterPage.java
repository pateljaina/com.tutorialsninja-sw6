package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccount;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement phoneNoField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindAll(@FindBy(xpath = "//fieldset[3]//input"))
    List<WebElement> radioButtonField;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueToRegister;


    public String verifyTextRegisterAccount() {
        log.info("Verify the Register Page name" + registerAccount.toString());
        return getTextFromElement(registerAccount);
    }

    public void enterFirstName(String text) {
        log.info("Enter the first name in the First name field" + firstNameField.toString());
        sendTextToElement(firstNameField, text);
    }

    public void enterLastName(String text) {
        log.info("Enter the last name in the last name field" + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterEmailAddress(String text) {
        log.info("Enter the email address in the email address field" + emailField.toString());
        sendTextToElement(emailField, text);
    }

    public void enterTelephoneNo(String text) {
        log.info("Enter the Telephone no in the Phone no field" + phoneNoField.toString());
        sendTextToElement(phoneNoField, text);
    }

    public void enterPassword(String text) {
        log.info("Enter the password in the Password field" + passwordField.toString());
        sendTextToElement(passwordField, text);
    }

    public void enterConfirmPassword(String text) {
        log.info("Enter the confirm password in the Confirm Password field" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, text);
    }

    public void selectRadioButtonToSubscribe(String text) {
        log.info("Select the Radio button to subscribe" + radioButtonField.toString());
        //List<WebElement> radioButtons = driver.findElements(radioButtonField);
        for (WebElement e : radioButtonField) {
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckbox() {
        log.info("Click on privacy policy checkbox" + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueToRegister() {
        log.info("Click on continue ToRegister" + continueToRegister.toString());
        clickOnElement(continueToRegister);
    }
}
