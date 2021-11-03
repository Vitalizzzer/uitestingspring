package com.uitesting.businesslogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

@Component
public class CommonLogic {

    public WebDriver getDriver(String browser){
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-extensions");
                //chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--start-maximized");
               // chromeOptions.addArguments("--start-fullscreen");
               // chromeOptions.addArguments("--disable-web-security");
               // chromeOptions.addArguments("--allow-running-insecure-content");
               // chromeOptions.addArguments("--no-sandbox");
               // chromeOptions.addArguments("--disable-gpu");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(chromeOptions);
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
        return null;
    }

    public void tearDown(WebDriver driver){
        if(driver != null){
            driver.quit();
        }
    }

}
