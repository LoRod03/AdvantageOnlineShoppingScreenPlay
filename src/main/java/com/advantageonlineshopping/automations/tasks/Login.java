package com.advantageonlineshopping.automations.tasks;

import com.advantageonlineshopping.automations.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.advantageonlineshopping.automations.userinterfaces.LoginLocators.*;

public class Login implements Task {

    Data data;

    public Login(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_USER),
                Enter.theValue(data.getUserName()).into(USERNAME),
                Enter.theValue(data.getPassword()).into(PASSWORD),
                Click.on(SIGN_IN_BUTTON)
        );
    }

    public static Login intoPage(Data data){
        return Tasks.instrumented(Login.class, data);
    }
}
