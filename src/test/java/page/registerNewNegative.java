package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class registerNewNegative extends pageparameters{

	//lokatoriai
	By createnew = By.cssSelector("body > div > form > div > h4 > a");
	By fieldUserName = By.id("username");
	By fieldUserPsw = By.id("password");
	By passwordConfirm = By.id("passwordConfirm");
	By errornote = By.id ("username.errors");
	By buttonSignIn = By.cssSelector("#userForm > button");
	//pranesimo lokatorius
	By check = By.cssSelector("#username\\.errors");

	
	//konstruktorius
	public  registerNewNegative (WebDriver driver) {
		this.driver=driver;
		}
	//metodai
	
	public void ClickButton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(createnew).click();
	}
	
	public void EnterCredentials() {
		driver.findElement(fieldUserName).sendKeys("pe");
		driver.findElement(fieldUserPsw).sendKeys("12345");
		driver.findElement(passwordConfirm).sendKeys("12345");
		
	}
	
	public void Clickbtn() {
		driver.findElement(buttonSignIn).click();
	}
	
	public void clean() {
		driver.findElement(fieldUserName).clear();
		driver.findElement(fieldUserPsw).clear();
		driver.findElement(passwordConfirm).clear();
		
		
	}
	//sukuriame metoda
	public void patikrinti () {
		//paimame teksta
		String a = driver.findElement(check).getText();
		//kokio teksto tikimes
		assertEquals("Privaloma įvesti nuo 3 iki 32 simbolių",a);
		//isvedame i konsole
		System.out.println("Testas pavyko(negative).Vartotojas neprisijunge nes neatitiko prisijungimo parametru "  +  a);
	}
	
}
