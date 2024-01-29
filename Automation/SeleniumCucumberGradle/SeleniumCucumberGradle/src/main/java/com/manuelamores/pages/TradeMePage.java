package com.manuelamores.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TradeMePage extends BasePage{

    private final String selectElement = "//*[@id='tg-6100']";
    //private final List<WebElement> = bringMeAllElements("hola");
    public TradeMePage() {
        super(driver);
    }

    public void navigateToTradeMePage() {
        navigateTo("https://www.trademe.co.nz/a/motors");
    }


}
