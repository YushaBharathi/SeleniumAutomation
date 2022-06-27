package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPOMPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPOMStepDefinition {
	
	WebDriver driver;
	LoginPOMPages login;

@Given("User login the page pom")
public void user_login_the_page_pom() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
		driver.manage().window().maximize();
			Thread.sleep(0);

  driver.get("https://example.testproject.io/");
}

@Then("^User Enter the (.*) and (.*) pom$")
public void user_enter_the_username_and_password_pom(String Username, String Password) {
	login = new LoginPOMPages(driver);
	login.enter_Username_Password(Username, Password);
}

@Then("Click the Login Button pom")
public void click_the_login_button_pom() {
 login.dummy();
}

@Then("User Navigate to Home Page pom")
public void user_navigate_to_home_page_pom() {
   
}
	
}
