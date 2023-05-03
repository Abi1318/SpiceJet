package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.FlightStatusFieldPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;


/*
9.Write a code to validate below fields available on booking page
       a.Check-in
       b.Flight status
       c.Manage Booking
*/
@Listeners(Reports.class)
public class FlightStatusFieldTest extends SpiceJetBaseTest{
	Reports rp=new Reports();
	
	@Test(priority = 5)
	public void validateFlightStatus() {
		try {
			rp.setTCDesc("Validating the Flight Status field on the booking page");
			//launchBrowser("https://www.spicejet.com");
			FlightStatusFieldPage fsp=PageFactory.initElements(driver, FlightStatusFieldPage.class);
			fsp.clickFlightStatus();
			fsp.clickDepart();
			fsp.clickTomo();
			fsp.enterFrom("Chen");
			fsp.enterTo("Mum");
			fsp.clickSearchFlight();
			Thread.sleep(5000);
			screenShotOperation("FlightStatusField");
			fsp.title("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			System.out.println("Flight Booking flied has been clicked and verified successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	

}
