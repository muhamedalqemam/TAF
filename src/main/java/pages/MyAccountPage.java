package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a")
	WebElement ChangePassword;
	
	public void OpenChangePassword() {
		ClickButton(ChangePassword);
	}

}
