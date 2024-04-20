package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegestrationPage extends PageBase {

	public UserRegestrationPage(WebDriver driver) {
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
	
	
	public void UserRegisteration(String FirstName, String LastName, String Email, String Password) {
		GenderRadioButon.click();
		FirstNameTextBox.sendKeys(FirstName);
		LastNameTextBox.sendKeys(LastName);
		EmailTextBox.sendKeys(Email);
		PasswordTextBox.sendKeys(Password);
		ConfirmPasswordTextBox.sendKeys(Password);
		RegisterButton.click();
	}


}
