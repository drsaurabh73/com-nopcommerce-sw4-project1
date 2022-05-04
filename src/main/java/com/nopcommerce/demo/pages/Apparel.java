package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Apparel extends Utility {

    By Apparel = By.linkText("Apparel");
    By actualMessage3 = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");

    public void clickOnApparelTab() {
        clickOnElement(Apparel);
    }
    public String verifyApparel() {
        return getTextFromElement(actualMessage3);
    }
}
