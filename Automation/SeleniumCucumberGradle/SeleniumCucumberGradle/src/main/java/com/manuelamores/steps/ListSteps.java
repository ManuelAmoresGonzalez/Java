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


    @When("I search (.+) in the list")
    public void iSearchTheList(String state) throws InterruptedException {
        listPage.enterSerarchCriteria(state);
    }

    @Then("I can find (.+) in the list")
    public void iCanFindTheTextInTheList(String city) {
        List<String> list = listPage.getAllSearchResults();
        boolean textIsThere = list.contains(city);

        if(textIsThere){
            System.out.println("Text is on the list: PASSED!!!");
        }else{
            throw new Error("Text is not on the list: FAILED!!!");
        }
    }
}
