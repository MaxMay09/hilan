package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Set {

    WebDriver wd;

    @BeforeMethod
public void firstTest(){
        WebDriverManager.chromedriver().setup();
    wd = new ChromeDriver();
    wd.navigate().to("https://www.google.com/");
}
    @Test
    public void searchWebdriver(){
        WebElement element = wd.findElement(By.name("q"));
        element.sendKeys("Webdriver"+ Keys.ENTER);
    }
}
