package com.telus.registerdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterDemoTestNG {
	
	public WebDriver driver;

	//Parameterizing the values
	String url = "https://nxtgenaiacademy.com/";
	String firstName = "Vinoth";
	String lastName = "Rathinam";
	String gender = "Male";
	String streetAddress = "234";
	String apartmenttNo = "213/7";
	String city = "Chennai";
	String postalCode = "600100";
	String state = "Tamil Nadu";
	String country = "India";
	String email = "vinothrwins@gmail.com";
	String dateOfDemo = "12/05/23";
	String hour = "11";
	String minutes = "30";
	String mobileNumber = "6383544892";
	String query = "End to End assigment";
	String expSuccessfulMsg = "Registration Form is Successfully Submitted.";

	@Test(priority = 1)
	public void launchApplication() {
		
		System.out.println("CI CD implemented");
		
		//Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Creating instance of chrome driver
		driver = new ChromeDriver();

		//Launching the application
		driver.get(url);

		//Maximize the browser
		driver.manage().window().maximize();

		System.out.println("Application is launched successfully");

	}

	@Test(priority = 2)
	public void navigateToRegisterDemoPage() {
		
		Actions action = new Actions(driver);

		//Hover to Demo Sites web element
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSites).perform();

		//Hover to Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		//Click on "Demo Site – Registration Form" link
		WebElement regFormLink = driver.findElement(By.partialLinkText("Registration Form"));
		regFormLink.click();
		System.out.println("Register Demo Page is displayed");
	}

	@Test(priority = 3)
	public void registerUser() {
		//Validating whether the tile displayed is "Register For Demo"
		WebElement regFormTitle = driver.findElement(By.xpath("//*[@id=\"item-vfb-1\"]/div/h3"));
		String actFormTitle = regFormTitle.getText();		
		String expFormTitle = "Register For Demo";

		if(actFormTitle.equals(expFormTitle)) {
			System.out.println("The Actual & Expected Registration Form Titles are same");
			System.out.println("The Registration Form Tile displayed is " + actFormTitle);
		}
		else {
			System.out.println("The Actual & Expected Registration Form Titles are not same");
			System.out.println("The Actual Registration Form Tile displayed is " + actFormTitle);
			System.out.println("The Expected Registration Form Tile is " + expFormTitle);
		}

		//Filling the form
		//First name text box -- Validate whether it is displayed or not and enter the value
		WebElement firstNameTxtBox = driver.findElement(By.id("vfb-5"));
		if(firstNameTxtBox.isDisplayed()) {
			System.out.println("First Name Text Box is displayed");
			firstNameTxtBox.sendKeys(firstName);
			System.out.println("First Name entered in the text box is "+ firstName);
		}
		else {
			System.out.println("First Name Text Box is not displayed");
		}

		//Last name text box -- Validate whether it is displayed or not and enter the value
		WebElement lastNameTxtBox = driver.findElement(By.id("vfb-7"));
		if(lastNameTxtBox.isDisplayed()) {
			System.out.println("Last Name Text Box is displayed");
			lastNameTxtBox.sendKeys(lastName);
			System.out.println("Last Name entered in the text box is "+ lastName);
		}
		else {
			System.out.println("Last Name Text Box is not displayed");
		}

		//Gender radio button using if else if method
		if(gender.equals("Male")) {
			WebElement maleRadioBtn = driver.findElement(By.id("vfb-31-1"));
			if(maleRadioBtn.isSelected()) {
				System.out.println("Male Radio Button is selected");						
			}
			else {
				System.out.println("Male Radio Button is not selected");
				maleRadioBtn.click();
			}

			//Validating whether male radio button is selected or not
			if(maleRadioBtn.isSelected()) {
				System.out.println("Male Radio Button is selected");						
			}
			else {
				System.out.println("Male Radio Button is not selected");
			}
		}
		else if(gender.equals("Female")) {
			WebElement femaleRadioBtn = driver.findElement(By.id("vfb-31-2"));
			if(femaleRadioBtn.isSelected()) {
				System.out.println("Female Radio Button is selected");						
			}
			else {
				System.out.println("Female Radio Button is not selected");
				femaleRadioBtn.click();
			}

			//Validating whether female radio button is selected or not
			if(femaleRadioBtn.isSelected()) {
				System.out.println("Female Radio Button is selected");						
			}
			else {
				System.out.println("Female Radio Button is not selected");
			}
		}
		else {
			WebElement otherRadioBtn = driver.findElement(By.id("vfb-31-3"));
			if(otherRadioBtn.isSelected()) {
				System.out.println("Other Radio Button is selected");						
			}
			else {
				System.out.println("Other Radio Button is not selected");
				otherRadioBtn.click();
			}

			//Validating whether other radio button is selected or not
			if(otherRadioBtn.isSelected()) {
				System.out.println("Other Radio Button is selected");						
			}
			else {
				System.out.println("Other Radio Button is not selected");
			}
		}

		//Street address text box -- Validate whether it is displayed or not and enter the value
		WebElement streetAddressTxtBox = driver.findElement(By.id("vfb-13-address"));
		if(streetAddressTxtBox.isDisplayed()) {
			System.out.println("Street Adress Text Box is displayed");
			streetAddressTxtBox.sendKeys(streetAddress);
			System.out.println("Street Adress entered in the text box is "+ streetAddress);
		}
		else {
			System.out.println("Street Adress Text Box is not displayed");
		}

		//Apartment,Suite,Bldg Text Box -- Validate whether it is displayed or not and enter the value
		WebElement aptNoTxtBox = driver.findElement(By.id("vfb-13-address-2"));
		if(aptNoTxtBox.isDisplayed()) {
			System.out.println("Apt, Suite, Bldg. Text Box is displayed");
			aptNoTxtBox.sendKeys(apartmenttNo);
			System.out.println("Apt, Suite, Bldg. No. entered in the text box is "+ apartmenttNo);
		}
		else {
			System.out.println("Apt, Suite, Bldg. Text Box is not displayed");
		}

		//City text box -- Validate whether it is displayed or not and enter the value
		WebElement cityTxtBox = driver.findElement(By.id("vfb-13-city"));
		if(cityTxtBox.isDisplayed()) {
			System.out.println("City Text Box is displayed");
			cityTxtBox.sendKeys(city);
			System.out.println("City entered in the text box is "+ city);
		}
		else {
			System.out.println("City Text Box is not displayed");
		}

		//Postal/Zip Code text box -- Validate whether it is displayed or not and enter the value
		WebElement postalCodeTxtBox = driver.findElement(By.id("vfb-13-zip"));
		if(postalCodeTxtBox.isDisplayed()) {
			System.out.println("Postal/Zip Code Text Box is displayed");
			postalCodeTxtBox.sendKeys(postalCode);
			System.out.println("Postal/Zip Code entered in the text box is "+ postalCode);
		}
		else {
			System.out.println("Postal/Zip Code Text Box is not displayed");
		}

		//State/province/region text box -- Validate whether it is displayed or not and enter the value
		WebElement stateTxtBox = driver.findElement(By.id("vfb-13-state"));
		if(stateTxtBox.isDisplayed()) {
			System.out.println("State Text Box is displayed");
			stateTxtBox.sendKeys(state);
			System.out.println("State entered in the text box is "+ state);
		}
		else {
			System.out.println("State Text Box is not displayed");
		}

		//Country DropDown -- Validate whether it is displayed or not and selecting the value
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country Drop Down is displayed");
			Select cDropDown = new Select(countryDropDown);
			cDropDown.selectByVisibleText(country);
			System.out.println("Country selected from the drop down is "+ country);
		}
		else {
			System.out.println("Country Drop Down is not displayed");
		}

		//Email text box -- Validate whether it is displayed or not and enter the value
		WebElement emailTxtBox = driver.findElement(By.id("vfb-14"));
		if(emailTxtBox.isDisplayed()) {
			System.out.println("Email Text Box is displayed");
			emailTxtBox.sendKeys(email);
			System.out.println("Email entered in the text box is "+ email);
		}
		else {
			System.out.println("Email Text Box is not displayed");
		}

		//Date of Demo Text box -- Validate whether it is displayed or not and enter the value
		WebElement dateOfDemoTxtBox = driver.findElement(By.id("vfb-18"));
		if(dateOfDemoTxtBox.isDisplayed()) {
			System.out.println("Date of Demo Text Box is displayed");
			dateOfDemoTxtBox.sendKeys(dateOfDemo);
			System.out.println("Date of Demo entered in the text box is "+ dateOfDemo);
		}
		else {
			System.out.println("Date of Demo Text Box is not displayed");
		}

		//Convenient Hour Drop Down -- Validate whether it is displayed or not and selecting the value
		WebElement convenientHour = driver.findElement(By.id("vfb-16-hour"));
		if(convenientHour.isDisplayed()) {
			System.out.println("Convenient Hour Drop Down is displayed");
			Select myhours = new Select(convenientHour);
			myhours.selectByVisibleText(hour);
			System.out.println("Convenient Hour selected from the drop down is "+ hour);	
		}
		else {
			System.out.println("Convenient Hour Drop Down is not displayed");
		}

		//Convenient Minute Drop Down -- Validate whether it is displayed or not and selecting the value
		WebElement convenientMinute = driver.findElement(By.id("vfb-16-min"));
		if(convenientMinute.isDisplayed()) {
			System.out.println("Convenient Minutes Drop Down is displayed");
			Select myMinutes = new Select(convenientMinute);
			myMinutes.selectByVisibleText(minutes);
			System.out.println("Convenient Minutes selected from the drop down is "+ minutes);	
		}
		else {
			System.out.println("Convenient Minutes Drop Down is not displayed");
		} 

		System.out.println("Convenient Time selected from the drop down is "+ hour + "hours and "+ minutes + "minutes");

		//Mobile Number Text Box -- Validate whether it is displayed or not and enter the value
		WebElement mobileNoTxtBox = driver.findElement(By.id("vfb-19"));
		if(mobileNoTxtBox.isDisplayed()) {
			System.out.println("Mobile Number Text Box is displayed");
			mobileNoTxtBox.sendKeys(mobileNumber);
			System.out.println("Mobile Number entered in the text box is "+ mobileNumber);
		}
		else {
			System.out.println("Mobile Number Text Box is not displayed");
		}

		//Courses Interested Checkboxes
		//TestNg Check Box
		WebElement testNgChkBox = driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]"));

		//Validating whether testng checkbox is selected or not and selecting it if not selected
		if(testNgChkBox.isSelected()) {
			System.out.println("TestNG checkbox is selected");
		}
		else {
			System.out.println("TestNG checkbox is not selected");
			//Selecting the TestNg checkbox
			testNgChkBox.click();
		}

		//Validating whether testng checkbox is selected or not
		if(testNgChkBox.isSelected()) {
			System.out.println("TestNG checkbox is selected");
		}
		else {
			System.out.println("TestNG checkbox is not selected");
		}

		//Core Java Check Box 
		WebElement coreJavaChkBox = driver.findElement(By.id("vfb-20-3"));

		//Validating whether Core Java checkbox is selected or not and selecting it if not selected
		if(coreJavaChkBox.isSelected()) {
			System.out.println("Core Java checkbox is selected");
		}
		else {
			System.out.println("Core Java checkbox is not selected");
			//Selecting the Core Java checkbox
			coreJavaChkBox.click();
		}

		//Validating whether Core Java checkbox is selected or not
		if(coreJavaChkBox.isSelected()) {
			System.out.println("Core Java checkbox is selected");
		}
		else {
			System.out.println("Core Java checkbox is not selected");
		}

		//Enter your query Text Box -- Validate whether it is displayed or not and enter the value
		WebElement enterQuery = driver.findElement(By.id("vfb-23"));
		if(enterQuery.isDisplayed()) {
			System.out.println("Enter Your Query Text Box is displayed");
			enterQuery.sendKeys(query);
			System.out.println("Query entered in the text box is "+ query);
		}
		else {
			System.out.println("Enter Your Query Text Box is not displayed");
		}

		//Verification Text Box -- Validate whether it is displayed or not and enter the dynamic value
		WebElement verificationTxtBox = driver.findElement(By.id("vfb-3"));		
		if(verificationTxtBox.isDisplayed()) {
			System.out.println("Verification Text Box is displayed");
			//Retrieving the value and splitting it
			String exampletwoDigits[] = driver.findElement(By.xpath("//label[normalize-space()='Example: 99']")).getText().split(":");
			String twoDigits = exampletwoDigits[1].trim();
			verificationTxtBox.sendKeys(twoDigits);
			System.out.println("Two digits entered in the text box is "+ twoDigits);
		}
		else {
			System.out.println("Verification Text Box is not displayed");
		}

		//Submit Button -- Validate whether it is enabled or not and Click on Submit Button
		WebElement submitBtn = driver.findElement(By.id("vfb-4"));
		if(submitBtn.isEnabled()) {
			System.out.println("Submit Button is enabled");
			submitBtn.click();
		}
		else {
			System.out.println("Submit Button is disabled");
		}
	}

	@Test(priority = 4)
	public void validateSuccessfulMsg() {
		//Validating the successful message
		String text = driver.findElement(By.xpath("//div[@class='elementor-widget-container']")).getText();
		String message[] = text.split("Verification");
		String successfulMsg[] = message[1].split("The");
		String actSuccessfulMsg = successfulMsg[0].trim();

		if(actSuccessfulMsg.equals(expSuccessfulMsg)) {
			System.out.println("The Actual and Expected Successful Messages are same");
			System.out.println("The Actual Successful Message is " + actSuccessfulMsg);
		}
		else {
			System.out.println("The Actual and Expected Successful Messages are not same");
			System.out.println("The Actual Successful Message is " + actSuccessfulMsg);
			System.out.println("The Expected Successful Message is " + expSuccessfulMsg);
		}

		//Display the transaction number in the output
		String transactionMsg[] = successfulMsg[1].trim().split(":");
		String transactionId = transactionMsg[1].trim();

		System.out.println("The Transaction Id : " + transactionId);

	}

	@Test(priority = 5)
	public void closeApplication() {
		//Close the browser driver
		driver.quit();
		System.out.println("Application is closed");
	}

}
