package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuSteps {
    @Then("^I am navigated to the Desktops page successfully$")
    public void iAmNavigatedToTheDesktopsPageSuccessfully() {
        Assert.assertEquals("Not navigated to the Desktops page", "Desktops", new DesktopPage().getPageName());
    }


    @Then("^I am navigated to the Laptops and Notebooks page successfully$")
    public void iAmNavigatedToTheLaptopsAndNotebooksPageSuccessfully() {
        Assert.assertEquals("Not navigated to the Laptops And Notebooks page", "Laptops & Notebooks", new LaptopsAndNotebooksPage().getPageName());
    }

    @When("^I mouse hover on Components tab and click$")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentsTabAndClick();
    }

    @And("^I select Show All Components from Drop down$")
    public void iSelectShowAllComponentsFromDropDown() {
        new HomePage().selectShowAllComponentsFromDropDown();
    }

    @Then("^I am navigated to the Components page successfully$")
    public void iAmNavigatedToTheComponentsPageSuccessfully() {
        Assert.assertEquals("Not navigated to the Components page", "Components", new ComponentsPage().getPageName());
    }

}
