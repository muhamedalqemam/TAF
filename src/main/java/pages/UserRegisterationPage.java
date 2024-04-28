package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "gender-male")
	WebElement GenderRadioButon;

	@FindBy(id = "FirstName")
	WebElement FirstNameTextBox;

	@FindBy(id = "LastName")
	WebElement LastNameTextBox;

	@FindBy(id = "Email")
	WebElement EmailTextBox;

	@FindBy(id = "Password")
	WebElement PasswordTextBox;

	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswordTextBox;

	@FindBy(id = "register-button")
	WebElement RegisterButton;
	
	@FindBy(css = "div.result")
	public WebElement RegisterMessage;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;


	public void UserRegisteration(String FirstName, String LastName, String Email, String Password) {
		ClickButton(GenderRadioButon);
		SetText(FirstNameTextBox, FirstName);
		SetText(LastNameTextBox, LastName);
		SetText(EmailTextBox, Email);
		SetText(PasswordTextBox, Password);
		SetText(ConfirmPasswordTextBox, Password);
		ClickButton(RegisterButton);
	}
	
	public void Login() {
		ClickButton(LoginLink);
	}


}
