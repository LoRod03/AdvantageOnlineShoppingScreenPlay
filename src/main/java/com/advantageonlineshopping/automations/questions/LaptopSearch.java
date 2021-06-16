package com.advantageonlineshopping.automations.questions;

import com.advantageonlineshopping.automations.models.Data;
import com.advantageonlineshopping.automations.userinterfaces.SearchResultLocator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaptopSearch implements Question {

    private final String NO_SEARCH_RESULT = "No results for";

    @Override
    public Object answeredBy(Actor actor) {

        if(Text.of(SearchResultLocator.SEARCH_RESULT).viewedBy(actor).asString().contains(NO_SEARCH_RESULT)){
            return true;
        }
        else {
            return false;
        }
    }

    public static LaptopSearch result(){
        return new LaptopSearch();
    }
}
