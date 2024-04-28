package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	public WebElement AppleMacBookPro13inch;
	
	@FindBy(linkText = "Apple iCam")
	public WebElement AppleiCam;
	
	@FindBy(xpath = "html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")
	public WebElement FirstProductName;
	
	@FindBy(xpath = "html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/h2/a")
	public WebElement SecondProductName;
	

}
