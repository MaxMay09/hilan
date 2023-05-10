package com.max.qa.hilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    public static String browser = "Edge";
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
        wd.get("https://the-internet.herokuapp.com/checkboxes");
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

        WebElement checkboxes = wd.findElement(By.xpath("//input[1]"));
        checkboxes.click();
        Thread.sleep(2000);
        System.out.println(wd.findElement(By.xpath("//input[1]")).isSelected());
        checkboxes.click();
        WebElement checkboxes1 = wd.findElement(By.xpath("//input[2]"));
        checkboxes1.click();
        Thread.sleep(2000);
        checkboxes1.click();
        Thread.sleep(2000);
        System.out.println(wd.findElements(By.xpath("//input[@type ='checkbox']")).size());

        }


    @AfterMethod
    public void TearDown(){
        wd.quit();
    }
    public void Click(By locator){
        wd.findElement(locator).click();
    }


}
