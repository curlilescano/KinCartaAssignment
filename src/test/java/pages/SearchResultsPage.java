package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    By secondPage = By.xpath("//li[@class='a-normal']//a[contains(text(),'2')]");

    public void goTo2Page () {
        waitVisibility(secondPage);
        driver.findElement(secondPage).click();
    }
}
