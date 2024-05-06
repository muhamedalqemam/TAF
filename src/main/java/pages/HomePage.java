package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor)driver;

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
	
	@FindBy(id = "ui-id-1")
	List<WebElement> ProductList;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement SearchButton;
	
	@FindBy(id = "vote-poll-1")
	public WebElement VoteButton;
	

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
	
	public void SearchByAutoCompelet(String SearchText) {
		SetText(SearchBarTextBox, SearchText);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ProductList.get(0).click();
		
	}
	
	public void scrollToElement(WebElement element) {
		scrollToElement(element);
	}
}
