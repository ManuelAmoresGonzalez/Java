package com.manuelamores.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListPage extends BasePage{

    private final String searchField = "//body/form[1]/input[1]";
    private final String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    public void navigateToListPage(){
        navigateTo("https://andreidbr.github.io/JS30/O6AjaxTypeAhead/index.html");
    }

    public void enterSerarchCriteria(String state) throws InterruptedException {
        try {
            Thread.sleep(600);
            writeText(searchField, state);
        }catch (NoSuchElementException e){
            System.out.println("The webelement search field couldn´t be found.");
            e.printStackTrace();
        }
    }

    public List<String> getAllSearchResults(){
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList =new ArrayList<>();
        list.forEach(element ->
                stringFromList.add(element.getText())
        );
        return stringFromList;
    }

}
