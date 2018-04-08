package tests;

import activities.LegalActivity;
import activities.StartActivity;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

    @Test(description = "Display legal notices")
    public void displayLegalNoticesTest() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity
                .clickLogin()
                .clickAbout()
                .clickLegalNotices()
                .swipeDown();
        Assert.assertEquals(legalActivity.getLegalNotices(), "a");
    }

}
