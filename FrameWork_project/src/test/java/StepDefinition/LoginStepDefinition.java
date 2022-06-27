package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {
	
	@Given("User login the page")
	public void user_login_the_page() {
	 System.out.println("First Method"); 
	}

	@Then("User Enter the Username and Password")
	public void user_enter_the_username_and_password() {
		 System.out.println("Second Method");   
	}

	@And("Click the Login Button")
	public void click_the_login_button() {
		 System.out.println("Third Method");
	}

	@Then("User Navigate to Home Page")
	public void user_navigate_to_home_page() {
		 System.out.println("Fourth Method");
	}
	@Given("User loginn the pages")
	public void user_loginn_the_pages() {
	    System.out.println("Six Method");
	}
}
