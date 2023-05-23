package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import javax.xml.ws.Action;
import java.util.concurrent.TimeUnit;

public class Radiobutton {
    WebDriver wd;

    @BeforeMethod
    public void precondition (){

        wd = new ChromeDriver();
         wd.manage().window().maximize();
         wd.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
         wd.navigate().to("https://www.cheapoair.com/flights/booknow/airlines?airline-code=sq&fpaffiliate=coa-google-global&fpsub=&utm_campaign=airlines_exact_atlas_global&utm_term=singapore%20airlines&utm_term_id=kwd-11309293&utm_source={google}&utm_medium={cpc}&device=c&fpprice=&campaignID=14135831175&adgroupId=126373085718&gad=1&gclid=CjwKCAjwov6hBhBsEiwAvrvN6F24oynTWoYmgbC_nQUiC9f9XQzhcF5aM1xLreWQrH7oVFLKfjZsOhoCzXUQAvD_BwE");

    }
    @Test
    public void radiobutton() throws InterruptedException {
        WebElement radio = wd.findElement(By.cssSelector("label[for='onewayTrip']"));
        radio.click();
        System.out.println(radio.isSelected());
        Thread.sleep(2000);
        WebElement radio2 = wd.findElement(By.cssSelector("label[for='multiTrip']"));
        radio2.click();
        System.out.println(wd.findElement(By.xpath("//*[@id=\"panel-1\"]/div/div[4]/div")).isDisplayed());
        //Actions action = new Actions(wd);
//        action.moveToElement(wd.findElement(By.xpath("//*[@id=\"setclsheight\"]/article/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/div/div/a")));
//        action.perform();
//        Thread.sleep(2000);
//       // System.out.println( wd.findElements(By.name("radio")).size());
//        //System.out.println(org.slf4j.LoggerFactory.getILoggerFactory().getClass());


    }
    @AfterMethod
    public void TearDown(){
        wd.quit();
    }

}

