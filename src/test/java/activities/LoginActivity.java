package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginActivity extends BaseActivity {

    @AndroidFindBy(id = "com.twitter.android:id/overflow")
    private AndroidElement overflow;

    @AndroidFindBy(id = "com.twitter.android:id/overflow_item_title")
    private AndroidElement aboutLink;

    @AndroidFindBy(id = "com.twitter.android:id/login_identifier")
    private AndroidElement inputUsername;

    @AndroidFindBy(id = "com.twitter.android:id/login_password")
    private AndroidElement inputPassword;

    @AndroidFindBy(id = "com.twitter.android:id/login_login")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.twitter.android:id/password_reset")
    private AndroidElement passwordReset;

    public LoginActivity(AppiumDriver driver) {
        super(driver);
    }

    public AboutActivity clickAbout() throws InterruptedException {
        click(overflow);
        click(aboutLink);
        return new AboutActivity(driver);
    }

    public LoginActivity fillData(String username, String password) {
        sendKeys(inputUsername, username);
        sendKeys(inputPassword, password);
        return this;
    }

    public LoginActivity clickLoginExpectingFailure() {
        click(loginButton);
        return this;
    }

    public ChangePasswordActivity clickOnForgotPassword() {
        click(passwordReset);
        return new ChangePasswordActivity(driver);
    }
}
