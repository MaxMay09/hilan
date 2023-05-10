package com.max.qa.hilan;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestTask {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd =new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://www.google.com/");

    }
    @Test

    public void testTask() throws InterruptedException {
        wd.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        wd.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
        wd.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("TA9");
        wd.findElement(By.cssSelector(".gNO89b")).click();
        wd.findElement(By.xpath("//div[@class='TbwUpd NJjxre iUh30 ojE3Fb']//div//span[@class='VuuXrf'][normalize-space()='t-a9.com']")).click();
        wd.findElement(By.xpath("//li[@id='menu-item-407']//a[contains(text(),'Careers')]")).click();
        WebElement yearElement = wd.findElement(By.xpath("//p[normalize-space()='All rights Reserved to TA9 LTD 2023']"));
        String yearText = yearElement.getText();
        String year = yearText.substring(31);
        System.out.println(year);
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        wd.findElement(By.id("precise_backtop")).click();;
        Thread.sleep(3000);

    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
