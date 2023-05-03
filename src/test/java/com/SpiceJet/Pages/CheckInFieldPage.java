package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class CheckInFieldPage extends SpiceJetBaseTest {
	
	//Validating CheckIn Field
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	public void clickCheckIn() {
		waitForElement(checkin);
		clickAction(checkin);
	}
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement pnr;
	public void enterPNR(String typePNRnum) {
		waitForElement(pnr);
		typeText(pnr, typePNRnum);
	}
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement mail;
	public void enterMailId(String typeEmail) {
		waitForElement(mail);
		typeText(mail, typeEmail);
	}
	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement booking;
	public void clickSearchBooking() {
		waitForElement(booking);
		//clickAction(booking);
		actionClick(booking);
		//jsWebElementClick(booking);
	}
	@FindBy(xpath="//div[@class='css-76zvg2 css-cens5h r-jwli3a']")
	WebElement Popup;
	public void validatePopup(String popupname) {
		waitForElement(Popup);
		validateTitle(Popup, popupname);
	}
	
	
	
	
}
