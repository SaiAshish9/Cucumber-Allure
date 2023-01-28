package com.cucumber.Cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"classpath:features"},
        glue = {"com.cucumber.Cucumber.steps"},
        plugin = {"pretty", "cucumberHooks.customReportListener",
                "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
        tags = "@SmokeTest"
)
public class Runner {
}
