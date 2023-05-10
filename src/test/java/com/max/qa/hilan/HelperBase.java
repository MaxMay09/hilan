package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    WebDriver wd;
    Actions actions;
    public boolean isElementPresent(By locator) {
        return ApplicationManager.wd.findElements(locator).size() > 0;

    }

    public void type(By locator, String text) {
        Click(locator);
        ApplicationManager.wd.findElement(locator).clear();//*[@id="login"]
        ApplicationManager.wd.findElement(locator).sendKeys(text);
    }

    public void waitForElement(By locator, int timeOut) {
        new WebDriverWait(ApplicationManager.wd, timeOut).
                until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void Click(By locator) {
        ApplicationManager.wd.findElement(locator).click();
    }
    public boolean waitForElementPresent(By locator) {
        return new WebDriverWait(ApplicationManager.wd, 20).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).size() > 0;

    }
    public boolean isAvatarPresentWait() {
        return waitForElementPresent(By.xpath("//h2[normalize-space()='Most popular templates']"));
    }
}
