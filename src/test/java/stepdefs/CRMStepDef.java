package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CRMStepDef {
	WebDriver driver;	

		@Given("User is already on login page")
		public void user_is_already_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://ui.cogmento.com/");
		    Assert.assertEquals("Cogmento CRM", driver.getTitle());
		    
		}

//		@When("user enters credentials")
//		public void user_enters_credentials() {
		    // Write code here that turns the phrase above into concrete actions
//		   driver.findElement(By.name("email")).sendKeys("corpdevops@gmail.com");
//		   driver.findElement(By.name("password")).sendKeys("Crmpro123");
//		   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		}
		
		@When("user enters {string} and {string}")
		public void user_enters_credentials(String strUser, String strPwd) {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.name("email")).sendKeys(strUser);
		   driver.findElement(By.name("password")).sendKeys(strPwd);
		   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		}
		
		
		//Using datatable as list
//		@When("user enters credentials")
//		public void user_enters_credentials(DataTable userCreds) {
		    // Write code here that turns the phrase above into concrete actions
			
			//List<List<String>> users = userCreds.asLists();
//			List<String> user = userCreds.asList();
//		   driver.findElement(By.name("email")).sendKeys(user.get(0));
//		   driver.findElement(By.name("password")).sendKeys(user.get(1));
//		   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		}
		
		
		//Using datatable as Map
		@When("user enters credentials")
		public void user_enters_credentials(DataTable userCreds) {
		    // Write code here that turns the phrase above into concrete actions
			
			List<Map<String, String>> user = userCreds.asMaps();
		   driver.findElement(By.name("email")).sendKeys(user.get(0).get("username"));
		   driver.findElement(By.name("password")).sendKeys(user.get(0).get("password"));
		   driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		}
				
				
		@Then("Should display HomePage")
		public void should_display_home_page() {
		    // Write code here that turns the phrase above into concrete actions
		   boolean isUserDisp = driver.findElement(By.className("user-display")).isDisplayed();
		   Assert.assertTrue(isUserDisp);
		}

		@Then("close browser")
		public void close_browser() {
		    // Write code here that turns the phrase above into concrete actions
		   driver.close();
		}

}
