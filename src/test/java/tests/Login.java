package tests;

import jdk.nashorn.internal.runtime.Debug;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login extends TestBase {



    @Test

    public void loginLogOutTest() throws InterruptedException {
        app.cleanCokea();
        app.getSession().login();
        //waitForElement(By.xpath("//h2[normalize-space()='Most popular templates']"), 30);
        Assert.assertTrue(app.getBoard().isAvatarPresent(), "Avatar isn't present");
//       Click(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
//       login(By.xpath("//*[@id=\\\"user\\\"]"),"maxmayzel@gmail.com");
//        Click(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/input[1]"));
//       login(By.xpath("//input[@id='password']"), "Rfrnec7_*");
//        Click(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
//        type(By.xpath("//*[@id=\"user\"]"), "maxmayzel@gmail.com");
////        Click(By.xpath("//*[@id=\"user\"]"));
////        wd.findElement(By.xpath("//*[@id=\"user\"]")).clear();//*[@id="login"]
////        wd.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("maxmayzel@gmail.com");
//        Thread.sleep(5000);
//        Click(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/input[1]"));
//        Thread.sleep(5000);
//        type(By.xpath("//input[@id='password']"), "Rfrnec7_*");
////        Click(By.xpath("//input[@id='password']"));
////        wd.findElement(By.xpath("//input[@id='password']")).clear();//*[@id="login"]
////        wd.findElement(By.xpath("//input[@id='password']")).sendKeys("Rfrnec7_*");
//        Thread.sleep(5000);
//        Click(By.xpath("//button[@id='login-submit']//span[@class='css-178ag6o']"));
//        Thread.sleep(10000);
        //System.out.println(ApplicationManager.app.wd.findElement(By.xpath("//span[@title='Max Mayzel (maxmayzel)']")).isDisplayed());
//        Point location  = wd.manage().window().getPosition();
//        System.out.println("Browser window location:" + location);
//        wd.navigate().to("https://the-internet.herokuapp.com/dropdown");
//        WebElement dd = wd.findElement(By.id("dropdown"));
//        Select select = new Select(dd);
//        select.selectByValue("1");
//        Thread.sleep(2000);
//        //select.deselectByValue("1");
//        List<WebElement> all = select.getAllSelectedOptions();
//        System.out.println(all.size());
//        select.selectByValue("2");
//        Thread.sleep(5000);
//        //select.deselectAll();
//
//
//
//
//
//        wd.navigate().to("https://lamafilm.club/film/operaciya-fortuna-iskusstvo-pobezhdat/");
//        List<WebElement> webelements = wd.findElements(By.xpath("//div[@class='owl-item active']"));
//        System.out.println(webelements);
//        wd.navigate().to("https://www.sugarcrm.com/uk/?utm_source=sugarcrm.com&utm_medium=referral");
//        String windowhandle = wd.getWindowHandle();
//        System.out.println(windowhandle);
////        wd.findElement(By.xpath("//*[@id=\"menu-item-22271\"]/a/span[1]")).click();
////       Set<String> windowHandles1 = wd.getWindowHandles();
////        System.out.println(windowHandles1);
        app.getSession().logOut();
    }    @Test
    public void negativeloginWithOutPasswordTest() throws InterruptedException {
        app.cleanCokea();
        app.getSession().clickLoginButton();
        app.getSession().fillLoginForm(new User().withEmail("maxmayzel@gmail.com"));
        app.getSession().confirmLogin();
        Assert.assertTrue(app.getSession().isErrorPresent(), "Enter your password");
//        app.cleanCokea();
//        app.getSession().loginWithoutEmail();
//       Assert.assertTrue(app.getSession().isErrorPresent(), "Enter your password");

    }


}

