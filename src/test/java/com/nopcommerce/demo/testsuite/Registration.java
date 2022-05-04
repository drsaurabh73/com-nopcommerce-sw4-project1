package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends TestBase {
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickonRegisterLink();

        String expectedresult = "Register";
        String actualMessage2 =  registerPage.verifyRegisterText();
        Assert.assertEquals(actualMessage2,expectedresult,"");



    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickonRegisterLink();
        registerPage.clickonRadioButton();
        registerPage.enterFirstName("Saurabh");
        registerPage.enterLastName("Patel");
        registerPage.selectDateOfBirth();
        registerPage.selectMonthofBirth();
        registerPage.selectYearofBirth();
        registerPage.enterEmailaddress("sathipatil@gmail.com");
        registerPage.enterPassword("@12465");
        registerPage.setReconfirmPassword("@12465");
        registerPage.clickOnregistrationButton();


        String expectedresult= "Your registration completed";
        String actualMessage3 = registerPage.verifyTextRegistrationCompete();
        Assert.assertEquals(actualMessage3,expectedresult,"");

    }

}
