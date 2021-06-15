package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchALaptopLocators {
    public static final Target MENU_SEARCH = Target.the("Menu search").located(By.id("menuSearch"));
    public static final Target SEARCH_INPUT = Target.the("Search input").located(By.id("autoComplete"));
}
