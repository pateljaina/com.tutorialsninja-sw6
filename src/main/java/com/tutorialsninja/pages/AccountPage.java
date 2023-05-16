package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility{    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]" )
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAcctCreated;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueToHomepage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountPage;


    public String verifyAccountCreatedText() {
        log.info("Verify Account is Created Text" + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueToNavigateToAccount() {
        log.info("Click on continue to navigate to the account" + continueButtonAcctCreated.toString());
        clickOnElement(continueButtonAcctCreated);
    }

    public String verifyAccountLogoutText() {
        log.info("Verify Account is Logged out Text" + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public void clickOnContinueToNavigateToHomepage() {
        log.info("Click on continue to navigate to the homepage" + continueToHomepage.toString());
        clickOnElement(continueToHomepage);
    }

    public String verifyMyAccountPageName() {
        log.info("Verify My Account page name" + myAccountPage.toString());
        return getTextFromElement(myAccountPage);
    }

}
