package com.SpiceJet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class SignUpPage extends SpiceJetBaseTest{

	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;
	
	public void clickSignup() {
		waitForElement(signup);
		clickAction(signup);
	}
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement option;
	
	public void selectOption(String optionname) {
		waitForElement(option);
		DropDownByVisibleText(option, optionname);
	}
	
	@FindBy(id="first_name")
	WebElement fname;
	
	public void enterFirstName(String Fname) {
		waitForElement(fname);
		typeText(fname, Fname);
	}
	
	@FindBy(id="last_name")
	WebElement lname;
	
	public void entertLastName(String Lname) {
		waitForElement(lname);
		typeText(lname, Lname);
	}
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	public void setCountry(String Cname) {
		waitForElement(country);
		DropDownByVisibleText(country, Cname);
	}
	
	@FindBy(id="dobDate")
	WebElement dob;
	
	public void clickDOB() {
		waitForElement(dob);
		clickAction(dob);
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement yr;
	
	public void selectYear(String year) {
	//	waitForElement(yr);
		DropDownByVisibleText(yr, year);
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement Mon;
	
	public void selectMonth(String month) {
		waitForElement(Mon);
		DropDownByVisibleText(Mon, month);
	}
	
	public void clickDate(String day) {
		WebElement setDate = driver.findElement(By.xpath("//div[text()="+day+"]"));
		waitForElement(setDate);
		clickAction(setDate);
	}
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phone;
	
	public void enterPhoneNumber(String number) {
		waitForElement(phone);
		typeText(phone, number);
	}
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	public void enterEmail(String emailId) {
		waitForElement(email);
		typeText(email, emailId);
	}
	
	@FindBy(id="new-password")
	WebElement pswd;
	
	public void enterSetPassword(String pass) {
		waitForElement(pswd);
		jsScrollUntillFound(pswd);
		typeText(pswd, pass);
	}
	
	@FindBy(id="c-password")
	WebElement Cpswd;
	
	public void enterConfirmPassword(String pass) {
		waitForElement(Cpswd);
		typeText(Cpswd, pass);
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement check;
	
	public void clickCheckBox() {
		waitForElement(check);
		//clickAction(check);
		//jsScrollUntillFound(check);
		jsScrollUpDrown(8000);
		jsWebElementClick(check);
		//moveTo(check);
		//actionClick(check);
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	public void clickSubmit() {
		waitForElement(submit);
		//jsScrollUntillFound(check);
		jsScrollUpDrown(10000);
		//clickAction(submit);
		jsWebElementClick(submit);
		//moveTo(submit);
		//doubleclick(submit);
		//actionClick(submit);
	}


}