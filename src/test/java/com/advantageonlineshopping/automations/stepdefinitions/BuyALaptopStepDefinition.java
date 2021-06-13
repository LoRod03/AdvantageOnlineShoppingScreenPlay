package com.advantageonlineshopping.automations.stepdefinitions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BuyALaptopStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisDriver;

    Actor fredy = Actor.named("Fredy");

    @Before
    public void setUp(){
        fredy.can(BrowseTheWeb.with(hisDriver));
        fredy.wasAbleTo(OpenTheBrowser.on());
    }

    @Given("^that i logged in$")
    public void thatILoggedIn(List<Data> dataList) {
        fredy.attemptsTo(Login.intoPage(dataList.get(0)));
    }

    @When("^i buy a laptop$")
    public void iBuyALaptop(List<Data> dataList) {
        fredy.attemptsTo(Buy.aLaptop(dataList.get(0)));
    }

    @Then("^should show the order number$")
    public void shouldShowTheOrderNumber() {

    }
}
