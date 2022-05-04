package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Jewelry extends Utility {
    By JewelryLink = By.linkText("Jewelry");
    By actualMessage5 = By.xpath("//h1[contains(text(),'Jewelry')]");

    public void clickOnJewelryTab() {
        clickOnElement(JewelryLink);
    }

    public String verifyJewelry() {
        return getTextFromElement(actualMessage5);
    }
}
