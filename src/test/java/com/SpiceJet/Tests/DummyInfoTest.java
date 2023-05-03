package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.BookingPage;
import com.SpiceJet.Pages.DummyInfoPage;
import com.SpiceJet.Pages.RoundPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

//7.Write code to verify that the booking was successful by checking the resulting web page for the booking confirmation message.

@Listeners(Reports.class)
public class DummyInfoTest extends SpiceJetBaseTest{
	Reports rp=new Reports();
	
	@Test(priority = 3)
	public void passengersPayments() {
		try {
			
			rp.setTCDesc("Fill out the Booking form with dummy passenger and payment information.");

			//launchBrowser("https://www.spicejet.com");
			RoundPage rtp = PageFactory.initElements(driver, RoundPage.class);
			
			rtp.clickRoundTrip();
			rtp.typeFrom("Chen");
			Thread.sleep(2000);
			rtp.typeTo("Mum");
			rtp.clickDate();
			rtp.clickReturndate();
			rtp.clickSearchFlight();
			
			 BookingPage bp=PageFactory.initElements(driver, BookingPage.class);
			   //bp.selectDepartCash();
			  // bp.selectReturnCash();
			   bp.selectContinue();
			
			DummyInfoPage dp=PageFactory.initElements(driver, DummyInfoPage.class);
			dp.clickTitle1();
			dp.selectTitle1();
			dp.enterFirstName("Abinaya");
			dp.enterLastName("MuraliMohan");
			dp.enterPhoneNumber("9944266691");
			dp.enterEmail("abinayakarunagaran09@gmail.com");
			dp.enterCityName("Chennai");
			dp.clickCheckBox();
			dp.clickTitle2();
			dp.selectTitle2();
			dp.enterFirstNameTraveller("Abinaya");
			dp.enterLastNameTraveller("MuraliMohan");
			dp.enterPhoneNumberTraveller("9944266691");
			dp.clickContinueButton();
			//dp.closeLowPopup();
			dp.clickContinueButton2();
			dp.clickSkipSeat();
			//dp.closePopup();
			dp.enterCardNumber("0987654321098765");
			dp.enterAccHolderName("Abinaya");
			dp.enterExpiryMonth("04");
			dp.enterExpiryYear("26");
			dp.enterExpiryCVV("138");
			dp.clickProceedToPay();
			dp.paymentValidation("Invalid Card Details");
			System.out.println("Booking confirmation message : Payment was not successful due to Invalid Card Details");
			screenShotOperation("DummyPassengerPaymentDetailsPage");
			System.out.println("Booking form has been filled with dummy passenger and payment information in the web page and the Screenshot also added in the Screenshot Folder");
			closeBrowser();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	

}
