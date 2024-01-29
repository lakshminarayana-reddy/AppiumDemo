package AppiumTest.MobileAutomationDemo;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;


public class OpenApplication {
	static AppiumDriver driver;

	public static void main(String[] args) {
			try {
				openApp();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public static void anotherResponse() {
		WebElement submitAnotherResponse = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit another response\"]"));
		submitAnotherResponse.click();
	}
	public static void javaScriptExecutor(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		HashMap<String, String> scroll = new HashMap<String, String>();
		scroll.put("direction", "down");
		scroll.put("element", ((RemoteWebElement)element).getId());
		js.executeScript("mobile: scroll",scroll );
	}
	public static void openApp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Galaxy A22 5G");
		cap.setCapability("udid","R9ZRB069TNP");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		//adb shell dumpsys window | find "mCurrentFocus"
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement signIn = driver.findElement(By.id("com.android.chrome:id/signin_fre_continue_button"));
		signIn.click();
		WebElement yesIamInButton = driver.findElement(By.id("com.android.chrome:id/button_primary"));
		yesIamInButton.click();
		WebElement gotItButton = driver.findElement(By.id("com.android.chrome:id/ack_button"));
		gotItButton.click();
		WebElement googleSearchBox = driver.findElement(By.id("com.android.chrome:id/search_box_text"));
		googleSearchBox.sendKeys("demo google form");
		WebElement result = driver.findElement(By.id("com.android.chrome:id/line_1"));
		result.click();
		WebElement resultLink = driver.findElement(By.xpath("//android.view.View[@text=\"Google Form Sample\"]"));
		resultLink.click();
		WebElement textQuestion= driver.findElement(By.xpath("//android.widget.ListView/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		textQuestion.sendKeys("Text Question");
		System.out.println("Text Question Filled");
		WebElement paragraphQuestion = driver.findElement(By.xpath("//android.widget.ListView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText"));
		paragraphQuestion.sendKeys("Paragraph Question");
		System.out.println("Paragraph Question Filled");
		WebElement radioButton = driver.findElement(By.xpath("//android.widget.RadioButton[@text=\"Choice 2\"]"));
		//javaScriptExecutor(radioButton);
		radioButton.click();
		System.out.println("Radio Button clicked");
		WebElement checkBox = driver.findElement(By.xpath("//android.widget.CheckBox[@text=\"Choice 1\"]"));
		//javaScriptExecutor(checkBox);
		checkBox.click();
		System.out.println("CheckBox clicked");
		WebElement dropDown = driver.findElement(By.xpath("//android.view.View[@text=\"Choose\"]"));
		//javaScriptExecutor(dropDown);
		dropDown.click();
		System.out.println("Dropdown clicked");
		WebElement dropDownValue = driver.findElement(By.xpath("//android.view.View[@text=\"Choice 3\"]"));
		dropDownValue.click();
		System.out.println("Dropdown value selected");
		WebElement ratingButton = driver.findElement(By.xpath("//android.widget.RadioButton[@text=\"5\"]"));
		//javaScriptExecutor(ratingButton);
		ratingButton.click();
		System.out.println("Rating selected");
		WebElement submitButton = driver.findElement(By.xpath("//android.widget.Button[@text=\"Submit\"]"));
		//javaScriptExecutor(submitButton);
		submitButton.click();
		System.out.println("Form submitted");
	}

}
