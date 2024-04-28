package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class ChangePasswordTest extends TestBase {
	
	ChangePasswordPage ChangePassword;
	HomePage Home;
	LoginPage Login;
	MyAccountPage MyAccount;
	
	String Email = "Mohamed10@yahoo.com";
	String OldPassword = "123456789";
	String NewPassword = "123789456";
	
	@Test
	public void UserCanChangePassword() {
		Home = new HomePage(driver);
		ChangePassword = new ChangePasswordPage(driver);
		Login = new LoginPage(driver);
		MyAccount = new MyAccountPage(driver);
		
		
		Home.OpenLoginLink();
		Login.UserLogin(Email, OldPassword);
		Home.OpenMyAccount();
		MyAccount.OpenChangePassword();
		ChangePassword.ChangePassword(OldPassword, NewPassword);
		
		assertTrue(ChangePassword.SuccessMessage.getText().contains("Password was changed"));
		
		
		
	}
}
