package tests;

import framework.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class AlexaTest extends BaseTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @BeforeClass
    public void setUpTest () {
        homePage = new HomePage(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
    }

    @Test
    public void addingItemToCart () {
        goToHomePage();
        homePage.searchForItem("Alexa");
        homePage.submitSearch();
        searchResultsPage.goTo2Page();
        searchResultsPage.clickOnThirdItem();

    }
}
