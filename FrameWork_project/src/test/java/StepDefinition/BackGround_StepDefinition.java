package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGround_StepDefinition {
	WebDriver driver = null;
	@Given("Open browser url Page")
	public void open_the_browser_url_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("url open");
	}

	@Given("Open the Fb url")
	public void open_the_fb_url() {
	   driver.navigate().to("https://www.facebook.com/login/");
	}

	@Given("^Enter (.*) and (.*)$")
	public void enter_the_username_and_password(String Username , String Password) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		
	}

	@Then("Close the Driver")
	public void close_the_driver() {
	    driver.close();
	}

//	@Given("Open the Organe url")
//	public void open_the_Organe_url() {
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//	    
//	}
//	@Given("^Enter (.*) and (.*)$")
//	public void enter_the_name_and_passcode(String name , String passcode) {
//	    
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name);
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passcode);
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		
//		}
//
//	@Then("Close the all url")
//	public void close_the_all_url() {
//	    driver.close();
//	}
}
