package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

//    By secondPage = By.xpath("//li[@class='a-normal']//a[contains(text(),'2')]");
//    By thirdItem = By.xpath("//div[contains(@class,'s-result-list')]/div[3]//h2/a[contains(@class,'a-link-normal')]");

    public void goToPage (String value) {
        By page = By.xpath("//li[@class='a-normal']//a[contains(text(),'" + value + "')]");
        waitVisibility(page);
        driver.findElement(page).click();
    }

    public void clickOnItem (String index) {
        By itemIndex = By.xpath("//div[contains(@class,'s-result-list')]/div[" + index + "]//h2/a[contains(@class,'a-link-normal')]");
        waitVisibility(itemIndex);
        driver.findElement(itemIndex).click();
    }
}
