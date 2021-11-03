package com.uitesting.config;

import com.uitesting.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public BasePage basePage(WebDriver driver){
        return new BasePage(driver);
    }
}
