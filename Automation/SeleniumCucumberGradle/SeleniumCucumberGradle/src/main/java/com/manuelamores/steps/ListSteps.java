package com.manuelamores.steps;

import com.manuelamores.pages.ListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("I navigate to the list page")
    public void iNavigateToTheListPage() {
        listPage.navigateToListPage();
    }


    @When("I search the list")
    public void iSearchTheList() throws InterruptedException {
        listPage.enterSerarchCriteria();
    }

    @Then("I can find the text in the list")
    public void iCanFindTheTextInTheList() {
        List<String> list = listPage.getAllSearchResults();
        boolean textIsThere = list.contains("Seattle, Washington");

        if(textIsThere){
            System.out.println("Text is on the list: PASSED!!!");
        }else{
            throw new Error("Text is not on the list: FAILED!!!");
        }
    }
}
