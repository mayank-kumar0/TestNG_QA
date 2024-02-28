package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeEdgeBrowser {
	@Test
	public void invokeedge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
	}
}
