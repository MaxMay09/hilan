package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CssTable {
    ChromeDriver wd;
    @BeforeMethod
    public void precondition(){

                wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("file:///C:/Users/User/Downloads/index%20(1).html#item2");
    }
        @Test
    public void items(){
        WebElement item1 = wd.findElement(By.cssSelector("#nav > ul > li:nth-child(1) > a"));
        item1.click();
        String item1Text = item1.getText();
        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        String alertText = alert.getText();
            Assert.assertTrue(alertText.contains(item1Text));
        }
        @Test
        public void compare(){
        wd.findElement(By.cssSelector("[name='name']")).click();
        wd.findElement(By.cssSelector("[name='name']")).clear();
        wd.findElement(By.cssSelector("[name='name']")).sendKeys("Max");
        wd.findElement(By.cssSelector("[name='surename']")).click();
        wd.findElement(By.cssSelector("[name='surename']")).clear();
        wd.findElement(By.cssSelector("[name='surename']")).sendKeys("Hello");
        wd.findElement(By.cssSelector(".btn")).click();
        //wd.findElement(By.cssSelector("#alert"));
        Assert.assertTrue(wd.findElement(By.cssSelector("#alert")).getText().contains("Hello"));
        }
        @Test
        public void columnCalculat(){
        List<WebElement> rows = wd.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        List<WebElement> columns = wd.findElements(By.tagName("td"));
        System.out.println(columns.size());

        }
        @AfterMethod
     public void tearDown(){
        wd.quit();
        }
}
