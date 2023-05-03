package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.BookingPage;
import com.SpiceJet.Pages.RoundPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

//6.Write code to select a flight and proceed to the booking page.
@Listeners(Reports.class)
public class BookingTest extends SpiceJetBaseTest {
	Reports rp = new Reports();

	@Test(priority = 2)
	public void BookingFlight() {

		try {
			rp.setTCDesc("Select a flight and proceed to the booking page");
			//launchBrowser("https://www.spicejet.com");
			
			RoundPage rtp = PageFactory.initElements(driver, RoundPage.class);
			rtp.clickRoundTrip();
			rtp.typeFrom("Chen");
			Thread.sleep(2000);
			rtp.typeTo("Mum");
			rtp.clickDate();
			rtp.clickReturndate();
			rtp.clickSearchFlight();

			BookingPage bp = PageFactory.initElements(driver, BookingPage.class);
			bp.selectContinue();
			Thread.sleep(10000);
			screenShotOperation("BookingPage");
			System.out.println("Flight has been selected & proceeded succesfully to the booking page and the Screenshot also added in the Screenshot Folder");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
