package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoStepDefinition {
	
	WebDriver driver = null;
@Given("Open Demo Login Browser")
public void open_demo_login_browser() throws InterruptedException {
	//Lanuch chrome driver
	 WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
		driver.manage().window().maximize();
			Thread.sleep(0);
 
}

@Given("Navigate to Login Page")
public void navigate_to_login_page() {
 driver.get("https://example.testproject.io/");
}

//@When("^Enter (.*) and (.*)$")
//public void enter_username_and_password(String Username, String Password) throws InterruptedException {
// 
//	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Username);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
//	Thread.sleep(2000);
//	
//}

@When("^Enter username and Password$")
public void enter_username_and_password(DataTable dataTable) throws InterruptedException {
 
	List<List<String>> data = dataTable.cells();
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(data.get(1).get(0));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(1).get(1));
	
	Thread.sleep(2000);
	for(List<String> element:data) {
		
			break;
		}
	
}

@When("click on LoginButton")
public void click_on_login_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[@id='login']")).click();
	Thread.sleep(2000);
}

@Then("Navigate to home Page and clikc Logout")
public void navigate_to_home_page_and_clikc_logout() throws InterruptedException {
 boolean lgondisplay = driver.findElement(By.xpath("//button[@id='logout']")).isDisplayed();
	System.out.println("Logout Page id Display? "+lgondisplay);
	Thread.sleep(2000);
	
	driver.close();
	driver.quit();
}

}
