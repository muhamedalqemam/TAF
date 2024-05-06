package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected static WebDriver driver;
    public static JavascriptExecutor jse;

	public PageBase (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public static void ClickButton(WebElement Element) {
		Element.click();
	}

	public static void SetText(WebElement TextElement, String Value) {
		TextElement.sendKeys(Value);

	}

	    public void scrollToElement( WebElement element) {
	        jse.executeScript("arguments[0].scrollIntoView(true);", element);
	    }

}
