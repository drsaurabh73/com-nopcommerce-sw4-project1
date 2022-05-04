package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenu extends TestBase {
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
    Books books = new Books();
    Apparel apparel = new Apparel();
    Digitaldownloads digitaldownloads = new Digitaldownloads();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();
@Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        computers.clickOnComputerTab();
        computers.verifyComputer();
    String expectedMessage = "Computers";
    String actualMessage = computers.verifyComputer();

    Assert.assertEquals(actualMessage,expectedMessage,"");

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
    electronics.clickOnelectronicsTab();
    electronics.verifyElectronics();
        String expectedMessage = "Electronics";
        String actualMessage = electronics.verifyElectronics();

        Assert.assertEquals(actualMessage,expectedMessage,"");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
    apparel.clickOnApparelTab();
    apparel.verifyApparel();
        String expectedMessage = "Apparel";
        String actualMessage = apparel.verifyApparel();

        Assert.assertEquals(actualMessage,expectedMessage,"");

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
    digitaldownloads.clickOnDigitaldownloadTab();
    digitaldownloads.verifydigitaldownloads();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitaldownloads.verifydigitaldownloads();

        Assert.assertEquals(actualMessage,expectedMessage,"");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
    books.clickOnbooksTab();
    books.verifybooks();
        String expectedMessage = "Books";
        String actualMessage = books.verifybooks();

        Assert.assertEquals(actualMessage,expectedMessage,"");


    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
    jewelry.clickOnJewelryTab();
    jewelry.verifyJewelry();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelry.verifyJewelry();

        Assert.assertEquals(actualMessage,expectedMessage,"");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
    giftCards.clickOnGiftCardsTab();
    giftCards.verifyGiftCard();
        String expectedMessage = "Gift Cards";
        String actualMessage = giftCards.verifyGiftCard();

        Assert.assertEquals(actualMessage,expectedMessage,"");

    }


}
