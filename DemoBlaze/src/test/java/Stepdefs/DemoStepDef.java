package Stepdefs;

import Base.TestBase;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef extends TestBase {
	LoginPage loginpage;
	
	
	@Given("Login into app")
	public void login_into_app() {
		initialize();
	}
		
		@Given("Login into app with {string} and {string}")
		public void login_into_app_with_(String struser , String strpassword) {
			
			loginpage = new LoginPage();
		//loginpage.loginbutt();
		loginpage.login(struser , strpassword);
	}
	@When("Add item to cart")
	public void add_item_to_cart() {
		System.out.println("true");
				
	   
	}
	@Then("Item must be added to cart")
	public void item_must_be_added_to_cart() {
		System.out.println("true");
		   
	    
	}


}
