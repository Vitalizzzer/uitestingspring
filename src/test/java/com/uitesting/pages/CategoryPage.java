package com.uitesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CategoryPage extends BasePage{

    private final WebDriver driver;

    public CategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(linkText = "https://rozetka.com.ua/notebooks/c80004/")
    WebElement laptopSubcategory;

    public SubcategoryPage clickSubcategory(long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(laptopSubcategory));
        return new SubcategoryPage(driver);
    }
}
