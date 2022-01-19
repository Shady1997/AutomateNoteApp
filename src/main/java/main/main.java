package main;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import pageobjects.HomePage;
import pageobjects.UpdateHomePageData;
//import touchactions libraries
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
//import time library
import static java.time.Duration.ofSeconds;

public class main extends Capabilities {

	private static TouchAction touchAction;
	private static TouchActions specificTouchAction;
	public static AndroidDriver<AndroidElement> driver;
	public static HomePage homepage;
	public static UpdateHomePageData updateHomepage;

	public static void main(String[] args) throws MalformedURLException {
		// TODO satrt app
		driver = baseCapabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage = new HomePage(driver);
		updateHomepage=new UpdateHomePageData(driver);


		// TODO add note with appium using page object model
		addNote();

		// TODO update exists note with appium using page object model
		updateNote();

	}

	private static void updateNote() {
		// TODO update existing note
		updateHomepage.updateNote.click();

		updateHomepage.newUpdateEditText.sendKeys(" My Name is Shady ");

		homepage.returnBack.click();

	}

	public static void addNote() {
		// TODO add new note
		homepage.addNote.click();
//				driver.findElementByXPath("//android.widget.ImageButton[@index='2']").click();

		homepage.ChooseNoteType.click();
//				driver.findElementByXPath("//android.widget.TextView[@text='Take note']").click();

		homepage.fillNote.sendKeys("My Name is Shady Ahmed Mohamed");
//				driver.findElementByXPath("//android.widget.EditText[@text='Note']").sendKeys("My Name is Shady Ahmed Mohamed");

		homepage.returnBack.click();
//				driver.findElementByXPath("//android.widget.ImageButton[@index='0']").click();

	}

//	driver.findElementByXPath("android.widget.TextView[@index='1']").click();
//long press for swipe action to swipe from first point to second point
//touchAction = new TouchAction(driver);
//specificTouchAction=new TouchActions(driver);

//driver.findElementByXPath("//androidx.cardview.widget.CardView[@index='1']").click();

//new TouchAction(driver).press(300,550).release().perform().press(300,550).release().perform()
//new TouchAction((MobileDriver) driver).press(300,550).waitAction(Duration.ofMillis(50)).release().perform();

//WebElement second = driver.findElement(By.xpath("//androidx.cardview.widget.CardView[@index='1']"));

//specificTouchAction.doubleTap((WebElement) tapOptions().withElement(element(first))).perform();

//touchAction.longPress(longPressOptions().withElement(element(second)).withDuration(ofSeconds(2))).release().perform();

//driver.findElementByAndroidUIAutomator("index(0)");

}
