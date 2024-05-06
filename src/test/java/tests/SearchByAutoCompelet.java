package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;

public class SearchByAutoCompelet extends TestBase {
	
	HomePage HomeObject;
	ProductDetailsPage ProductDetailsObject;
	String ProductName = "Apple MacBook Pro 13-inch";
	
	@Test
	public void SearchByAutoSuggest() {
		HomeObject = new HomePage(driver);
		HomeObject.SearchByAutoCompelet("MacB");
		ProductDetailsObject = new ProductDetailsPage(driver);
		assertTrue(ProductDetailsObject.ProductTitle.getText().contains(ProductName)); 
	}

}
