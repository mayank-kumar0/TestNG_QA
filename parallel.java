package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class parallel {
	@Test
	@Parameters("browser")
	public void parameterizedtest(String browser) {
		
		if (browser.equals("chrome")) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.selenium.dev/");
		}
		else {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/");
		}
	}
}