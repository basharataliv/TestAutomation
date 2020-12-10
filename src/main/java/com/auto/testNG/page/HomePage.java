package com.auto.testNG.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.auto.testNG.PageObject;

public class HomePage extends PageObject {

	@FindBy(linkText = "Chapter1")
	private WebElement secondPageLink;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		return secondPageLink.isDisplayed();
	}
    //getting second page on click on chapter1
	public SecondPage getSecondPage() {
		this.secondPageLink.click();
		return new SecondPage(driver);
	}
}
