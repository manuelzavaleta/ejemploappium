package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginActivity extends BaseActivity {

    @AndroidFindBy(id = "com.twitter.android:id/overflow")
    private AndroidElement overflow;

    @AndroidFindBy(id = "com.twitter.android:id/overflow_item_title")
    private AndroidElement aboutLink;

    public LoginActivity(AppiumDriver driver) {
        super(driver);
    }

    public AboutActivity clickAbout() throws InterruptedException {
        click(overflow);
        click(aboutLink);
        return new AboutActivity(driver);
    }

}
