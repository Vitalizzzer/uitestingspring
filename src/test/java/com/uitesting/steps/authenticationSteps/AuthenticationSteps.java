package com.uitesting.steps.authenticationSteps;

import com.uitesting.businesslogic.*;
import com.uitesting.data.ConfigurationData;
import com.uitesting.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Assert;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {
        CommonLogic.class,
        ConfigurationData.class
})
@Slf4j
public class AuthenticationSteps {

    private final CommonLogic commonLogic;
    private final ConfigurationData configurationData;

    private HomePage homePage;
    private CategoryPage categoryPage;
    private SubcategoryPage subcategoryPage;
    private CartPage cartPage;
    private WebDriver driver;

    @Autowired
    public AuthenticationSteps(CommonLogic commonLogic, ConfigurationData configurationData) {
        this.commonLogic = commonLogic;
        this.configurationData = configurationData;
    }

    @After
    public void tearDown() {
        commonLogic.tearDown(driver);
    }

    @Given("{} browser")
    public void browser(String browser) {
        log.info("CONFIG DATA: {}", configurationData.getBrowser());
        driver = commonLogic.getDriver(browser);
    }

    @When("open site {}")
    public void open_site(String link) {
        BasePage basePage = new BasePage(driver);
        homePage = basePage.openApp(link);
    }

    @When("click category")
    public void click_category() {
        categoryPage = homePage.clickCategory(10);
    }

    @When("click subcategory")
    public void click_subcategory() {
        subcategoryPage = categoryPage.clickSubcategory(10);
    }


    @When("add an item to the cart")
    public void add_an_item_to_the_cart() {
        subcategoryPage = subcategoryPage.clickAddToCart(5);
       // authenticatedPage = signInPage.signIn(username, password, 10);
    }

    @When("open cart")
    public void open_cart() {
        cartPage = subcategoryPage.clickCart(5);
        // authenticatedPage = signInPage.signIn(username, password, 10);
    }

    @Then("item is present in the cart")
    public void item_is_present_in_the_cart() {

    }

}
