package com.manuelamores.steps;

import com.manuelamores.pages.TestSandBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TestSandboxSteps {

    TestSandBox sandboxSteps = new TestSandBox();

    @Given("^I navigate to the sandbox page$")
    public void iNavigateToTheSandboxPage() {
        sandboxSteps.navigateToSandBox();
    }

    @And("^Select a value from the dropdown$")
    public void selectAValueFromTheDropdown() {
        sandboxSteps.selectCategory("Manual");
    }
}
