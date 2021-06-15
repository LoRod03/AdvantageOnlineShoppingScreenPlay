package com.advantageonlineshopping.automations.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_a_laptop.feature",
        glue = "com.advantageonlineshopping.automations.stepdefinitions",
        //tags = {"@successfulPurchase"},
        tags = {"@failedPurchase"},
        snippets = SnippetType.CAMELCASE
)
public class BuyALaptopRunner {
}
