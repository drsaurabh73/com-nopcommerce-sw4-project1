package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {

    By computerLink = By.linkText("Computers");
    By actualMessage1 = By.xpath("//h1[contains(text(),'Computers')]");

    public void clickOnComputerTab(){
        clickOnElement(computerLink);
    }
    public String verifyComputer() {
        return getTextFromElement(actualMessage1);
    }
}
