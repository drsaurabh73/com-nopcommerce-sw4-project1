package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerLink = By.linkText("Register");
    By radioButton = By.id("gender-male");
    By actualMessage = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.id("FirstName");
    By lastNameLink = By.name("LastName");
    By dateofBirth = By.xpath("//select[@name='DateOfBirthDay']/option[29]");
    By monthofBirth = By.xpath("//select[@name='DateOfBirthMonth']/option[11]");
    By yearofBirth = By.xpath("//select[@name='DateOfBirthYear']/option[89]");
    By emailaddress = By.name("Email");
    By passwordlink = By.name("Password");
    By reconfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By actualMessage1 = By.xpath("//div[contains(text(),'Your registration completed')]");

    public void clickonRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickonRadioButton() {
        clickOnElement(radioButton);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameLink, lastname);
    }

    public void selectDateOfBirth() {
        clickOnElement(dateofBirth);
    }

    public void selectMonthofBirth() {
        clickOnElement(monthofBirth);
    }

    public void selectYearofBirth() {
        clickOnElement(yearofBirth);
    }

    public void enterEmailaddress(String email) {
        sendTextToElement(emailaddress, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordlink, password);
    }

    public void setReconfirmPassword(String reconfirm) {
        sendTextToElement(reconfirmPassword, reconfirm);
    }
    public void clickOnregistrationButton() {
        clickOnElement(registerButton);
    }
    public String verifyRegisterText(){
        return getTextFromElement(actualMessage);
    }
    public String verifyTextRegistrationCompete() {
        return getTextFromElement(actualMessage1);
    }

}
