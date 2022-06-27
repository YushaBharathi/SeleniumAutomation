package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchCaseStepDefinition {
	WebDriver driver = null;
	@Given( "^Open the Login browser (.*)$") 
	public void open_the_login_browser(String browser ) throws InterruptedException {
		 switch (browser) {
	       case "edge":
	    	   System.out.println("ede");
	    
	            verifyedgebrowserPage();
	          break;  
	       case "chrome":  
	    	   	    	   
	          verifychromebrowserPage();
	          break;
	       default:
	           System.out.println("Unexpected page type"); 
	           verifychromebrowserPage();
	  }
	}

	private void verifychromebrowserPage( ) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
 		driver.manage().window().maximize();
		Thread.sleep(0);

	}
	private void verifyedgebrowserPage() throws InterruptedException {
		 WebDriverManager.edgedriver().setup();
         driver = new EdgeDriver();
  		driver.manage().window().maximize();
		Thread.sleep(0);
	
	}

	

	
}
