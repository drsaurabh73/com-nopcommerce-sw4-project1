package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeLoginPage extends Utility {

    By LoginLink = By.xpath("");
    By username = By.id("Email");
    By passwordLink = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By actualMessage = By.xpath("//a[contains(text(),'Log out')]");
    By actualErrorMessage = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");

    public void clickOnLoginLink() {
        clickOnElement(LoginLink);
    }

    public void enterUserName(String email) {
        sendTextToElement(username, email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordLink, password);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyLogoutText(){
        return getTextFromElement(actualMessage);
    }

public String setActualErrorMessage(){
        return getTextFromElement(actualErrorMessage);
}
}
