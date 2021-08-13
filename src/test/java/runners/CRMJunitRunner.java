package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		//features = "src//test//resources//features//CRMloginfeature.feature",
				features = "src//test//resources//tagFeatures//",
		glue = {"stepdefs"},
		//dryRun=true, //to verify if all the steps are defined or not. it will not execute the test, it will only verify.
		//dryRun = false //it will not verify the steps. it will only execute test, by default dryRun is false
		monochrome=true,
		//tags = "@RegressionTest",
		//tags = "@RegressionTest or @SmokeTest", //to execute scenarios that have RegressionTest or SmokeTest
		//tags = "@ModuleOne and @RegressionTest",//to execute the Scenarios of RegressionTest only in particular feature file
		tags = "@ModuleOne and @SmokeTest",
		//tags = "@ModuleOne",//to execute all the cases in ModuleOne
		//tags = "@ModuleOne and not @SmokeTest" //to exculde smoketest scenarios
		plugin= {"pretty",
				"html:target/reports/HtmlReport.html",
				//"usage:target/reports/UsageReport",
				//"json:target/reports/JSONReport.json",
				//"rerun:target/failed_scenarios.txt"
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)


public class CRMJunitRunner{

	

}