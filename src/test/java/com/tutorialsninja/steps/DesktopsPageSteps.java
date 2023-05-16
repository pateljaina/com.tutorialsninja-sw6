package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Collections;

public class DesktopsPageSteps {
    @When("^I mouse hover on Desktops tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsTabAndClick();
    }

    @And("^I select Show All Desktops from Drop down$")
    public void iSelectShowAllDesktopsFromDropDown() {
        new HomePage().selectShowAllDesktopsFromDropDown();
    }

    @Then("^I am able to see that the products are arranged in Alphabetical oder when user selects sort by Name Z to A$")
    public void iAmAbleToSeeThatTheProductsAreArrangedInAlphabeticalOderWhenUserSelectsSortByNameZToA() throws InterruptedException{
        new DesktopPage().getProductNamesListedUnderDesktops();
        Collections.reverse(new DesktopPage().getProductNamesListedUnderDesktops());
        Thread.sleep(3000);
        Assert.assertEquals("Products not arranged in alphabetical order", new DesktopPage().getProductNamesListedUnderDesktops(), new DesktopPage().getProductNamesListByNameZToA("Name (Z - A)"));
    }

    @When("^I click on Currency tab to change currency to \"([^\"]*)\"$")
    public void iClickOnCurrencyTabToChangeCurrencyTo(String currency) {
        new HomePage().changeCurrency(currency);
    }

    @And("^I sort product by \"([^\"]*)\"$")
    public void iSortProductBy(String text) {
        new DesktopPage().sortProductsByName(text);
    }

    @And("^I select hpProduct$")
    public void iSelectHpProduct() {
        new DesktopPage().selectHpProduct();
    }

    @And("^I am able to see the \"([^\"]*)\"$")
    public void iAmAbleToSeeThe(String product) {
        Assert.assertEquals("HP LP3065 Product not display", product, new DesktopPage().getTextFromHpProduct());

    }

    @And("^I select the deliver date year \"([^\"]*)\", month \"([^\"]*)\", Date \"([^\"]*)\"$")
    public void iSelectTheDeliverDateYearMonthDate(String day, String month, String year) throws InterruptedException{
        Thread.sleep(3000);
        new DesktopPage().selectDeliveryDate(day, month, year);

    }

    @And("^I add product to cart$")
    public void iAddProductToCart() {
        new DesktopPage().addProductToCart();
    }

    @And("^I am able to see the shopping cart success message \"([^\"]*)\"$")
    public void iAmAbleToSeeTheShoppingCartSuccessMessage(String expected) {
        Assert.assertTrue("Product not added to cart", new DesktopPage().getTextToConfirmProductAddedToCart().contains("Success: You have added HP LP3065 to your shopping cart!"));
    }

    @And("^I click on shopping cart link success message$")
    public void iClickOnShoppingCartLinkSuccessMessage() {
        new ShoppingCartPage().clickOnShoppingCartLinkInSuccessMessage();
    }

    @And("^I am navigated to the Shopping cart page and I can see \"([^\"]*)\" text$")
    public void iAmNavigatedToTheShoppingCartPageAndICanSeeText(String expected) {
        Assert.assertTrue("Not navigated to Shopping Cart Page", new ShoppingCartPage().getPageNameShoppingCart().contains(expected));
    }

    @And("^I verify that the product name in the cart is \"([^\"]*)\"$")
    public void iVerifyThatTheProductNameInTheCartIs(String expected) {
        Assert.assertEquals("Product name does not match", expected, new ShoppingCartPage().confirmHpProductName());
    }

    @And("^I verify that the delivery date is \"([^\"]*)\"$")
    public void iVerifyThatTheDeliveryDateIs(String expected) {
        Assert.assertTrue("", new ShoppingCartPage().getTheDeliveryDate().contains(expected));
    }

    @And("^I verify that the model name of the selected product is \"([^\"]*)\"$")
    public void iVerifyThatTheModelNameOfTheSelectedProductIs(String expected) {
        Assert.assertEquals("Product 21", expected, new ShoppingCartPage().getTextForTheModelOfSelectedProduct());
    }


    @Then("^I verify that the total amount in the shopping cart is \"([^\"]*)\"$")
    public void iVerifyThatTheTotalAmountInTheShoppingCartIs(String expected)  {
        Assert.assertEquals("Total does not match",expected, new ShoppingCartPage().getTheTotalAmount());
    }

}
