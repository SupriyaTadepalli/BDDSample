package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMContactStepDef {

//		@Before //hooks in cucumber @Before, @After, @BeforeStep, @AfterStep
//		public void setup() {
//			System.out.println("Before each scenario");
//		}

//		@BeforeStep
//		public void setupStep() {
//			System.out.println("Before each Step");
//		}
		
	
//	@Before("@RegressionTest") //tagged hooks to execute only before RegressionTest
//	public void setupfirefox() {
//		System.out.println("Init firefox");
//	}
	
//	@Before("@SmokeTest") //tagged hooks to execute only before SMokeTest
//	public void setupedge() {
//		System.out.println("Init edge");
//	}
	
	@Before(order = 1, value = "@RegressionTest") //hooks in cucumber @Before, @After, @BeforeStep, @AfterStep
	public void readfromProperty() {
		System.out.println("Read from property");
	}
	
	@Before(order = 2, value = "@RegressionTest") //hooks in cucumber @Before, @After, @BeforeStep, @AfterStep
	public void setupDB() {
		System.out.println("setup DB");
	}
	
	@Before(order = 3)
	public void initbrowser() {
		System.out.println("Init browser");
	}
		@Given("User enters valid Login")
		public void user_enters_valid_login() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Login");
		}

		@When("User create a new contact")
			public void user_create_a_new_contact() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("Create contact");
			}

		@When("User view contact details")
			public void user_view_contact_details() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("view contact");
			}

	
		@When("User edits contact details")
			public void user_edits_contact_details() {
		    // Write code here that turns the phrase above into concrete actions
				System.out.println("edit contact");
		}
		
		@When("User deletes contact details")
			public void user_deletes_contact_details() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("delete contact");
			}
	
		@When("User Logout")
			public void user_logout() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("Logout");
			}
		@After
		public void teardown() {
			System.out.println("After each scenario");
		}

		@AfterStep
		public void teardownStep() {
			System.out.println("After each Step");
		}
}
