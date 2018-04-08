package tests;

import activities.LegalActivity;
import activities.StartActivity;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesPASSTest() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity
                .clickLogin()
                .clickAbout()
                .clickLegalNotices()
                .swipeDown();
        Assert.assertTrue(true);
    }

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesFAILTest() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity
                .clickLogin()
                .clickAbout()
                .clickLegalNotices()
                .swipeDown();
        Assert.assertTrue(false);
    }

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesPASS2Test() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity
                .clickLogin()
                .clickAbout()
                .clickLegalNotices()
                .swipeDown();
        Assert.assertTrue(true);
    }
}
