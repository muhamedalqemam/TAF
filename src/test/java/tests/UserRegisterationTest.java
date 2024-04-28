package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTest extends TestBase{

	HomePage Home;
	UserRegisterationPage Register;
	LoginPage Login;
	
	String FirstName = "Mohamed";
	String LastName = "Mostafa";
	String Email = "Mohamed10@yahoo.com";
	String Password = "123456789";

	@Test(priority = 1)
	public void UserCanRegister() {
		Home = new HomePage(driver);
		Register = new UserRegisterationPage(driver);
		Home.OpenRegisterationLink();
		Register.UserRegisteration(FirstName, LastName, Email, Password);
		
		assertTrue(Register.RegisterMessage.getText().contains("Your registration completed"));
		
		Register.Login();
		
	}
	
	@Test(priority = 2, dependsOnMethods = "UserCanRegister")
	public void UserCanLogin() {
		Login = new LoginPage(driver);
		Login.UserLogin(Email, Password);
		assertTrue(Home.LogoutLink.isDisplayed());
	}
}
