package com.max.qa.hilan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebDriwerManagerTest {
    WebDriver wd;
    String browser = "Edge";

    @Test
    public void webdriwermanager() {
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            wd = new ChromeDriver();
        }
        if(browser.equals("Edge")){
            WebDriverManager.edgedriver().setup();
            wd = new EdgeDriver();
        }
    }
}