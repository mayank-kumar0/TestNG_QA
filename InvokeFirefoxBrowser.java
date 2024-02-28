package TestNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFirefoxBrowser {
	@Test
	public void invokefirefox() {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe\\");
		FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://www.selenium.dev/");
	}
}
