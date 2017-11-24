package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class AboutActivity extends BaseActivity {

    public AboutActivity(AppiumDriver driver) {
        super(driver);
    }

    public LegalActivity clickLegalNotices() {
        List<AndroidElement> elements = driver.findElements(By.id("android:id/title"));

        for (AndroidElement element : elements) {
            if (element.getText().equals("Legal notices")) {
                element.click();
                break;
            }
        }
        return new LegalActivity(driver);
    }
}
