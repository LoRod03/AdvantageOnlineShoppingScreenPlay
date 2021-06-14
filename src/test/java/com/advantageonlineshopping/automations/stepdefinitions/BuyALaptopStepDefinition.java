package com.advantageonlineshopping.automations.stepdefinitions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.questions.Validating;
import com.advantageonlineshopping.automations.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
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

    @When("^i validate the laptop reference$")
    public void iValidateTheLaptopReference(List<Data> dataList) {
        fredy.attemptsTo(FillingOutTheFields.toCanBuy(dataList.get(0)));
        fredy.should(GivenWhenThen.seeThat(Validating.laptopReference(dataList.get(0))));
    }

    @Then("^i can buy the laptop$")
    public void iCanBuyTheLaptop() {
        fredy.attemptsTo(ToPayNow.theLaptop());
    }
}
