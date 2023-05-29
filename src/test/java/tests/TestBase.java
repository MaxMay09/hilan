package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import wf.ApplicationManager;


public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();


    @BeforeMethod

    public void SetUp() {
        app.selectBrowser();
        app.init();

    }

    @AfterMethod
    public void TearDown() {
        app.stop();
    }


}