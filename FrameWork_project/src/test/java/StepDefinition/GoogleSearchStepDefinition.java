package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefinition {

	WebDriver driver = null;
	
	@Given("Open browser")
	public void open_browser() throws InterruptedException {
	//Lanuch chrome driver
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(0);
	}

	@And("Navigate to google search Page")
	public void navigate_to_google_search_page() {
	//driver.get("https://www.google.com/");
	driver.navigate().to("https://www.google.com/");
	}

	@When("Enter text in search box")
	public void enter_text_in_search_box() {
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation Step by Step");
		
	}

	@When("Hit Enter")
	public void hit_enter() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("Validate Search Results")
	public void validate_search_results() {
	 System.out.println(driver.getPageSource().contains("Online Course"));
	}
}
