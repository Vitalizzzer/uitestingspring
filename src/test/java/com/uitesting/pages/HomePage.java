package com.uitesting.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //@FindBy(linkText = "/html/body/app-root/div/div/rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu/div/ul/li[1]/a")
    @FindBy(xpath = "//a[@href=\"https://rozetka.com.ua/computers-notebooks/c80253/\"]")
    WebElement laptopsAndComputersCategory;


    public CategoryPage clickCategory(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);

        wait.until(ExpectedConditions.visibilityOf(laptopsAndComputersCategory));
        laptopsAndComputersCategory.click();
        return new CategoryPage(driver);
    }
}
