package tests;

import models.Card;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CardCreationTest extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        //By loginButtonLocator = By.id("loginButton");
        if (!app.getBoard().isAvatarPresent()) {
            app.getSession().login();
        }

    }
    @Test
    public void cardCreationTest(){

        app.getBoard().selectFirstBoard();
        app.getCard().addNewCard();
        app.getCard().fillForm(new Card().withName("red").withColor("red"));
//        //app.getCard().pressThreeDotMenu();
//        app.getCard().pressLables();
    }
}