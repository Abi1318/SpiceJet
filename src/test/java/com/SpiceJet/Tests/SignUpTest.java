package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.SignUpPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

//3.Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields.
@Listeners(Reports.class)
public class SignUpTest extends SpiceJetBaseTest {
	Reports rp = new Reports();

	@Test(priority = -3)
	public void signUp() {

		try {
			rp.setTCDesc("Validate the Sign-Up Page by filling out Mandatory and Non-Mandatory Fields");

			//launchBrowser("https://www.spicejet.com");
			
			// Dimension d = new Dimension(800,600); //Resize current window to the set
			// driver.manage().window().setSize(d);
			SignUpPage sp = PageFactory.initElements(driver, SignUpPage.class);
			sp.clickSignup();
			windowHandlingOperation();
			sp.enterEmail("abinayakarunagaran09@gmail.com");
			Thread.sleep(5000);
			sp.enterSetPassword("Aadhira@2021");
			Thread.sleep(2000);
			sp.enterConfirmPassword("Aadhira@2021");
			sp.selectOption("Mrs");
			sp.enterFirstName("Abinaya");
			sp.entertLastName("MuraliMohan");
			sp.setCountry("India");
			sp.clickDOB();
			sp.selectYear("1994");
			sp.selectMonth("April");
			sp.clickDate("13");
			sp.enterPhoneNumber("9944266691");
			Thread.sleep(3000);
			sp.clickCheckBox();
			Thread.sleep(3000);
			sp.clickSubmit();
			Thread.sleep(3000);
			screenShotOperation("SignupPage");
			System.out.println("SpiceJet website has been signed up successfully and the Screenshot also added in the Screenshot Folder");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
