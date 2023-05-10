package com.max.qa.hilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public static String browser = "Chrome";
    public static WebDriver wd;
    public static Actions actions;
    BoardHelper board;
    SessionHelper session;



    public void init() {
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.get("https://trello.com/home");
        board = new BoardHelper(wd);
        session = new SessionHelper(wd);
        actions = new Actions(wd);


    }

    public void stop() {
        wd.quit();
    }

    public void cleanCokea() {
        Set<Cookie> cookies = wd.manage().getCookies();
        wd.manage().deleteAllCookies();
        cookies = wd.manage().getCookies();
        if (cookies.size() == 0) {
            System.out.println("All cookies has been deleted");
        } else {
            System.out.println("Cookies stil exist");
        }
    }

    public void selectBrowser() {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();
        } else if (browser.equals("Firefox")) {
            WebDriverManager.chromedriver().setup();
            wd = new FirefoxDriver();
        } else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            wd = new EdgeDriver();
        }


    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public String getTitle() {
        return   wd.findElement(By.xpath("//h1[normalize-space()='hhh']")).getText();
    }
    public String getTitle2() {
        return   wd.findElement(By.xpath("//h3[normalize-space()='YOUR WORKSPACES']")).getText();
    }
    public BoardHelper getBoard() {
        return board;
    }

    public SessionHelper getSession() {
        return session;
    }
}


