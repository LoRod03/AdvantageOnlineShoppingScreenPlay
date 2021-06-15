package com.advantageonlineshopping.automations.stepdefinitions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.tasks.LookingFor;
import com.advantageonlineshopping.automations.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class FailedPurchaseStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisDriver;

    Actor fredy = Actor.named("Fredy");

    @Before
    public void setUp(){
        fredy.can(BrowseTheWeb.with(hisDriver));
        fredy.wasAbleTo(OpenTheBrowser.on());
    }

    @When("^I look for a computer that is not in stock$")
    public void iLookForAComputerThatIsNotInStock(List<Data> dataList) {
        fredy.attemptsTo(LookingFor.aNewLaptop(dataList.get(0)));
    }

    @Then("^it should show a text that describes that there is no result for the search$")
    public void itShouldShowATextThatDescribesThatThereIsNoResultForTheSearch() {

    }
}
