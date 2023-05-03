package com.SpiceJet.Utils;

import java.io.File;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

//1.Set up a Selenium project in your preferred programming language (Java, Python, etc.).

public class SpiceJetBaseTest {
	public static WebDriver driver = null;

//2.Write code to open a web browser and navigate to the SpiceJet flight booking system (https://www.spicejet.com/).
	
	@BeforeMethod
	@Parameters({"browser"})
		public void launchBrowser(String browserName) throws InterruptedException{
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.spicejet.com");
			}
			else if(browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.spicejet.com");
		}
		}
	/*
	public void launchBrowser(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
			Reports.reportStep("PASS", "Browser Launched Successfully with this" + url);
		}

		catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while launching Broswer with this" + url);
			System.out.println("Problem while launching the browser");
			ex.printStackTrace();

		}
	}
*/
	@AfterMethod
	public void quitBrowser() {
		try {
			driver.quit();
			Reports.reportStep("PASS", "All Browser has been closed successfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while closing All the Browsers");
			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
			Reports.reportStep("PASS", "Current/Active Browser has been closed successfully");
		}

		catch (Exception ex) {
			Reports.reportStep("FAIL", "Problime while closing Current/Active Browser ");
			ex.printStackTrace();
		}
	}

	public void validateTitle(WebElement ele, String title) {
		try {
			Assert.assertEquals(ele.getText(), title);
			Reports.reportStep("PASS", "This " + title + " has been verified successfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while verifying the : " + title);
			ex.printStackTrace();
		}
	}

	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);
			Reports.reportStep("PASS", "The " + text + " was entered succesfully to the " + ele);
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + text + " was not entered to the " + ele);
			ex.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();
			Reports.reportStep("PASS", "The " + ele + " was clicked succesfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't clicked");
			ex.printStackTrace();
		}
	}

	// Wait
	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			// wait.until(ExpectedConditions.)
			Reports.reportStep("PASS", "The " + ele + " waited successfully to meet the expected conditions");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while waiting for the " + ele);
			ex.printStackTrace();
		}

	}

	// DropDown
	public void DropDownByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);
			Reports.reportStep("PASS", "Selected the given " + value + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + value + " from the dropdown");
			ex.printStackTrace();
		}

	}

	public void DropDownByIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);
			Reports.reportStep("PASS", "Selected the given " + index + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + index + " from the dropdown");
			ex.printStackTrace();
		}

	}

	public void DropDownByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);
			Reports.reportStep("PASS", "Selected the given " + VisibleText + " from the dropdown");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while selecting the given " + VisibleText + " from the dropdown");
			ex.printStackTrace();
		}
	}

	// Alerts
	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Reports.reportStep("PASS", "Successfully accepted the alert");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while accepting the alert");
			ex.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			Reports.reportStep("PASS", "Successfully dismiss the alert");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while dismiss the alert");
			ex.printStackTrace();
		}
	}

	// Actions
	public void moveTo(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			Reports.reportStep("PASS", "The " + ele + " was movoTo element succesfully");
		} catch (Exception ex) {
			Reports.reportStep("PASS", "The " + ele + " wasn't moveTo  element");
			ex.printStackTrace();
		}
	}

	public void actionClick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.click(ele).build().perform();
			Reports.reportStep("PASS", "The " + ele + " has been clicked succesfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't clicked");
			ex.printStackTrace();
		}
	}

	public void doubleclick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();
			Reports.reportStep("PASS", "The " + ele + " has been doubleclicked succesfully");
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't doubleclicked");
			ex.printStackTrace();
		}
	}

	// Frames
	public void framesByIndex(int index) {
		try {
			driver.switchTo().frame(index);
			Reports.reportStep("PASS", "The frame is switched successfully using index number" + index);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while switching the frame using index number" + index);
			e.printStackTrace();
		}
	}

	public void framesByWebElement(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			Reports.reportStep("PASS", "The frame is swicthed successfully using WebElement " + ele);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while switching the frame using WebElement" + ele);
			e.printStackTrace();
		}
	}

	public void framesByNameOrID(String nameOrID) {
		try {
			driver.switchTo().frame(nameOrID);
			Reports.reportStep("PASS", "The frame is swicthed successfully using Name Or ID Attributes " + nameOrID);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while switching the frame using NameOrId Attributes" + nameOrID);
			e.printStackTrace();
		}
	}

	public void framesByDefault() {
		try {
			driver.switchTo().defaultContent();
			Reports.reportStep("PASS", "The frame is swicthed to parent frame successfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while switching the parent frame ");
			e.printStackTrace();
		}
	}

	// Javasscriptexecutor

	public void jsScrollUpDrown(int x) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + x + ")");
			Reports.reportStep("PASS", "Scroll action(up/down) has been done successfully " + x);
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while doing Scroll action(up/down) " + x);
			ex.printStackTrace();
		}
	}

	public void jsScrollRightLeft(int y) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + y + ",0)");
			Reports.reportStep("PASS", "Scroll action has been done successfully upto finding that " + y);
		} catch (Exception ex) {
			Reports.reportStep("FAIL", "Problem while doing Scroll action upto find that " + y);
			ex.printStackTrace();
		}
	}

	public void jsScrollUntillFound(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);
			Reports.reportStep("PASS", "Scroll action has been done successfully upto finding that " + ele);
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while doing Scroll action upto find that " + ele);
			e.printStackTrace();
		}
	}

	public void jsWebElementClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);
			Reports.reportStep("PASS", "The " + ele + " was clicked succesfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "The " + ele + " wasn't clicked succesfully");
			e.printStackTrace();
		}
	}

	public void jsTitle() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			System.out.println(js.executeScript("return document.title").toString());
			Reports.reportStep("PASS", "The title has been taken successfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while taking the title");
			e.printStackTrace();
		}

	}

	// Screenshot
	public void screenShotOperation(String Sname) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./ScreenShots/" + Sname + ".png");
			FileUtils.copyFile(source, destination);
			Reports.reportStep("PASS", "The ScreenShot has been done successfully");
		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while taking the ScreenShot ");
			e.printStackTrace();

		}
	}

	// windowhandling
	public void windowHandlingOperation() {
		try {
			String pWindow = driver.getWindowHandle();
			Set<String> windowHandle = driver.getWindowHandles();

			for (String adr : windowHandle) {

				if (!(pWindow.contentEquals(adr))) {
					driver.switchTo().window(adr);
				}
				System.out.println(adr);
				Reports.reportStep("PASS", "The window has been handled successfully");
			}

		} catch (Exception e) {
			Reports.reportStep("FAIL", "Problem while handling the window");
			e.printStackTrace();
		}
	}

}