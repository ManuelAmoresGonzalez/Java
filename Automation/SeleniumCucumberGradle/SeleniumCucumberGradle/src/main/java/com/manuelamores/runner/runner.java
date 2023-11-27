package com.manuelamores.runner;

import com.manuelamores.pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "com/manuelamores/steps",
        tags = "@Test"
)

public class runner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
