package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TourismHomePage extends GenericWrappers{
	
	public TourismHomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public LoungeHomePage clickOnStays(){
		//clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[3]/div");
		clickByXpath(prop.getProperty("TourismHomePage.clickOnStays"));
		return new LoungeHomePage(driver,test);
		
	}
	
   public SaloonCharterPage clickOnSaloonCharter(){
	//clickByXpath("//*[@id='slider-1']/div[1]/div[2]/a[8]/span");  
	   clickByXpath(prop.getProperty("TourismHomePage.clickOnSaloonCharter"));
	return new SaloonCharterPage(driver,test);
	   
   }
   
   public TourismHomePage switchToTourismHomePage(){
	switchToLastWindow();
	return this;
	   
   }
   
   public TourismHomePage sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}

}
