package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageparameters {
protected WebDriver driver;
	
	public void AbstractClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		

	}

}


