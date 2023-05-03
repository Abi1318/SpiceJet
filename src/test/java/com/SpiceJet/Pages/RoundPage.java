package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class RoundPage extends SpiceJetBaseTest{
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement round;
	
	public void clickRoundTrip() {
		waitForElement(round);
		clickAction(round);
	}

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement from;
	
	public void typeFrom(String text) {
		typeText(from, text);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement to;
	
	public void typeTo(String text) {
		typeText(to, text);
	}
	
	@FindBy(xpath="(//div[text()='30'])[3]")
	WebElement day;
	
	public void clickDate() {
		waitForElement(day);
		clickAction(day);
	}
	
	@FindBy(xpath="(//div[text()='3'])[4]")
	WebElement returnDate;
	
	public void clickReturndate() {
		waitForElement(returnDate);
		clickAction(returnDate);
	}
	
	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement search;
	
	public void clickSearchFlight() {
		waitForElement(search);
		//clickAction(search);
		//jsWebElementClick(search);
		actionClick(search);
	}

}
