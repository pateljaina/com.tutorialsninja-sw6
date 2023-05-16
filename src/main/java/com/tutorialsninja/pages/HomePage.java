package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktops;

    @CacheLookup
    @FindBy(linkText= "Show All Desktops")
    List<WebElement> showAllDesktops;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    List<WebElement> showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List<WebElement> accountList;

    @CacheLookup
    @FindBy(linkText = "Show All Components")
    List<WebElement> showAllComponents;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    List<WebElement> currencyList;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;


    public void mouseHoverOnDesktopsTabAndClick() {
        log.info("Hover the mouse on Desktops tab and click" + desktops.toString());
        mouseHoverToElementAndClick(desktops);
    }

    public void selectShowAllDesktopsFromDropDown() {
        log.info("Select show all desktops from drop down" + showAllDesktops.toString());
        selectMenu(showAllDesktops, "Show All Desktops");
    }

    public void mouseHoverOnLaptopsAndNotebooksTabAndClick() {
        log.info("Hover the mouse on Laptops & Notebooks tab and click" + laptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public void selectShowAllLaptopsAndNotebooksFromDropDown() {
        log.info("Select show all Laptops & Notebooks from drop down" + showAllLaptopsAndNotebooks.toString());
        selectMenu(showAllLaptopsAndNotebooks, "Show All Laptops & Notebooks");
    }

    public void mouseHoverOnComponentsTabAndClick() {
        log.info("Hover the mouse on Components tab and click" + components.toString());
        mouseHoverToElementAndClick(components);
    }

    public void selectShowAllComponentsFromDropDown() {
        log.info("Select show all Components from drop down" + showAllComponents.toString());
        selectMenu(showAllComponents, "Show All Components");
    }

    public void changeCurrency(String currencyChoice) {
        log.info("Click on currency tab" + currency.toString());
        log.info("Change the currency" + currencyList.toString());
        clickOnElement(currency);
        try {
            selectMenu(currencyList, currencyChoice);
        } catch (StaleElementReferenceException e) {
            List<WebElement> currencyList;
        }
    }

    public void selectMyAccountOptions(String option) {
        try {
            selectMenu(accountList, option);
        } catch (StaleElementReferenceException e) {
            //selectMenu( By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"), option);
            List<WebElement> accountList;
        }
    }

    public void clickOnMyAccountLink() {
        log.info("Click on My Account link" + myAccount.toString());
        try{
            clickOnElement(myAccount);
        }catch (StaleElementReferenceException e){
            clickOnElement(By.xpath("//span[contains(text(),'My Account')]"));
        }
    }
}
