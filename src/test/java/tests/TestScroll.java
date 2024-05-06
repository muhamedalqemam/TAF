package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class TestScroll extends TestBase{

	@Test
	public void test() {
		HomePage HomeObject = new HomePage(driver);
		HomeObject.scrollToElement(HomeObject.VoteButton);
	}
}
