package net.serenity_bdd.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/1/15.
 */
public class SearchResultsPage extends PageObject {

    @FindBy(xpath=".//div[contains(@class,'listing-card')]")
    List<WebElement> listingCards;

    public List<String> getResultTitles() {
        return listingCards.stream()
                .map(element -> element.isDisplayed()?element.getText():"")
                .collect(Collectors.toList());
    }
}
