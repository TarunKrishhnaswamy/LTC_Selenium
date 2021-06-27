package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class NvspHomePage extends GenericWrappers {
	
	public NvspHomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public NvspHomePage switchToNvspHomePage(){
		switchToLastWindow();
		return this;
	}


	public NvspHomePage sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}
	
	public NvspNewRegistrationForm6Page clickOnRegistrationOfNewVoterDueToShiftingFromAC(){
		//clickByXpath("//*[@id='main']/div[2]/div/div/div[2]/div[1]/div[1]/div/div[2]/a");
		clickByXpath(prop.getProperty("NvspHomePage.clickOnRegistrationOfNewVoterDueToShiftingFromAC"));
		return new NvspNewRegistrationForm6Page(driver,test);
		
	}
}
