package com.max.qa.hilan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Phonebook {

    WebDriver wd;


    @BeforeClass

    public void Precondition(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        wd.navigate().to("https://telranedu.web.app/");

    }
    @Test
    public void lodinTest(){
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]")).click();
        List<WebElement> list = wd.findElements(By.tagName("input"));
        WebElement email = list.get(0);
        WebElement password = list.get(1);
        email.clear();
        email.click();
        email.sendKeys("maxmayzel@gmail.com");
        password.clear();
        password.click();
        password.sendKeys("Rfrnec7_*");
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/form/button[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/button")).click();
        wd.close();

    }
    @Test
    public void registration(){
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]")).click();
        List<WebElement> list = wd.findElements(By.tagName("input"));
        WebElement email = list.get(0);
        WebElement password = list.get(1);
        email.clear();
        email.click();
        email.sendKeys("maxmayzel@gmail.com");
        password.clear();
        password.click();
        password.sendKeys("Rfrnec7_*");
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/form/button[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/button")).click();
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(1).click();
        //wd.close();


    }
    @Test
    public void Login() throws InterruptedException {
        wd.findElement(By.xpath("//*[@id=\"root\"]/div[1]/a[3]")).click();
        wd.findElement(By.xpath("//input[@placeholder='Email']")).click();
        wd.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        wd.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("maxmayzel@gmail.com");
        wd.findElement(By.xpath("//input[@placeholder='Password']")).click();
        wd.findElement(By.xpath("//input[@placeholder='Password']")).clear();
        wd.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rfrnec7_*");
        wd.findElement(By.xpath("//button[@name='login']")).click();
        wd.findElements(By.xpath("//div[@class='contact-page_message__2qafk']"));
        System.out.println(wd.findElement(By.xpath("//button[normalize-space()='Sign Out']")).isDisplayed());

        List<WebElement> elements = wd.findElements(By.tagName("a"));
        int i;
        for (i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }
        Thread.sleep(2000);
        System.out.println(elements.size());
        wd.findElement(By.linkText("ADD")).click();
        wd.findElement(By.linkText("CONTACS")).click();
        elements.get(1).click();
        Thread.sleep(2000);

    }

    public void Click(By locator){
        wd.findElement(locator).click();

    }

}
