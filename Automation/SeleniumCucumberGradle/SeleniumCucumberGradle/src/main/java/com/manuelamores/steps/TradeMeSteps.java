package com.manuelamores.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;

public class TradeMeSteps {

    private ValidatableResponse json;
    private static RequestSpecification request;
    private Response response;
    @Given("I navigate to the TradeMe Motor page")
    public void iNavigateToTheTradeMeMotorPage() {
    }

    @When("I select the car make (.+)")
    public void iSelectTheCarMakeMake() {
    }

    @Then("I can see it has (.+) records in the results")
    public void iCanSeeItHasAmountRecordsInTheResults() {
    }

    @Then("I can verify that the number of car makes is (\\d+)")
    public void iCanVerifyThatTheNumberOfCarMakesIs(int arg0) {
    }

    @Given("I send the request to the endpoint")
    public void iSendTheRequestToTheEndpoint() {
    }

    @Then("I can see there are {int} car makes")
    public void iCanSeeThereAreCarMakes(int arg0) {
    }
}
