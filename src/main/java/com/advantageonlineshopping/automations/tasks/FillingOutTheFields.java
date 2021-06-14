package com.advantageonlineshopping.automations.tasks;

import com.advantageonlineshopping.automations.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.advantageonlineshopping.automations.userinterfaces.FieldsToCanBuy.*;

public class FillingOutTheFields implements Task {

    Data data;

    public FillingOutTheFields(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LAPTOP_CATALOG),
                Click.on(SELECT_LAPTOP),
                Click.on(ADD_TO_CART),
                Click.on(CHECKOUT_BUTTON),
                Click.on(NEXT_BUTTON),
                Enter.theValue(data.getSafePayUserName()).into(SAFE_PAY_USERNAME),
                Enter.theValue(data.getSafePayPassword()).into(SAFE_PAY_PASSWORD)
        );
    }

    public static FillingOutTheFields toCanBuy(Data data) {
        return Tasks.instrumented(FillingOutTheFields.class, data);
    }
}
