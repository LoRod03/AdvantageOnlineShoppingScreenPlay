package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopReference {
    public static final Target LAPTOP_REFERENCE = Target.the("Order payment success").locatedBy("(//tr[@id=\"product\"])[2]/td/a/h3");
}
