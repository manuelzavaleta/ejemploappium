package activities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ChangePasswordActivity extends BaseActivity {

    @AndroidFindBy(className = "android.view.View")
    private List<AndroidElement> viewElements;

    @AndroidFindBy(className = "android.widget.EditText")
    private List<AndroidElement> inputElements;

    @AndroidFindBy(className = "android.widget.Button")
    private List<AndroidElement> buttonElements;

    public ChangePasswordActivity(AppiumDriver driver) {
        super(driver);
    }

    public ChangePasswordActivity fillData(String email) {
        sendKeys(inputElements.get(0), email);
        return this;
    }

    public ChangePasswordActivity clickOnSearch() {
        click(buttonElements.get(0));
        return this;
    }

    public String getMessages() {
        return viewElements
                .stream()
                .filter(ve -> !ve.getText().isEmpty())
                .map(AndroidElement::getText)
                .collect(Collectors.joining(","));
    }
}
