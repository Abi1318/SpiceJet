package com.SpiceJet.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SpiceJet.Pages.LoginPage;
import com.SpiceJet.Utils.Reports;
import com.SpiceJet.Utils.SpiceJetBaseTest;

//4.Write a code to Login with dummy email ID and Password on Popup fields after clicking Login button on top of the page.

@Listeners(Reports.class)
public class LoginNegativeTest extends SpiceJetBaseTest {
	Reports report = new Reports();

	@Test(priority = -1)
	public void login() {

		try {
			report.setTCDesc("Validating login page with Negative inputs");
			//launchBrowser("https://www.spicejet.com");

			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			lp.clickLogin();
			lp.clickEmailField();
			lp.enterEmail("abi@gmail.com");
			lp.enterPassword("1234Adhira");
			lp.clickLogin1();
			Thread.sleep(5000);
			screenShotOperation("NegativeLogin");
			System.out.println("Negative log-in Functionality has been done in SpiceJet webpage and the Screenshot also added in the Screenshot Folder");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
