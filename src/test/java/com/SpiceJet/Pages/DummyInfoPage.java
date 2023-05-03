package com.SpiceJet.Pages;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;

import com.SpiceJet.Utils.SpiceJetBaseTest;

public class DummyInfoPage extends SpiceJetBaseTest{
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
	WebElement Tit1;
	public void clickTitle1() {
		waitForElement(Tit1);
		clickAction(Tit1);
	}
	
	@FindBy(xpath="(//div[text()='Mrs'])[1]")
	WebElement title1;
	public void selectTitle1() {
		waitForElement(title1);
		clickAction(title1);
	}
	
	
	 @FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
     WebElement fname;
     
     public void enterFirstName(String name) {
    	 waitForElement(fname);
    	 typeText(fname, name);
     }
     
     @FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
     WebElement lname;
     
     public void enterLastName(String name1) {
    	 waitForElement(lname);
    	 typeText(lname, name1);
     }
     
     @FindBy(xpath="//input[@data-testid='contact-number-input-box']")
     WebElement phone;
     
     public void enterPhoneNumber(String num) {
    	 waitForElement(phone);
    	 typeText(phone, num);
     }

     @FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
     WebElement email;
     
     public void enterEmail(String mail) {
    	 waitForElement(email);
    	 typeText(email, mail);
     }
     
     @FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
     WebElement city;
     
     public void enterCityName(String name) {
    	 waitForElement(city);
    	 typeText(city, name);
     }
	
     @FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
     WebElement checkbox;
     
     public void clickCheckBox() {
    	 waitForElement(checkbox);
    	 clickAction(checkbox);
    	 //jsWebElementClick(checkbox);
     }
     
     @FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[2]")
     WebElement Tit2;
     public void clickTitle2() {
    	 waitForElement(Tit2);
    	 clickAction(Tit2);
     }
     
     @FindBy(xpath="(//div[text()='Mrs'])[2]")
 	WebElement title2;
 	public void selectTitle2() {
 		waitForElement(title2);
 		clickAction(title2);
 	}
 	
     
     @FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
     WebElement fname1;
     
     public void enterFirstNameTraveller(String name) {
    	 waitForElement(fname1);
    	 typeText(fname1, name);
     }
     
     @FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
     WebElement lname1;
     
     public void enterLastNameTraveller(String name) {
    	 waitForElement(lname1);
    	 typeText(lname1, name);
     }
     
     @FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
     WebElement phone1;
     
     public void enterPhoneNumberTraveller(String num) {
    	waitForElement(phone1);
    	typeText(phone1, num);
     }
     
     @FindBy(xpath="//div[text()='Continue']")
     WebElement cotinue1;
     
     public void clickContinueButton() {
    	 waitForElement(cotinue1);
    	// clickAction(cotinue1);
    	// jsWebElementClick(cotinue1);
    	 actionClick(cotinue1);
     }
     
     @FindBy(xpath="(//span[text()='Skip this to skip comfort.'])[1]")
     WebElement skipSeat;
     
     public void clickSkipSeat() {
    	 waitForElement(skipSeat);
    	 clickAction(skipSeat);
     }
     
    
     @FindBy(xpath="(//div[text()='Continue'])[3]")
     WebElement continue3;
     
    @FindBy(xpath="//div[text()='Excess Baggage']")
    WebElement bagg;
     
     public void clickContinueButton2() {
    	 waitForElement(continue3);
    	 jsScrollUntillFound(bagg);
    	actionClick(continue3);
    	 //jsWebElementClick(continue3);
   //  clickAction(continue3);
     }
     
     @FindBy(xpath="//div[@id='at_addon_close_icon']")
     WebElement lowPopup;
     public void closeLowPopup() {
    	 waitForElement(lowPopup);
    	 clickAction(lowPopup);
     }
     
     
     
     @FindBy(xpath="//div[@id='at_prepayment_close_icon']") 
     WebElement Popup;
     public void closePopup() {
    	 waitForElement(Popup);
    	 clickAction(Popup);
     }
     @FindBy(xpath="//iframe[@class='card_number_iframe']")
     WebElement frame1;
     
     @FindBy(name="card_number")
     WebElement cardNum;
     
     public void enterCardNumber(String num) {
    	 waitForElement(frame1);
    	 framesByWebElement(frame1);
    	 waitForElement(cardNum);
    	 typeText(cardNum, num);
     }
     @FindBy(xpath="//iframe[@class='name_on_card_iframe']")
     WebElement frame2;
     
     @FindBy(id="name_on_card")
     WebElement accHolder;
     
     public void enterAccHolderName(String name) {
    	 framesByDefault();
    	 waitForElement(frame2);
    	 framesByWebElement(frame2);
    	 waitForElement(accHolder);
    	 typeText(accHolder, name);
     }
     @FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
     WebElement frame3;
     
     @FindBy(id="card_exp_month")
     WebElement month;
     
     public void enterExpiryMonth(String num) {
    	 framesByDefault();
    	 waitForElement(frame3);
    	 framesByWebElement(frame3);
    	 waitForElement(month);
    	 typeText(month, num);
     }
     @FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
     WebElement frame4;
     @FindBy(id="card_exp_year")
     WebElement year;
     
     public void enterExpiryYear(String num) {
    	 framesByDefault();
    	 waitForElement(frame4);
    	 framesByWebElement(frame4);
    	 waitForElement(year);
    	 typeText(year, num);
     }
     @FindBy(xpath="//iframe[@class='security_code_iframe']")
     WebElement frame5;
     
     @FindBy(id="security_code")
     WebElement cvv;
     
     public void enterExpiryCVV(String num) {
    	 framesByDefault();
    	 waitForElement(frame5);
    	 framesByWebElement(frame5);
    	 waitForElement(cvv);
    	 typeText(cvv, num);
     }
     
     @FindBy(xpath="//div[text()='Proceed to pay']")
     WebElement pay;
     
     public void clickProceedToPay() {
    	 framesByDefault();
    	 waitForElement(pay);
    	 jsScrollUntillFound(pay);
    	// clickAction(pay);
    	// jsWebElementClick(pay);
    	 actionClick(pay);
     }
     
     @FindBy(xpath="//div[text()='Invalid Card Details']")
  	WebElement invalid;
  	
  	public void paymentValidation(String text) {
  		waitForElement(invalid);
  		//String text = "Invalid Card Details";
  		validateTitle(invalid, text);
  	}
      

}
