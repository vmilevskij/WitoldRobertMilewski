package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginOut extends pageparameters {


	By loginOutBtn = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
	
	public LoginOut(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout() {
		driver.findElement(loginOutBtn).click();
	}
}
