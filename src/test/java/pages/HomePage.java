package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchBox = By.id("twotabsearchtextbox");

    public void searchForItem (String searchItem) {
        driver.findElement(searchBox).sendKeys(searchItem);
    }
}
