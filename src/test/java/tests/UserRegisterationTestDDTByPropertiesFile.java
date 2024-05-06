package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTestDDTByPropertiesFile extends TestBase{

	HomePage Home;
	UserRegisterationPage Register;
	LoginPage Login;
	String FirstName = LoadProperties.userdata.getProperty("FirstName");
	String LastName = LoadProperties.userdata.getProperty("LastName");
	String Email = LoadProperties.userdata.getProperty("Email");
	String Password = LoadProperties.userdata.getProperty("Password");
	
	

	@Test(priority = 1)
	public void UserCanRegister() {
		Home = new HomePage(driver);
		Register = new UserRegisterationPage(driver);
		Home.OpenRegisterationLink();
		Register.UserRegisteration(FirstName, LastName, Email, Password);
		assertTrue(Register.RegisterMessage.getText().contains("Your registration completed"));
		Home.LogoutLink.click();
		Register.Login();
		Login = new LoginPage(driver);
		Login.UserLogin(Email, Password);
		assertTrue(Home.LogoutLink.isDisplayed());
		Home.LogoutLink.click();
		
	}
}
	
