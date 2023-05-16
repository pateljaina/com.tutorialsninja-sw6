package com.tutorialsninja.pages;

import com.tutorialsninja.browserfactory.ManageBrowser;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> desktopPageSortList;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement selectSortField;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement hpProduct;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement hpProductText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement calendarIcon;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthYearTag;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextArrow;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement> selectAllDates;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement productAddedToShoppingCartMessage;


    public String getPageName() {
        log.info("Verify the Desktop page name" + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public ArrayList getProductNamesListedUnderDesktops() {
        log.info("Get a list of all products listed under desktops" + desktopPageSortList.toString());
        //List<WebElement> products = desktopPageSortList;
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductName.add(e.getText());
            //sort arraylist by reverse order
        }
        return originalProductName;
    }

    public ArrayList getProductNamesListByNameZToA(String text) throws InterruptedException {
        log.info("Get a list of all products listed under desktops by Name Z to A" + desktopPageSortList.toString());
        selectByVisibleTextFromDropDown(selectSortField, text);
        Thread.sleep(5000);
        //get all the product names sorted by Z to A and store into array list
        //List<WebElement> products = desktopPageSortList;
        List<WebElement> products = ManageBrowser.driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZtoAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZtoAProductsName.add(e.getText());
        }
        return afterSortByZtoAProductsName;
    }

    public void sortProductsByName(String text) {
        selectByVisibleTextFromDropDown(selectSortField, text);
    }


    public void selectHpProduct() {
        log.info("Select Hp product" + hpProduct.toString());
        clickOnElement(hpProduct);
    }

    public String getTextFromHpProduct() {
        log.info("Verify the name of the Hp product" + hpProductText.toString());
        return getTextFromElement(hpProductText);
    }

    public void selectDeliveryDate(String year, String month, String date) {
        log.info("Click on calendar to select date" + calendarIcon.toString());
        log.info("Click on month year tag" + monthYearTag.toString());
        log.info("Click on next arrow to select month and year" + nextArrow.toString());
        log.info("Select dates to pick the date of choice" + selectAllDates.toString());

        clickOnElement(calendarIcon);
        while (true) {
            String monthAndYear = monthYearTag.getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextArrow);
            }
        }
        List<WebElement> allDates = ManageBrowser.driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void addProductToCart() {
        log.info("Click on add to cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getTextToConfirmProductAddedToCart() {
        log.info("Verify Message confirming product added to shopping cart" + productAddedToShoppingCartMessage.toString());
        return getTextFromElement(productAddedToShoppingCartMessage);
    }

}
