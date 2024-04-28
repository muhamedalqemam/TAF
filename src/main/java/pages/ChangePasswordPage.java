package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends PageBase{

	public ChangePasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "OldPassword")
	WebElement OldPasswordTextBox;

	@FindBy(id = "NewPassword")
	WebElement NewPasswordTextBox;

	@FindBy(id = "ConfirmNewPassword")
	WebElement ConfirmNewPasswordTextBox;
	
	@FindBy(css = "button.button-1.change-password-button")
	WebElement ChangePasswordButton;
	
	@FindBy(css = "p.content")
	public WebElement SuccessMessage;

	public void ChangePassword(String OldPassword, String NewPassword) {
		SetText(OldPasswordTextBox, OldPassword);
		SetText(NewPasswordTextBox, NewPassword);
		SetText(ConfirmNewPasswordTextBox, NewPassword);
		ClickButton(ChangePasswordButton);
	}

}
