package wf;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SessionHelper extends HelperBase{
    public SessionHelper(WebDriver wd) {
        super();
    }

    //=================================================================================================================================
    public void login() throws InterruptedException {
        clickLoginButton();
        fillLoginForm(new User().setEmail("maxmayzel@gmail.com").setPassword( "Rfrnec7_*"));
        confirmLogin();

    }

    public void logOut() {
        clickOnAvatar();
        selectLogOutFromDropDownList();
        confirmLogOut();
        Assert.assertTrue(checkUserLogedOut());
    }

    public boolean checkUserLogedOut() {
        return ApplicationManager.wd.findElement(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).isDisplayed();
    }

    public void confirmLogOut() {
        Click(By.xpath("//span[@class='css-178ag6o']"));
    }

    public void selectLogOutFromDropDownList() {
        Click(By.xpath("//button[@data-testid='account-menu-logout']"));
    }

    public void clickOnAvatar() {
        Click(By.xpath("//span[@title='Max Mayzel (maxmayzel)']"));

    }

    public void fillLoginForm(User user) throws InterruptedException {
        type(By.xpath("//*[@id=\"user\"]"), user.getEmail());
        Thread.sleep(5000);
        Click(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/input[1]"));
        Thread.sleep(5000);
        type(By.xpath("//input[@id='password']"), user.getPassword());
        Thread.sleep(5000);
    }

    public void clickLoginButton() {
        Click(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
    }

    public void confirmLogin() throws InterruptedException {
        Click(By.xpath("//button[@id='login-submit']//span[@class='css-178ag6o']"));
        Thread.sleep(10000);
    }

    public void loginWithoutEmail() throws InterruptedException {
        clickLoginButton();
        fillLoginForm(new User().setEmail("maxmayzel@gmail.com"));
        confirmLogin();

    }

    public boolean isErrorPresent() {
       return isElementPresent(By.cssSelector("#password-error"));
    }
}
