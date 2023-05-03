package com.SpiceJet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class LoginPage extends SpiceJetBaseTest {
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	public void clickLogin() {
		waitForElement(login);
		clickAction(login);
	}
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailbtn;
	
	public void clickEmailField() {
		waitForElement(emailbtn);
		clickAction(emailbtn);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	public void enterEmail(String mail) {
		waitForElement(email);
		typeText(email, mail);
	}
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement pass;
	
	public void enterPassword(String password) {
		waitForElement(pass);
		typeText(pass, password);
	}
	
	@FindBy(xpath="//div[text()='LOGIN']")
	WebElement login1;
	
	public void clickLogin1() {
		waitForElement(login1);
		//clickAction(login1);
		//jsClick(login1);
		actionClick(login1);
	}
}
