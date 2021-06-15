package com.advantageonlineshopping.automations.questions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.userinterfaces.SearchResultLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaptopSearch implements Question {

    Data data;

    public LaptopSearch(Data data) {
        this.data = data;
    }

    @Override
    public Object answeredBy(Actor actor) {

        if(Text.of(SearchResultLocator.SEARCH_RESULT).viewedBy(actor).asString().contains(data.getValidateSearch())){
            return true;
        }
        else {
            return false;
        }
    }

    public static LaptopSearch result(Data data){
        return new LaptopSearch(data);
    }
}
