package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);


	}

	@FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(css = "a.ico-logout")
	public WebElement LogoutLink;
	
	@FindBy(linkText = "My account")
	WebElement MyAccountPage;
	
	@FindBy(id = "small-searchterms")
	WebElement SearchBarTextBox;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement SearchButton;
	

	public void OpenRegisterationLink () {
		ClickButton(RegisterLink);
	}
	
	public void OpenLoginLink() {
		ClickButton(LoginLink);
	}
	
	public void LogoutUser() {
		ClickButton(LogoutLink);
	}
	
	public void OpenMyAccount() {
		ClickButton(MyAccountPage);
	}
	
	public void SearchForProduct(String Value) {
		SetText(SearchBarTextBox, Value);
		ClickButton(SearchButton);
		
	}
}
