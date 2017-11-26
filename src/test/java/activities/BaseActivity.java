package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BaseActivity {

    protected AppiumDriver driver;

    public BaseActivity(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected void click(AndroidElement element) {
        Reporter.log("Clicking -> "
                + ("".equals(element.getText()) ? element.getId() : element.getText()));
        element.click();
    }

    public void swipe(int startX, int startY, int endX, int endY) {
        Reporter.log("Swiping: [" + startX + ", " + startY + "] [" + endX + ", " + endY + "]");
        TouchAction touchAction = new TouchAction(driver).press(startX, startY)
                .moveTo(endX, endY).release();
        driver.performTouchAction(touchAction);
    }

}
