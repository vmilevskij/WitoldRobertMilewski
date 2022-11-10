package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerNewPositiv extends pageparameters{
	
	By createnew = By.cssSelector("body > div > form > div > h4 > a");
	By fieldUserName = By.id("username");
	By fieldUserPsw = By.id("password");
	By passwordConfirm = By.id("passwordConfirm");
	By errornote = By.id ("username.errors");
	By buttonSignIn = By.cssSelector("#userForm > button");
	By check2 = By.cssSelector("body > nav > div > ul.nav.navbar-nav.navbar-right > a");
	String name = "Robert777";
	//konstruktorius
		public  registerNewPositiv (WebDriver driver) {
			this.driver=driver;
		}
			
			//metodai
			public void ClickButton() {
				
				driver.findElement(createnew).click();
			}
			
			public void EnterCredentials() {
				driver.findElement(fieldUserName).sendKeys(name);
				driver.findElement(fieldUserPsw).sendKeys("12345");
				driver.findElement(passwordConfirm).sendKeys("12345");
				
			}
			
			public void Clickbtn() {
				driver.findElement(buttonSignIn).click();

			}
			
			public void patikrinti2 () {
				//paimame teksta
				String a = driver.findElement(check2).getText();
				//kokio teksto tikimes
				assertEquals("Logout, "+name,a);
				//isvedame i konsole
				System.out.println("Testas pavyko(positive).Vartotojas prisijunge"  +  a);
			}
}