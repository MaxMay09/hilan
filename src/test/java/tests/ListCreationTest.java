package tests;

import models.List;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListCreationTest extends TestBase {
    @BeforeMethod
    public void preconditions() throws InterruptedException {
        //By loginButtonLocator = By.id("loginButton");
        if (!app.getBoard().isAvatarPresent()) {
            app.getSession().login();
        }
    }
    @Test
    public void listTestCreation() throws InterruptedException {
        app.getBoard().selectFirstBoard();
        app.getList().addNew();
        app.getList().typeName(new List().withName("autoTest"));
        app.getList().saveEdit();
        Thread.sleep(3000);

    }
}
