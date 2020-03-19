package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    By secondPage = By.xpath("//li[@class='a-normal']//a[contains(text(),'2')]");
    By thirdItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]");

    public void goTo2Page () {
        waitVisibility(secondPage);
        driver.findElement(secondPage).click();
    }

    public void clickOnThirdItem () {
        waitVisibility(thirdItem);
        driver.findElement(thirdItem).click();
    }
}
