package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class OneWayPage extends SpiceJetBaseTest{
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

	@FindBy(xpath="(//div[text()='30'])[2]")
	WebElement day;
	
	public void clickDate() {
		waitForElement(day);
		//clickAction(day);
		jsWebElementClick(day);
		
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
