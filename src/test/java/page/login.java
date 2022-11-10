package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class login extends pageparameters {
	
	By loginName = By.cssSelector("body > div > form > div > input:nth-child(2)");
	By loginPsw = By.cssSelector("body > div > form > div > input:nth-child(3)");
	By loginBtn = By.cssSelector("body > div > form > div > button");
	By loginConf = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
	
	public login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterCredentials() {
		driver.findElement(loginName).sendKeys("Robert777");
		driver.findElement(loginPsw).sendKeys("12345");
	}
	
	public void ClickButton() {
		
		driver.findElement(loginBtn).click();
	}
	
	public void isOK() {
		String note = driver.findElement(loginConf).getText();
		Assert.assertEquals("Logout, Robert777", note);
	}
}
