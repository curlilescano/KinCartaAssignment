package tests;

import framework.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class AlexaTest extends BaseTest {

    HomePage homePage;

    @BeforeClass
    public void setUpTest () {
        homePage = new HomePage(getDriver());
    }

    @Test
    public void addingItemToCart () {
        goToHomePage();
        homePage.searchForItem("Alexa");
        homePage.submitSearch();

    }
}
