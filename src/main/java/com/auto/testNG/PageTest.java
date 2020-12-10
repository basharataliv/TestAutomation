package com.auto.testNG;

import org.testng.annotations.Test;

import com.auto.testNG.page.HomePage;
import com.auto.testNG.page.SecondPage;



import static org.testng.Assert.assertTrue;

import org.testng.Assert;



public class PageTest extends FunctionalTest {

	@Test
	public void verifySecondPageText() {

		driver.get("http://book.theautomatedtester.co.uk/");

		String searchText = "Assert that this text is on the page";
        //initializing first page
		HomePage homePage = new HomePage(driver);
		assertTrue(homePage.isInitialized());
        //get second page on click on chapter1
		SecondPage secondPage = homePage.getSecondPage();
		assertTrue(secondPage.isInitialized());

		String text = secondPage.getSecondPageText();
		System.out.println(text);
		Assert.assertEquals(text, searchText, "Text not found!");
	}

}
