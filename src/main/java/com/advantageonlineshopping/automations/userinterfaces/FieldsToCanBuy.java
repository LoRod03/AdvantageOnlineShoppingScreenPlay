package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FieldsToCanBuy {
    public static final Target LAPTOP_CATALOG = Target.the("Laptop catalog locator").located(By.id("laptopsImg"));
    public static final Target SELECT_LAPTOP = Target.the("selecting the laptop that i want to buy").located(By.id("10"));
    public static final Target ADD_TO_CART = Target.the("Add to cart button locator").locatedBy("//button[@name=\"save_to_cart\"]");
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button locator").located(By.id("checkOutPopUp"));
    public static final Target NEXT_BUTTON = Target.the("Next button locator").located(By.id("next_btn"));
    public static final Target SAFE_PAY_USERNAME = Target.the("Safe pay username locator").locatedBy("//input[@name=\"safepay_username\"]");
    public static final Target SAFE_PAY_PASSWORD = Target.the("Safe pay password locator").locatedBy("//input[@name=\"safepay_password\"]");
}
