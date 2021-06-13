package com.advantageonlineshopping.automations.tasks;

import com.advantageonlineshopping.automations.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.advantageonlineshopping.automations.userinterfaces.BuyLaptopLocators.*;

public class Buy implements Task {

    Data data;

    public Buy(Data data) {
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
                Enter.theValue(data.getSafePayPassword()).into(SAFE_PAY_PASSWORD),
                Click.on(PAY_NOW)
        );
    }

    public static Buy aLaptop(Data data){
        return Tasks.instrumented(Buy.class, data);
    }
}
