package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

            int before = app.getBoard().numberBoarCount();
            System.out.println(app.getBoard().numberBoarCount());
                app.getBoard().selectFirstBoard();
                app.getBoard().Click(By.xpath("//button[@aria-label='Show menu']//span[@class='css-snhnyn']"));
                app.getBoard().Click(By.xpath("//span[@class='icon-sm icon-overflow-menu-horizontal board-menu-navigation-item-link-icon']"));
                Thread.sleep(6000);
                app.getBoard().Click(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div/div[2]/div/ul[3]/li/a"));
                app.getBoard().Click(By.xpath("//input[@value='Close']"));
                app.getBoard().Click(By.xpath("//p[@class='nNvJhnERHVQb9o']"));
                Thread.sleep(3000);
                app.getBoard().numberBoarCount();
                //int after = app.getBoard().numberBoarCount();
               // System.out.println(after);


    }
    }



