package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewDriw {
  ChromeDriver wd;
@Test
    public void setUp(){
      System.setProperty("webdriwer.chrome.driwer", " C:\\Users\\User\\Downloads\\chromedriver_win32 (9)");
      wd = new ChromeDriver();
      wd.navigate().to("http://numbersapi.com/#callback");
      wd.findElement(By.xpath("//div[normalize-space()='5 is the number of platonic solids.']"));
  }

}
