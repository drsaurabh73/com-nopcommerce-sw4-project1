package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginLink = By.xpath("//a[contains(text(),'Log in')]");
    By Welcomepage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    public String verifyWelcomeText() {
        return getTextFromElement(Welcomepage);
    }


}
