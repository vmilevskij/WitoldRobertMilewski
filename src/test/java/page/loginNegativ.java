package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginNegativ extends pageparameters {
	
	By loginName = By.cssSelector("body > div > form > div > input:nth-child(2)");
	By loginPsw = By.cssSelector("body > div > form > div > input:nth-child(3)");
	By loginBtn = By.cssSelector("body > div > form > div > button");
	
	public loginNegativ(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterCredentials() {
		driver.findElement(loginName).sendKeys("bert");
		driver.findElement(loginPsw).sendKeys("12345");
	}
	
	public void ClickButton() {
		
		driver.findElement(loginBtn).click();
		
		

}
	
	
}