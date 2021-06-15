package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginLocators {
    public static final Target MENU_USER = Target.the("Menu user locator").located(By.id("menuUser"));
    public static final Target USERNAME = Target.the("Username input locator").locatedBy("//input[@name=\"username\"]");
    public static final Target PASSWORD = Target.the("Password input locator").locatedBy("//input[@name=\"password\"]");
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button locator").located(By.id("sign_in_btnundefined"));
}
