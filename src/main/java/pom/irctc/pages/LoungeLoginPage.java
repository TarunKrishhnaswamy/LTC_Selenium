package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungeLoginPage extends GenericWrappers {
	
	public LoungeLoginPage(RemoteWebDriver driver,ExtentTest test){
		
		this.driver = driver;
		this.test = test;
		
	}
	
	public LoungeLoginPage enterEmailID(String EmailID){
		enterByName(prop.getProperty("LoungeLoginPage.enterEmailID"), EmailID);
		return this;
		
	}
	
	public LoungeLoginPage enterMobileNumber(String MobileNo){
		enterByName(prop.getProperty("LoungeLoginPage.enterMobileNumber"), MobileNo);
		return this;
		
	}
	
	public LoungePassengerDetails clickOnSignIn(){
		
		clickByXpath(prop.getProperty("LoungeLoginPage.clickOnSignIn"));
		return new LoungePassengerDetails(driver,test);
		
	}
	
	public LoungeLoginPage sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}

}
