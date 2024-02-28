package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assertion {
	public class soft_Assertion {
		@Test
		public void testAssert() throws InterruptedException {
		
		SoftAssert st = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\myank\\OneDrive\\Documents\\ManipalQa\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Orange";
		
		st.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(1000);
		}
	}
}