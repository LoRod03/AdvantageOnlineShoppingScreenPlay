package com.advantageonlineshopping.automations.tasks;

import com.advantageonlineshopping.automations.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.advantageonlineshopping.automations.userinterfaces.SearchALaptopLocators.*;

public class LookingFor implements Task {

    Data data;

    public LookingFor(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_SEARCH),
                Enter.theValue(data.getLaptopReference()).into(SEARCH_INPUT),
                Click.on(MENU_SEARCH)
        );
    }

    public static LookingFor aNewLaptop(Data data) {
        return Tasks.instrumented(LookingFor.class, data);
    }
}
