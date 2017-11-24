package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LegalActivity extends BaseActivity {

    @AndroidFindBy(className = "android.webkit.WebView")
    private AndroidElement legalNotices;

    public LegalActivity(AppiumDriver driver) {
        super(driver);
    }

    public LegalActivity swipe(int startX, int startY, int endX, int endY) {
        //Only for Appium 4 or older
        //driver.swipe(startX, startY, endX, endY, duration);
        TouchAction touchAction = new TouchAction(driver).press(startX, startY)
                .moveTo(0, -40).release();
        driver.performTouchAction(touchAction);
        return this;
    }

    public String getLegalNotices() {
        return legalNotices.getText();
    }

}
