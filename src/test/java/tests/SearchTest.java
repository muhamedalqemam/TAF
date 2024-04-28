package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchPage;
import utilities.Helper;

public class SearchTest extends TestBase {
	HomePage HomeObject;
	SearchPage SearchObject;
	String ProductName = "icam";
	
	@Test
	public void UserCanSearch() {
		HomeObject = new HomePage(driver);
		SearchObject = new SearchPage(driver);
		
		
		HomeObject.SearchForProduct(ProductName);
		String FirstProduct = SearchObject.FirstProductName.getText();
		String SecondProduct = SearchObject.SecondProductName.getText();
		//assertTrue(SearchObject.AppleMacBookPro13inch.isDisplayed());
		assertTrue(Helper.ContainsValuesIgnoringCapitalLetters(FirstProduct, ProductName));
		assertTrue(Helper.ContainsValuesIgnoringCapitalLetters(SecondProduct, ProductName));
		//assertTrue(Helper.EqualsValuesIgnoringCapitalLetters(FirstProduct, ProductName));
		//assertEquals(SearchObject.ProductTitle, ProductName);
	}



}
