package runners;

import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//googlesearch.feature",
		glue = {"stepdefs"},
		//dryRun=true, //to verify if all the steps are defined or not. it will not execute the test, it will only verify.
		//dryRun = false //it will not verify the steps. it will only execute test, by default dryRun is false
		monochrome=true,
		plugin= {"pretty",
				//"html:target/reports/HtmlReport.html",
				//"usage:target/reports/UsageReport",
				//"json:target/reports/JSONReport.json",
				//"rerun:target/failed_scenarios.txt"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)


public class GooglePageRunner extends AbstractTestNGCucumberTests{

	

}
