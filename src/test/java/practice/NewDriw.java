package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewDriw {
  WebDriver wd;
@Test
    public void setUp(){
      WebDriverManager.firefoxdriver().setup();
     wd = new FirefoxDriver();
  wd.manage().window().maximize();
  wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  wd.navigate().to("https://ilcarro.web.app/search");
  wd.findElement(By.xpath("//a[@class='navigation-link'][normalize-space()='Log in']")).click();
  wd.findElement(By.xpath("//input[@id='email']")).clear();
  wd.findElement(By.xpath("//input[@id='email']")).sendKeys("maxmayzel@gmail.com");
  wd.findElement(By.xpath("//input[@id='password']")).click();
  wd.findElement(By.xpath("//input[@id='password']")).clear();
  wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Rfrnec*_");
  wd.findElement(By.cssSelector("button[type='submit']")).click();
  if(wd.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-0']")).isDisplayed()){
    System.out.println("we are passed prsedure Log in");
  }
  }

}
