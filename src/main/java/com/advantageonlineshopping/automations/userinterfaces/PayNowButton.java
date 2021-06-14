package com.advantageonlineshopping.automations.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PayNowButton {
    public static final Target PAY_NOW = Target.the("Pay now button locator").located(By.id("pay_now_btn_SAFEPAY"));
}
