package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id = "Email")
	WebElement EmailTextBox;

	@FindBy(id="Password")
	WebElement PasswordTextBox;

	@FindBy(css ="button.button-1.login-button")
	WebElement LoginButton;

	public void UserLogin(String Email,String Password) {
		SetText(EmailTextBox, Email);
		SetText(PasswordTextBox, Password);
		ClickButton(LoginButton);
	}


}
