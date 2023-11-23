package com.manuelamores.steps;

import com.manuelamores.pages.GooglePage;
import io.cucumber.java.en.*;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    @Given("^I am on the google search page$")
    public void iAmOnTheGoogleSearchPage() {
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void iEnterASearchCriteria() {
        System.out.println("Hola");
    }

    @And("^Click on the search button$")
    public void clickOnTheSearchButton() {
        System.out.println("Hola");
    }

    @Then("^The results match the criteria$")
    public void theResultsMatchTheCriteria() {
        System.out.println("Hola");
    }
}
