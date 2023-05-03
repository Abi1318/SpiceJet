package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.OneWayPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;


/*
 5. Write code to search for flights by entering dummy origin and destination information for below types of trips:
          a. One-way
          b. Round Trip
 */

@Listeners(Reports.class)
public class OneWayTest extends SpiceJetBaseTest {
	Reports report = new Reports();

	@Test(priority = 0)
	public void searchFlightOnewayTrip() {

		try {
			report.setTCDesc("Search for flights by entering dummy origin and destination information for One-way");

			//launchBrowser("https://www.spicejet.com");
			OneWayPage otp = PageFactory.initElements(driver, OneWayPage.class);

			otp.typeFrom("Chen");
			Thread.sleep(2000);
			otp.typeTo("Mum");
			otp.clickDate();
			otp.clickSearchFlight();
			Thread.sleep(5000);
			screenShotOperation("OneWayTrip");
			System.out.println(
					"Flights for One-way trip has been searched & displayed on the web page successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
