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
       /* plugin = {"pretty", "html:target/cucumber-reports.html",
        "json:target/cucumber-reports",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},*/
        monochrome = true,
        tags = "@Amazon"
)

public class runner {

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
