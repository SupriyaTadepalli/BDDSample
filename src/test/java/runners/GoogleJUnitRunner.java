package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//googlesearch.feature",
		glue = {"stepdefs"},
		dryRun=true
		)
public class GoogleJUnitRunner {

}
