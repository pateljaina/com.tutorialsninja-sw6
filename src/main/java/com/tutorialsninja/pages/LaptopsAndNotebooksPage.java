package com.tutorialsninja.pages;

import com.tutorialsninja.browserfactory.ManageBrowser;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksText;

    @CacheLookup
    @FindAll(@FindBy(how= How.XPATH, using = "//p[@class ='price']"))
    List<WebElement> laptopsAndNotebooksPageSortList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortField;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement productMacBook;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement productNameMacBook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successPopUpMessage;


    public String getPageName() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public ArrayList getProductNamesListedUnderLaptopsAndNotebooks() {
        log.info("Get a list of all products listed under Laptops and Notebooks"+ laptopsAndNotebooksPageSortList);
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return (ArrayList) originalProductsPrice;
    }

    //"Price (High > Low)"
    public ArrayList getProductNamesByPrice(String priceSort) {
        log.info("Get a list of all products listed under Laptops and Notebooks by price" + laptopsAndNotebooksPageSortList);
        selectByVisibleTextFromDropDown(sortField, priceSort);
        // After filter Price (High > Low) Get all the products name and stored into array list
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return afterSortByPrice;
    }

    public void selectSortByPrice(String sortPrice) {
        log.info("Select the sort by price tab" + sortField.toString());
        selectByVisibleTextFromDropDown(sortField, sortPrice);
    }

    public void clickOnProductMacBook() {
        log.info("Click on the MacBook product" + productMacBook.toString());
        clickOnElement(productMacBook);
    }

    public String getProductName() {
        log.info("Verify the MacBook product name" + productNameMacBook.toString());
        return getTextFromElement(productNameMacBook);
    }

    public void clickOnAddToCartButton() {
        log.info("Click on add to cart button" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getTextToConfirmProductAddedToCart() {
        log.info("Verify the product has been added to the cart" + successPopUpMessage.toString());
        return getTextFromElement(successPopUpMessage);
    }

}
