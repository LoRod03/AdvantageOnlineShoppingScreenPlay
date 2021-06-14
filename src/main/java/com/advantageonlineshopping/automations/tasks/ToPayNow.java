package com.advantageonlineshopping.automations.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.advantageonlineshopping.automations.userinterfaces.PayNowButton.PAY_NOW;

public class ToPayNow implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PAY_NOW));
    }

    public static ToPayNow theLaptop() {
        return Tasks.instrumented(ToPayNow.class);
    }
}
