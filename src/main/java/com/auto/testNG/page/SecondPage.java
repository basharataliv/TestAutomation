package com.auto.testNG.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.auto.testNG.PageObject;

public class SecondPage extends PageObject {

	@FindBy(id = "divontheleft")
	private WebElement text;
	@FindBy(linkText = "Home Page")
	private WebElement homePageLink;

	public SecondPage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return text.isDisplayed();
	}

	// get text from chapter1 page and return to home page on click on home page
	public String getSecondPageText() {
		String getText = this.text.getText();
		this.homePageLink.click();
		return getText;
	}
}
