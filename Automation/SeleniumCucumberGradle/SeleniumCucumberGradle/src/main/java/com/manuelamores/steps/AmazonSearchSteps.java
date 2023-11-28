package com.manuelamores.steps;

import com.manuelamores.pages.AmazonSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AmazonSearchSteps {

    AmazonSearchPage  amazon = new AmazonSearchPage();

    @Given("^the user navigate to www.amazon.com$")
    public void theUserNavigateToWwwAmazonCom() {
        amazon.navigateToAmazon();
        System.out.println("Pase");
    }

    @And("^searches for (.+)$")
    public void searchesForProduct(String criteria) {
        System.out.println("Entre a productos");
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

    @And("^navigates to the page number (.+)$")
    public void navigatesToTheSecondPage(String pageNumber) {
        amazon.goToPage(pageNumber);
    }

    @And("^selects the third item$")
    public void selectsTheThirdItem() {
        amazon.pick3rdItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void theUserIsAbleToAddItToTheCart() {
        amazon.addToCart();
        Assert.assertEquals("Agregado al carrito", amazon.addedToCartMessage());
    }
}
