package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.ManageBookingPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

/*
9.Write a code to validate below fields available on booking page
       a.Check-in
       b.Flight status
       c.Manage Booking
*/
@Listeners(Reports.class)
public class ManageBookingTest extends SpiceJetBaseTest {
	Reports rp=new Reports();
	@Test(priority = 6)
	public void validateFields() {
		try {
			rp.setTCDesc("Validating the Check-in field on the booking page");
			//launchBrowser("https://www.spicejet.com");
			ManageBookingPage mp=PageFactory.initElements(driver, ManageBookingPage.class);
			mp.clickManageBooking();
			mp.enterPNR("W3X3H8");
			mp.enterLastName("MuraliMohan");
			mp.clickSearchBooking();
			Thread.sleep(5000);
			screenShotOperation("ManageBookingField");
			mp.validatePopup("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			
			System.out.println("Manage Booking flied has been clicked and verified successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
