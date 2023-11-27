package com.manuelamores.pages;

import org.openqa.selenium.WebDriver;

public class TestSandBox extends BasePage{

    public TestSandBox() {
        super(driver);
    }

    public void navigateToSandBox() {
        navigateTo("https://www.google.com/");
    }

    public void selectCategory(String manual) {
    }
}
