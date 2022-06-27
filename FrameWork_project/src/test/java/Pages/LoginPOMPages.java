package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOMPages {

	WebDriver driver;
	
	String Username_Xapth = "//input[@id='name']";
	String Password_Xapth = "//input[@id='password']";
	
	public LoginPOMPages(WebDriver driver) {
	this.driver = driver;	
	}
	
	public void enter_Username_Password(String Username, String Password) {
	
		driver.findElement(By.xpath(Username_Xapth)).sendKeys(Username);;
		driver.findElement(By.xpath(Password_Xapth)).sendKeys(Password);;
		
	}
	
	public void dummy() {
		
	}
	
}
