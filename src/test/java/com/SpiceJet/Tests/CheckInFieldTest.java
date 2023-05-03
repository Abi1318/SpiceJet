package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.CheckInFieldPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

/*
9.Write a code to validate below fields available on booking page
       a.Check-in
       b.Flight status
       c.Manage Booking
*/
@Listeners(Reports.class)
public class CheckInFieldTest extends SpiceJetBaseTest {
	Reports rp=new Reports();
	@Test(priority = 4)
	public void validateFields() {
		try {
			rp.setTCDesc("Validating the Check-in field on the booking page");
			//launchBrowser("https://www.spicejet.com");
			CheckInFieldPage fp=PageFactory.initElements(driver, CheckInFieldPage.class);
			fp.clickCheckIn();
			fp.enterPNR("W3X3H8");
			fp.enterMailId("abinayakarunagaran09@gmail.com");
			fp.clickSearchBooking();
			Thread.sleep(5000);
			screenShotOperation("CheckInField");
			fp.validatePopup("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			
			System.out.println("Check-in flied has been clicked and verified successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
