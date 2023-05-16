package com.tutorialsninja.steps;

import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Collections;

public class LaptopsAndNotebooksPageSteps {
    @When("^I mouse hover on Laptops and Notebooks tab and click$")
    public void iMouseHoverOnLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksTabAndClick();
    }

    @And("^I select Show All Laptops and Notebooks from Drop down$")
    public void iSelectShowAllLaptopsAndNotebooksFromDropDown() {
        new HomePage().selectShowAllLaptopsAndNotebooksFromDropDown();
    }

    @Then("^I am able to see that the products are arranged  from High to Low price order when user selects sort by Price \\(High > Low\\)$")
    public void iAmAbleToSeeThatTheProductsAreArrangedFromHighToLowPriceOrderWhenUserSelectsSortByPriceHighLow() {
        Collections.sort(new LaptopsAndNotebooksPage().getProductNamesListedUnderLaptopsAndNotebooks(), Collections.reverseOrder());
        Assert.assertEquals("products not sorted by price",new LaptopsAndNotebooksPage().getProductNamesListedUnderLaptopsAndNotebooks(), new LaptopsAndNotebooksPage().getProductNamesByPrice("Price (High > Low)"));
    }

    @And("^I sort product by price \"([^\"]*)\"$")
    public void iSortProductByPrice(String priceSort) {
        new LaptopsAndNotebooksPage().selectSortByPrice(priceSort);

    }

    @And("^I click on Mac Book$")
    public void iClickOnMacBook() {
        new LaptopsAndNotebooksPage().clickOnProductMacBook();
    }

    @And("^I can verify that I am navigated to the \"([^\"]*)\" page$")
    public void iCanVerifyThatIAmNavigatedToThePage(String expected) {
        Assert.assertTrue("Not navigated to Shopping Cart Page", new ShoppingCartPage().getPageNameShoppingCart().contains(expected));

    }

    @And("^I can verify that I am navigated to the \"([^\"]*)\" product page$")
    public void iCanVerifyThatIAmNavigatedToTheProductPage(String expected) {
        Assert.assertEquals("MacBook Product Page not displayed", expected, new LaptopsAndNotebooksPage().getProductName());
    }

    @And("^I click on the add to cart button$")
    public void iClickOnTheAddToCartButton() {
        new LaptopsAndNotebooksPage().clickOnAddToCartButton();
    }

    @And("^I am able to verify the message \"([^\"]*)\"$")
    public void iAmAbleToVerifyTheMessage(String expected) {
        Assert.assertTrue("Product not added to cart", new LaptopsAndNotebooksPage().getTextToConfirmProductAddedToCart().contains(expected));
    }

    @And("^I click on the shopping cart link in the success message$")
    public void iClickOnTheShoppingCartLinkInTheSuccessMessage() {
        new ShoppingCartPage().clickOnShoppingCartLinkInSuccessMessage();
    }

    @And("^I can verify that the product name in the cart is \"([^\"]*)\"$")
    public void iCanVerifyThatTheProductNameInTheCartIs(String expected) {
        Assert.assertEquals("", expected, new ShoppingCartPage().confirmMacBkProductName());
    }

    @And("^I update the quantity of the product to \"([^\"]*)\"$")
    public void iUpdateTheQuantityOfTheProductTo(String qty) {
        new ShoppingCartPage().updateQuantityToTwo(qty);
    }

    @And("^I click on update button to update quantity$")
    public void iClickOnUpdateButtonToUpdateQuantity() {
        new ShoppingCartPage().clickToUpdateQty();
    }

    @And("^I am able to see the shopping cart updated message \"([^\"]*)\"$")
    public void iAmAbleToSeeTheShoppingCartUpdatedMessage(String expected) {
        Assert.assertTrue("Cart not modified", new ShoppingCartPage().confirmQtyUpdatedMessage().contains(expected));

    }

    @And("^I am able to verify that the total amount in the cart is \"([^\"]*)\"$")
    public void iAmAbleToVerifyThatTheTotalAmountInTheCartIs(String expected) {
        Assert.assertEquals("Total does not match", expected, new ShoppingCartPage().getTheTotalAmount());
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }
    @And("^I can verify that I am navigated from shopping cart to the \"([^\"]*)\" page$")
    public void iCanVerifyThatIAmNavigatedFromShoppingCartToThePage(String expected)  {
        Assert.assertEquals("Not navigated to checkout",expected, new CheckOutPage().getPageNameCheckout());
    }

    @And("^I am able to see the page text \"([^\"]*)\"$")
    public void iAmAbleToSeeThePageText(String expected)throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals("New Customer text not seen",expected, new CheckOutPage().verifyNewCustomerText());
    }

    @And("^I click on the guest checkout radio button$")
    public void iClickOnTheGuestCheckoutRadioButton() {
        new CheckOutPage().clickOnGuestCheckoutRadioButton();
    }

    @And("^I click on new customer continue button$")
    public void iClickOnNewCustomerContinueButton() {
        new CheckOutPage().clickOnNewCustomerContinueButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String first) {
        new CheckOutPage().enterFirstName(first);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String last) {
        new CheckOutPage().enterLastName(last);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new CheckOutPage().enterEmail(email);
    }

    @And("^I enter phone no \"([^\"]*)\"$")
    public void iEnterPhoneNo(String phNo) {
        new CheckOutPage().enterPhoneNo(phNo);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address)  {
        new CheckOutPage().enterAddressLn1(address);
    }

    @And("^I enter city name \"([^\"]*)\"$")
    public void iEnterCityName(String city) {
        new CheckOutPage().enterCity(city);
    }

    @And("^I enter postcode \"([^\"]*)\"$")
    public void iEnterPostcode(String postCode) {
        new CheckOutPage().enterPostCode(postCode);
    }

    @And("^I select Country \"([^\"]*)\" from drop down$")
    public void iSelectCountryFromDropDown(String country) {
        new CheckOutPage().selectCountryFromDropDown(country);
    }

    @And("^I select Region \"([^\"]*)\" from drop down$")
    public void iSelectRegionFromDropDown(String region) {
        new CheckOutPage().selectRegionFromDropDown(region);
    }

    @And("^I click on the Continue as Guest button$")
    public void iClickOnTheContinueAsGuestButton() {
        new CheckOutPage().clickOnContinueGuestButton();
    }

    @And("^I add comments about the order \"([^\"]*)\"$")
    public void iAddCommentsAboutTheOrder(String text) {
        new CheckOutPage().addCommentsAboutYourOrder(text);

    }

    @And("^I click on Terms and conditions check box$")
    public void iClickOnTermsAndConditionsCheckBox() {
        new CheckOutPage().clickOnTermsAndConditionsCheckBox();
    }

    @And("^I click on continue button to proceed to payment$")
    public void iClickOnContinueButtonToProceedToPayment() {
        new CheckOutPage().clickOnContinueButtonToProceedToPayment();
    }

    @Then("^I get payment warning message \"([^\"]*)\"$")
    public void iGetPaymentWarningMessage(String expected) {
        Assert.assertTrue("",new CheckOutPage().getPaymentWarningMessage().contains(expected));
    }
}
