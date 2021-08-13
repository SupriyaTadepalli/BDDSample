package stepdefs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {

	WebDriver driver;
	@Given("I launch google page")
	public void i_launch_google_page() {
	   WebDriverManager.chromedriver().setup();	   
	   driver = new ChromeDriver();
	   driver.get("https://www.google.co.in");
	}
	
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		searchBox.sendKeys(Keys.ENTER);
	}
	

	@Then("Should display Java result page")
	public void should_display_java_result_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("After Search : "+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}

		@When("I search Selenium Tutorial")
		public void i_search_selenium_tutorial() {
		    // Write code here that turns the phrase above into concrete actions
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("Selenium Tutorial");
			searchBox.sendKeys(Keys.ENTER);
		}		

		@Then("Should display Selenium result page")
		public void should_display_selenium_result_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("After Search : "+ driver.getTitle());
			Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
		}
		
		@After
		public void teardown(Scenario scenario) throws IOException{
			if(scenario.isFailed()) {
				TakesScreenshot screen = (TakesScreenshot)driver;
				File screenshot = screen.getScreenshotAs(OutputType.FILE);
				byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
				scenario.attach(fileContent, "image/png", "image1");
			}
		}


}
