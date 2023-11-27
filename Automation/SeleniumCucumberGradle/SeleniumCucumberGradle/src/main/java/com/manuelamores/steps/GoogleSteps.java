package com.manuelamores.steps;

import com.manuelamores.pages.GooglePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    @Given("^I am on the google search page$")
    public void iAmOnTheGoogleSearchPage() {
        google.navigateToGoogle();
    }

    @When("^I enter a search criteria$")
    public void iEnterASearchCriteria() {
        google.enterSearchCriteria("Argentina");
    }

    @And("^Click on the search button$")
    public void clickOnTheSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("^The results match the criteria$")
    public void theResultsMatchTheCriteria() {
       Assert.assertEquals("Texto",google.firstResult("Valor"));
    }
}
