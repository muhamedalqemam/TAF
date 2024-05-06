package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTestDDTByDataProvider extends TestBase{

	HomePage Home;
	UserRegisterationPage Register;
	LoginPage Login;
	
	@DataProvider(name = "TestData")
	public static Object[][] UserData(){
		return new Object[][]{{"Moataz","Nabil","MN121@gmail.com","123456789"},
			{"Mohamed","Mostafa","MM123@gmail.com","123456789"}
		};
	}
	
	

	@Test(priority = 1, dataProvider = "TestData")
	public void UserCanRegister(String FirstName, String LastName, String Email ,String Password) {
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
	
