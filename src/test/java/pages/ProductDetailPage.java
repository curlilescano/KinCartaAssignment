package pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButton = By.id("add-to-cart-button");

    public boolean addItemToCartButtonIsDisplayed () {
        waitVisibility(addToCartButton);
        return driver.findElement(addToCartButton).isDisplayed();
    }

}
