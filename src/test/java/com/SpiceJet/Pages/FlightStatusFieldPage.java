package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class FlightStatusFieldPage extends SpiceJetBaseTest {
	//Validating Flight status Field
	
		@FindBy(xpath="//div[text()='flight status']")
		WebElement flightStatus;
		public void clickFlightStatus() {
			waitForElement(flightStatus);
			clickAction(flightStatus);
		}
		@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
		WebElement depart;
		public void clickDepart() {
			waitForElement(depart);
			//clickAction(depart);
			actionClick(depart);
		}
		@FindBy(xpath="//div[text()='Tomorrow']")
		WebElement tomo;
		public void clickTomo() {
			waitForElement(tomo);
			clickAction(tomo);
		}
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
		WebElement from;
		public void enterFrom(String departPlace) {
			//waitForElement(from);
			typeText(from, departPlace);
		}
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
		WebElement to;
		public void enterTo(String arrivalPlace) {
			//waitForElement(to);
			typeText(to, arrivalPlace);
		}
		@FindBy(xpath="//div[text()='Search Flights']")
		WebElement flight;
		public void clickSearchFlight() {
			waitForElement(flight);
			//clickAction(flight);
			actionClick(flight);
		}
		
		public void title(String titleName) {
			Assert.assertEquals(driver.getTitle(), titleName);
		}
		
		
		
		
		



}
