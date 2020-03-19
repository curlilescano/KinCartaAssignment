package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchBox = By.id("twotabsearchtextbox");
    By submitButton = By.className("nav-input");

    public void searchForItem (String searchItem) {
        waitVisibility(searchBox);
        driver.findElement(searchBox).sendKeys(searchItem);
    }
    public void submitSearch () {
        driver.findElement(submitButton).click();
    }
}
