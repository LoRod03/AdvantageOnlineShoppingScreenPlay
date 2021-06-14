package com.advantageonlineshopping.automations.questions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.userinterfaces.LaptopReference;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validating implements Question {

    Data data;

    public Validating(Data data) {
        this.data = data;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if(Text.of(LaptopReference.LAPTOP_REFERENCE).viewedBy(actor).asString().equals(data.getValidateText())){
            return true;
        }
        else {
            return false;
        }
    }

    public static Validating laptopReference (Data data){
        return new Validating(data);
    }
}

