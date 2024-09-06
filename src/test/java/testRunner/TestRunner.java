/*Name - Arthi V
 * Date - 05.09.2024
 * Description - Online Food Delivery Management System
 */


package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/OnlineFood.feature", // Path to your feature files
		glue = "stepDefinitions", // Package containing step definitions
		plugin = { "pretty", "html:target/cucumber-reports" }, monochrome = true)
public class TestRunner {
}