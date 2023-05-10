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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Scroll {
    public static String browser = "Chrome";
    public static WebDriver wd;

    @BeforeMethod

    public void SetUp() throws InterruptedException {
        if(browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();
        }
        else if (browser.equals("Firefox")){
            WebDriverManager.chromedriver().setup();
            wd = new FirefoxDriver();
        }
        else if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            wd = new EdgeDriver();
        }
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.get("(https://www.google.com/)");
        Thread.sleep(5000);

    }
    @Test
    public void Loginto() throws InterruptedException {
        Set<Cookie> cookies = wd.manage().getCookies();
        wd.manage().deleteAllCookies();
        cookies = wd.manage().getCookies();
        if(cookies.size()==0){
            System.out.println("All cookies has been deleted");
        }
        else {
            System.out.println("Cookies stil exist");
        }
        WebElement sc =wd.findElement(By.xpath("//span[@title='Disappointed']"));
        Actions action = new Actions(wd);
        action.moveToElement(sc);
        action.perform();
        Thread.sleep(5000);


    }


    @AfterMethod
    public void TearDown(){
        wd.quit();
    }
    public void Click(By locator){
        wd.findElement(locator).click();
    }


}
