package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebDriwerManagerTest {
    WebDriver wd;
    String browser = "Chrome";

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
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://ilcarro.web.app/");
    }

}