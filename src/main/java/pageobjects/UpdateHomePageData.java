package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UpdateHomePageData {

	public UpdateHomePageData(AppiumDriver driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[@index='0']")
	public WebElement updateNote;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
	public WebElement newUpdateEditText;

}
