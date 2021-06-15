package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchResultLocator {
    public static final Target SEARCH_RESULT = Target.the("Search result").locatedBy("//span[contains(., \"No results for\")]");
}
