package com.manuelamores.pages;

import org.openqa.selenium.WebDriver;

public class AmazonSearchPage extends BasePage
{

    private String searchBox= "//input[@id='twotabsearchtextbox']";
    private String searchButton="//input[@id='nav-search-submit-button']";
    private String thirdResult="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[6]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
    private String addToCartButton="//input[@id='add-to-cart-button']";
    private String addedMessageText = "//*[contains(text(),'Agregado al carrito')]";
    public AmazonSearchPage() {
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com/");
    }

    public void enterSearchCriteria(String criteria) {
        writeText(searchBox, criteria);
    }

    public void clickSearch() {
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber) {
        goToLinkText("2");
    }

    public void pick3rdItem() {
        clickElement(thirdResult);
    }

    public void addToCart() {
        clickElement(addToCartButton);
    }

    public String addedToCartMessage() {
        return textFromElemenmt(addedMessageText);
    }
}
