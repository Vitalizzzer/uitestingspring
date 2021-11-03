package com.uitesting.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report/cucumber-html-report.html",
                "json:target/cucumber-report/cucumber-report.json"
        },
        features = {"classpath:features/Authentication.feature"},
        glue = {
                "com/uitesting/steps/authenticationSteps"
        }
         // ,tags = {"@UAT and @Authentication"}
)
public class AuthenticationRunner {
}


