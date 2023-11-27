package com.manuelamores.steps;

import com.manuelamores.pages.GridPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GridTestSteps {

    GridPage gridPage = new GridPage();

    @Given("^I navigate to the static table$")
    public void iNavigateToTheStaticTable() {
        gridPage.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void iCanReturnTheValueIWanted() {
        final String value = gridPage.getValueFromGrid(1,1);
        Assert.assertEquals("r: 0, c: 0", value);
    }
}
