package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	public HomePage(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='2']")
	public WebElement addNote;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Take note']")
	public WebElement ChooseNoteType;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Note']")
	public WebElement fillNote;
	
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement returnBack;
	
}
