package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {

    By electronicsLink = By.linkText("Electronics");
    By actualMessage2 = By.xpath("//h1[contains(text(),'Electronics')]");

    public void clickOnelectronicsTab(){
        clickOnElement(electronicsLink);
    }

    public String verifyElectronics() {
        return getTextFromElement(actualMessage2);
    }
}
