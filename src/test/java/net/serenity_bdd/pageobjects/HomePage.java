package net.serenity_bdd.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2017/1/15.
 */
@DefaultUrl("http://www.etsy.com")
public class HomePage extends PageObject {

    @FindBy(xpath = ".//*[@id='search-bar']//button")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);
        searchButton.click();
    }
}
