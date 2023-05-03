package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class ManageBookingPage extends SpiceJetBaseTest{
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement manageBook;
	public void clickManageBooking() {
		waitForElement(manageBook);
		clickAction(manageBook);
	}
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement pnr;
	public void enterPNR(String PNRno) { 
		waitForElement(pnr);
		typeText(pnr, PNRno);
	}
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement lastname;
	public void enterLastName(String LName) {
		waitForElement(lastname);
		typeText(lastname, LName);
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
