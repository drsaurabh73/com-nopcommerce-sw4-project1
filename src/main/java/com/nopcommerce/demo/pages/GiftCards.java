package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCards extends Utility {
    By giftcardsLink = By.linkText("Gift Cards");
    By actualMessage6 = By.xpath("//h1[contains(text(),'Gift Cards')]");

    public void clickOnGiftCardsTab() {
        clickOnElement(giftcardsLink);
    }

    public String verifyGiftCard() {
        return getTextFromElement(actualMessage6);
    }
}