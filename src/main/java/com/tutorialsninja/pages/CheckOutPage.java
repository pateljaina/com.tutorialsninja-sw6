package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkOutButtonPageName;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value= 'guest']")
    WebElement guestCheckoutRadioButton;

    @CacheLookup
    @FindBy(id = "button-account")
    WebElement continueButton;

    @CacheLookup
    @FindBy(css = "#input-payment-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(css = "#input-payment-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "#input-payment-email")
    WebElement email;

    @CacheLookup
    @FindBy(css = "#input-payment-telephone" )
    WebElement phoneNo;

    @CacheLookup
    @FindBy(css = "#input-payment-address-1")
    WebElement addressLn1;

    @CacheLookup
    @FindBy(css = "#input-payment-city")
    WebElement cityField;

    @CacheLookup
    @FindBy(css = "#input-payment-postcode")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement countryField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement regionField;

    @CacheLookup
    @FindBy(css = "#button-guest")
    WebElement continueGuestButton;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name = 'comment']")
    WebElement textAreaCommentBox;

    @CacheLookup
    @FindBy(xpath = "//input[@type= 'checkbox']")
    WebElement tAndCsCheckBox;

    @CacheLookup
    @FindBy(css = "#button-payment-method")
    WebElement continueButtonToPay;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement paymentWarningMessage;


    public String getPageNameCheckout(){
        log.info("Verify Checkout page name" + checkOutButtonPageName.toString());
        return getTextFromElement(checkOutButtonPageName);
    }

    public String verifyNewCustomerText(){
        log.info("Verify New Customer Text" + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton(){
        log.info("Click on Guest Checkout Radio button" + guestCheckoutRadioButton.toString());
        clickOnElement(guestCheckoutRadioButton);
    }

    public void clickOnNewCustomerContinueButton(){
        log.info("Click on New customer continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void enterFirstName(String text){
        log.info("Enter first name in the first name field" + firstName.toString());
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text){
        log.info("Enter last name in the last name field" + lastName.toString());
        sendTextToElement(lastName, text);
    }

    public void enterEmail(String emailId){
        log.info("Enter first email in the email address field" + email.toString());
        sendTextToElement(email,emailId);
    }

    public void enterPhoneNo(String phNo){
        log.info("Enter phone no in the phone no field" + phoneNo.toString());
        sendTextToElement(phoneNo,phNo);
    }

    public void enterAddressLn1(String address1){
        log.info("Enter first line of address in the address line 1 field" + addressLn1.toString());
        sendTextToElement(addressLn1, address1);
    }

    public void enterCity(String cityName){
        log.info("Enter city in the city name field" + cityField.toString());
        sendTextToElement(cityField, cityName);
    }

    public void enterPostCode(String postcodeText){
        log.info("Enter post code in the post code field" + postCodeField.toString());
        sendTextToElement(postCodeField, postcodeText);
    }

    public void selectCountryFromDropDown(String countryName){
        log.info("Select country from the country field drop down menu" + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, countryName);
    }

    public void selectRegionFromDropDown(String regionName){
        log.info("Select region from the region field drop down menu" + regionField.toString());
        selectByVisibleTextFromDropDown(regionField, regionName);
    }

    public void clickOnContinueGuestButton(){
        log.info("Click on continue as guest button" + continueGuestButton.toString());
        clickOnElement(continueGuestButton);
    }

    public void addCommentsAboutYourOrder(String orderText){
        log.info("Enter comments in About your order box" + textAreaCommentBox.toString());
        sendTextToElement(textAreaCommentBox, orderText);
    }

    public void clickOnTermsAndConditionsCheckBox(){
        log.info("Click on Terms and conditions checkbox" + tAndCsCheckBox.toString());
        clickOnElement(tAndCsCheckBox);
    }

    public void clickOnContinueButtonToProceedToPayment(){
        log.info("Click on continue button to proceed to payment" + continueButtonToPay.toString());
        clickOnElement(continueButtonToPay);
    }

    public String getPaymentWarningMessage(){
        log.info("Verify payment warning message" + paymentWarningMessage.toString());
        return getTextFromElement(paymentWarningMessage);
    }

}
