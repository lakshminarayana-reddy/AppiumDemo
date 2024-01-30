package AppiumTest.MobileAutomationDemo;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class FieldClimate {
	static  AppiumDriver driver;

	public static void main(String[] args) {
		try {
			fieldClimate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void fieldClimate() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Galaxy A22 5G");
		cap.setCapability("udid","R9ZRB069TNP");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		cap.setCapability("autoAcceptAlerts", true);
		cap.setCapability("appPackage", "com.metos.fieldclimate");
		cap.setCapability("appActivity", "com.metos.fieldclimate.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.switchTo().alert().dismiss();		
//		WebElement locationOff = driver.findElement(By.id("android:id/button2"));
//		locationOff.click();
//		WebElement layOut = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout"));
//		layOut.click();
		WebElement storeCredentials = driver.findElement(By.id("com.metos.fieldclimate:id/LoginCheckBox"));
		storeCredentials.click();
		System.out.println("Store Credntials Checkbox unchecked");
		WebElement userNameId = driver.findElement(By.id("com.metos.fieldclimate:id/usrName"));
		userNameId.sendKeys("lakshminarayanareddy");
		System.out.println("Username filled");
		WebElement passwordId = driver.findElement(By.id("com.metos.fieldclimate:id/usrPassword"));
		passwordId.sendKeys("221731");
		System.out.println("Password filled");
		WebElement loginBtn = driver.findElement(By.id("com.metos.fieldclimate:id/btnLogin"));
		loginBtn.click();
		System.out.println("Login Button clicked");
//		layOut.click();
		WebElement notificationIcon = driver.findElement(By.id("com.metos.fieldclimate:id/notification_icon"));
		notificationIcon.click();
		System.out.println("Notification Icon clicked");
		WebElement settingsTab = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\'com.metos.fieldclimate:id/icon\'])[2]"));
		settingsTab.click();
		System.out.println("Settings Tab Clicked");
		WebElement plusIcon = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.metos.fieldclimate:id/addAlert\"]/android.widget.ImageView"));
		plusIcon.click();
		System.out.println("Plus icon clicked");
		WebElement cancelBtn = driver.findElement(By.id("com.metos.fieldclimate:id/cancelBtn"));
		cancelBtn.click();
		System.out.println("Cancel button clicked");
		Thread.sleep(5000);
		System.out.println("Test");
		WebElement backBtn = driver.findElement(By.id("com.metos.fieldclimate:id/backBtn"));
		backBtn.click();
		backBtn.click();
		System.out.println("Back button clicked");
		WebElement sideMenu = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		sideMenu.click();
		System.out.println("Side Menu clicked");
		WebElement userProfile = driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.metos.fieldclimate:id/design_menu_item_text\" and @text=\"User Profile\"]"));
		userProfile.click();
		System.out.println("User profile clicked");
		WebElement logOut = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.metos.fieldclimate:id/logout\"]"));
		logOut.click();
		System.out.println("Logout clicked");

	}

}
