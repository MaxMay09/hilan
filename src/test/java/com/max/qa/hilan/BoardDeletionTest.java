package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class BoardDeletionTest extends TestBase {

    @BeforeMethod
    public void preconditions() throws InterruptedException {
        //By loginButtonLocator = By.id("loginButton");
        if (!app.getBoard().isAvatarPresent()) {
            app.getSession().login();
        }
    }

    @Test

    public void testBoardDeletion() throws InterruptedException {


        int boardNumber = app.getBoard().numberBoarCount();

            app.getBoard().selectFirstBoard();
            app.getBoard().openMenu();
            app.getBoard().deleteBoard();
            Thread.sleep(6000);
            //app.getBoard().waitForElementPresent(By.xpath(""))
            String title2 = app.getTitle2();
            Assert.assertEquals(title2, "YOUR WORKSPACES");



    }

    //    public void returnOnHomePage() {
//        Click(By.xpath("//button[normalize-space()='Delete']"));
//    }

}
