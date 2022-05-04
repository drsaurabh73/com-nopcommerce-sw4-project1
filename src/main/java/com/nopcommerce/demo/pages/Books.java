package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Books extends Utility {

    By booksLink = By.linkText("Books");
    By actualMessage4 = By.xpath("//h1[contains(text(),'Books')]");

    public void clickOnbooksTab() {
        clickOnElement(booksLink);
    }

    public String verifybooks() {
        return getTextFromElement(actualMessage4);
    }
}
