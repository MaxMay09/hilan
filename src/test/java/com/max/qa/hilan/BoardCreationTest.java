package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest  extends TestBase{
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        //By loginButtonLocator = By.id("loginButton");
        if (!app.getBoard().isAvatarPresent()) {
            app.getSession().login();
        }
    }
    @Test
        public void boarCreationTest() throws InterruptedException {
        int boardNumber = app.getBoard().numberBoarCount();
       if (boardNumber < 10) {
            String boardName = "hhh";
            app.getBoard().clickOnPlusButton();
            app.getBoard().selectCreateNewBoard();
            app.getBoard().fillBoarCreation(boardName);
            app.getBoard().confirmBoardCreation();
            app.getBoard().waitForListButtonInTheBoard();
            String title = app.getTitle();
            Assert.assertEquals(title, "hhh");
        }


    }


}

