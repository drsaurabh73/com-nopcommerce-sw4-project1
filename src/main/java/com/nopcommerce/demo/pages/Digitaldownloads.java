package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Digitaldownloads extends Utility {
    By digitalDownloadsLink = By.linkText("Digital downloads");
    By actualMessage2 = By.xpath("//h1[contains(text(),'Digital downloads')]");

    public void clickOnDigitaldownloadTab() {
        clickOnElement(digitalDownloadsLink);
    }

    public String verifydigitaldownloads() {
        return getTextFromElement(actualMessage2);
    }
}