package com.uitesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubcategoryPage {

    private final WebDriver driver;

    public SubcategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button")
    WebElement btnFirstItemAddToCart;

   @FindBy(linkText = "#icon-header-basket")
   WebElement btnCart;

    public CartPage clickCart(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        wait.until(ExpectedConditions.elementToBeClickable(btnCart));
        btnCart.click();
        return new CartPage(driver);
    }

    public SubcategoryPage clickAddToCart(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        wait.until(ExpectedConditions.elementToBeClickable(btnFirstItemAddToCart));
        btnFirstItemAddToCart.click();
        return this;
    }
}
