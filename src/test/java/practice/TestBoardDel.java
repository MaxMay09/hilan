package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestBoardDel {
    WebDriver wd;
@Test
    public void test(){

        wd.findElement(By.xpath("//div[@class='board-tile-details is-badged']")).click();
    }

}
