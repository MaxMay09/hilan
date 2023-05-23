package tests;

import models.Board;
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
            app.getBoard().fillBoarCreation(new Board().setBoardName(boardName));
            app.getBoard().confirmBoardCreation();
            app.getBoard().waitForListButtonInTheBoard();
            String title = app.getTitle();
            Assert.assertEquals(title, "hhh");
        }


    }


}

