package net.serenity_bdd.samples.etsy.features.steps.serenity;

import net.serenity_bdd.pageobjects.HomePage;
import net.serenity_bdd.pageobjects.SearchResultsPage;
import net.thucydides.core.annotations.Step;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Administrator on 2017/1/15.
 */
public class BuyerSteps {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Step
    public void opens_etsy_home_page() {
        homePage.open();
    }

    @Step
    public void searches_for_items_containing(String keywords) {
        homePage.searchFor(keywords);
    }

    @Step
    public void should_see_items_related_to(String keywords) {
        List<String> resultTitles;
        resultTitles = searchResultsPage.getResultTitles();
        resultTitles.stream().forEach(title -> assertThat(title.contains(keywords)));
    }
}
