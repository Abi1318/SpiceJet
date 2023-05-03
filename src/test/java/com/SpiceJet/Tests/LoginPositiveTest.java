package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.LoginPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

//4.Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.

@Listeners(Reports.class)
public class LoginPositiveTest extends SpiceJetBaseTest {
	Reports report = new Reports();

	@Test(priority = -2)
	public void login() {

		try {
			report.setTCDesc("Validating Positive Login functionality");
			//launchBrowser("https://www.spicejet.com");
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			lp.clickLogin();
			lp.clickEmailField();
			lp.enterEmail("abinayakarunagaran09@gmail.com");
			lp.enterPassword("Aadhira@2021");
			lp.clickLogin1();
			Thread.sleep(5000);
			screenShotOperation("PositiveLogin");
			System.out.println("Positive log-in Functionality has been done in SpiceJet webpage and the Screenshot also added in the Screenshot Folder");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
