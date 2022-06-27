package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"StepDefinition"},
                            monochrome = true , plugin = {"json:target/cucmber.json"
							},
//                            		"pretty","html:target/HtmlReports/Reports.Html",
                            								  
                                     tags = "@LoginpagePom")
public class TestRunner {
	

}
