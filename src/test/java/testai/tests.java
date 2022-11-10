package testai;

import org.testng.annotations.Test;

import page.LoginOut;
import page.login;
import page.loginNegativ;
import page.registerNewNegative;
import page.registerNewPositiv;

public class tests extends testParamet {
	
	@Test
	public void regNegative() throws InterruptedException {
		
		registerNewNegative r = new registerNewNegative(driver);
		Thread.sleep(3000);
		r.ClickButton();
		r.EnterCredentials();
		r.Clickbtn();
		Thread.sleep(3000);
		r.patikrinti();
		r.clean();
		
	}
	
	@Test
	public void regPositive() throws InterruptedException {
		
		registerNewPositiv r2 = new registerNewPositiv(driver);
		LoginOut r3 = new LoginOut(driver);
		Thread.sleep(3000);
		r2.ClickButton();
		Thread.sleep(3000);
		r2.EnterCredentials();
		Thread.sleep(3000);
		r2.Clickbtn();
		r2.patikrinti2();
		r3.logout();
		
	}
	
	@Test
	public void loginPageNeg() throws Exception {
		loginNegativ ln = new loginNegativ(driver);
		Thread.sleep(3000);
		ln.EnterCredentials();
		ln.ClickButton();
	
		
	}
	
	@Test
	public void loginPage() {
		login l = new login(driver);
		
		l.EnterCredentials();
		l.ClickButton();
		l.isOK();
		
	}
	
	
	@Test
	public void loginPageOut() {
		login l = new login(driver);
		LoginOut o = new LoginOut (driver);
		l.EnterCredentials();
		l.ClickButton();
		l.isOK();
		o.logout();
		
	}
}
