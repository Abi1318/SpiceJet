package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.RoundPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;


/*
 *5. Write code to search for flights by entering dummy origin and destination information for below types of trips:
 *  a. One-way
 *  b. Round Trip
 */

@Listeners(Reports.class)
public class RoundTest extends SpiceJetBaseTest{

	Reports rp = new Reports();
	@Test(priority = 1)
	public void searchFlightRoundTrip() {
		
		try {
			rp.setTCDesc("Search flights in Round trip");

			//launchBrowser("https://www.spicejet.com");
			RoundPage rtp = PageFactory.initElements(driver, RoundPage.class);
			
			rtp.clickRoundTrip();
			rtp.typeFrom("Chen");
			Thread.sleep(2000);
			rtp.typeTo("Mum");
			rtp.clickDate();
			rtp.clickReturndate();
			rtp.clickSearchFlight();
			Thread.sleep(10000);
			screenShotOperation("RoundTrip");
			System.out.println("Flights for Round trip has been searched & displayed on the web page successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
