package tests;

import activities.LegalActivity;
import activities.StartActivity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void displayLegalNoticesTest() throws InterruptedException {
        StartActivity startActivity = new StartActivity(driver);
        LegalActivity legalActivity = startActivity.clickLogin()
                .clickAbout().clickLegalNotices()
                .swipe(400, 450, 0, -40);
        Assert.assertEquals(legalActivity.getLegalNotices(), "");
    }

}
