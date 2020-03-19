package tests;

import config.PropertiesFile;
import framework.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.SearchResultsPage;

public class AlexaTest extends BaseTest {

    HomePage homePage;
    SearchResultsPage searchResultsPage;
    ProductDetailPage productDetailPage;

    @BeforeClass
    public void setUpTest () {
        homePage = new HomePage(getDriver());
        searchResultsPage = new SearchResultsPage(getDriver());
        productDetailPage = new ProductDetailPage(getDriver());
    }

    @Test
    public void addingItemToCart () {
        goToHomePage();
        homePage.searchForItem("Alexa");
        homePage.submitSearch();
        searchResultsPage.goTo2Page();
        searchResultsPage.clickOnThirdItem();
        Assert.assertTrue(productDetailPage.addItemToCartButtonIsDisplayed());

    }
}
