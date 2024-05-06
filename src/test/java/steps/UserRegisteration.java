package steps;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegisterationPage;
import tests.TestBase;

public class UserRegisteration extends TestBase {
	HomePage HomeObject;
	UserRegisterationPage RegisterObject;
	
	
	@Given("The user is in the home page.")
	public void the_user_is_in_the_home_page() {
	    HomeObject = new HomePage(driver);
	}
	@When("I click on the regiter link.")
	public void i_click_on_the_regiter_link() {
	    HomeObject.OpenRegisterationLink();
	}
	@When("I entered the user data.")
	public void i_entered_the_user_data() {
	    RegisterObject = new UserRegisterationPage(driver);
	    RegisterObject.UserRegisteration("Mohamed", "Mostafa", "M@yao.com", "123456789");
	}

	@Then("The registeration page displayed Successful message.")
	public void the_registeration_page_displayed_successful_message() {
	    assertTrue(RegisterObject.RegisterMessage.isDisplayed());
	}

}
