package com.uitesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public HomePage openApp(String link) {
        driver.get(link);
        return new HomePage(driver);
    }
}
