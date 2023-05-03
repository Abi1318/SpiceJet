package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class BookingPage extends SpiceJetBaseTest{
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q'])[3]")
	WebElement cash;
	public void selectDepartCash() {
		waitForElement(cash);
		clickAction(cash);
	}
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q'])[6]")
	WebElement cashret;
	public void selectReturnCash() {
		waitForElement(cashret);
		clickAction(cashret);
	}
	@FindBy(xpath="(//div[text()='Continue'])[1]")
	WebElement conti;
	public void selectContinue() {
		waitForElement(conti);
		//jsWebElementClick(conti);
		//clickAction(conti);
		actionClick(conti);
	}
	

}
