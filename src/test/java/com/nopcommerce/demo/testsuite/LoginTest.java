package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.WelcomeLoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();
    WelcomeLoginPage welcomeLoginPage = new WelcomeLoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.verifyWelcomeText();

        Assert.assertEquals(actualMessage,expectedMessage,"");

    }
@Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.clickOnLoginLink();
        welcomeLoginPage.enterUserName("pappu@gmail.com");
        welcomeLoginPage.enterPassword("password");
        welcomeLoginPage.clickOnLoginButton();

        String actualMessage2 = welcomeLoginPage.verifyLogoutText();
        String expectedMessage2 = "Log out";
        Assert.assertEquals(actualMessage2,expectedMessage2,"");
}

@Test
    public void verifyTheErrorMessage(){
        loginPage.clickOnLoginLink();
        welcomeLoginPage.enterUserName("prime12@gmail.com");
        welcomeLoginPage.enterPassword("123789");
        welcomeLoginPage.clickOnLoginButton();

        String actualMessage3 = welcomeLoginPage.setActualErrorMessage();
        String expectedMessage3 = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMessage3,expectedMessage3,"");
}


}
