package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;

public class BoardHelper extends HelperBase{


    public BoardHelper(WebDriver wd) {
        super();
    }

    public boolean isAvatarPresent() {
        return isElementPresent(By.xpath("//button[@aria-label='Create board or Workspace']"));
    }

    public int numberBoarCount() {
        return ApplicationManager.wd.findElements(By.xpath("//div[@class='boards-page-board-section-header']//a[1]/../../../..//li")).size() - 1;
    }

    public void fillBoarCreation(String boardName) {
        type(By.xpath(" //input[@type='text']"), boardName);
    }

    public void selectCreateNewBoard() {
        Click(By.xpath("//p[contains(text(),'A board is made up of cards ordered on lists. Use ')]"));
    }

    public void clickOnPlusButton() {
        Click(By.xpath("//button[@aria-label='Create board or Workspace']"));
    }

    public void confirmBoardCreation() {
        Click(By.xpath("//button[contains(text(),'Create')]"));
    }

    public void waitForListButtonInTheBoard() {
        waitForElement(By.cssSelector(".open-add-list"), 15);
    }


    public boolean waitForelementPresentByTryCatch(By locator, int timeOut) {
        try {
            waitForElement(locator, timeOut);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectFirstBoard() {
        //wd.findElements(By.xpath(""))
        Click(By.xpath("//div[@class='board-tile-details is-badged']"));
    }

    public void openMenu() {
        // WebElement field = wd.findElement(By.xpath("//div[@class='jv7QDCKI8FPToj']//li"));
        List<WebElement> list = ApplicationManager.wd.findElements(By.xpath("//div[@class='jv7QDCKI8FPToj']//li"));
        ApplicationManager.actions.moveToElement(list.get(0));
        ApplicationManager.actions.perform();
        Click(By.xpath("//button[@aria-label='Board actions menu']//span[@class='css-snhnyn']"));

    }

    public void deleteBoard() throws InterruptedException {
        Click(By.xpath("//button[@title='Close board']"));
        Click(By.xpath("//button[normalize-space()='Close']"));
        //Thread.sleep(2000);
        waitForElement(By.xpath("//button[normalize-space()='Permanently delete board']"), 20);
        Click(By.xpath("//button[normalize-space()='Permanently delete board']"));
        Click(By.xpath("//button[normalize-space()='Delete']"));

    }


}
