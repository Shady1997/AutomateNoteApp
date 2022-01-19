package main;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {
	
	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> baseCapabilities() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "app-debug.apk");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "shady1");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability("noReset", true);
		desiredCapabilities.setCapability("fullReset", false);
		driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		return driver;
	}

	public void getScreenShot() throws IOException {

		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// org.openqa.selenium.io.FileHandler.copy(screenShot, new File("C:\\"));
		FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir") + "\\defectScreenshot.png"));
	}

}
