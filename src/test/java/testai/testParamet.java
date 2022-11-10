package testai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class testParamet {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public static void Setup() {
		
		
		
		driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void TearDown() {
		driver.close();
	}

}
