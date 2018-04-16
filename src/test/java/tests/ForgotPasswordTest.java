package tests;

import activities.StartActivity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test(description = "Display legal notices PASSED")
    public void displayLegalNoticesPASSTest() throws InterruptedException {
        String actualMessages = new StartActivity(driver)
                .clickLogin()
                .fillData("roberto", "topsecret")
                .clickLoginExpectingFailure()
                .clickOnForgotPassword()
                .fillData("imroberto@topsecret.com")
                .clickOnSearch()
                .getMessages();

        String expectedMessages = "We couldn't find your account with that information," +
                "Please try searching for your email, phone number or username again.";

        Assert.assertEquals(actualMessages, expectedMessages);
    }

}
