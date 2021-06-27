package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungeHomePage extends GenericWrappers{
	
	public LoungeHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    
	public LoungeHomePage switchToLoungeHomePage(){
		switchToLastWindow();
		return this;
		   
	   }
	
	 public LoungeHomePage pressTabKeyByName(String Name){
		   KeysTabByName(Name);
		return this; 
	   }
	 
	 public LoungeHomePage sleep(long milisec){
			ThreadSleep(milisec);
			return this;
		}
	 
	public LoungeHomePage selectStationName(String station){
		//selectVisibleTextByName("city", station);
		selectVisibleTextByName(prop.getProperty("LoungeHomePage.selectStationName"), station);
		return this;
		
	}
	
	public LoungeHomePage selectLounge(String lounge){
		//selectVisibleTextByName("laungecity", lounge);
		selectVisibleTextByName(prop.getProperty("LoungeHomePage.selectLounge"), lounge);
		return this;
		
	}
	
	public LoungeHomePage selectNumberOfPersons(String NumberOfPersons){
		//selectValueByName("selPassangers",NumberOfPersons);
		selectValueByName(prop.getProperty("LoungeHomePage.selectNumberOfPersons"),NumberOfPersons);
		return this;
		
	}
	
	public LoungeHomePage selectCheckInDate(){
		//clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/input");
		clickByXpath(prop.getProperty("LoungeHomePage.selectCheckInDate_NextMonthArrow"));
		//clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/table/tbody/tr[6]/td[2]/span");
		clickByXpath(prop.getProperty("LoungeHomePage.selectCheckInDate_Date"));
		return this;
		
	}
	
	public LoungeHomePage selectCheckInTime(String CheckInTime){
		//selectVisibleTextByName("checkInTime", CheckInTime);
		selectVisibleTextByName(prop.getProperty("LoungeHomePage.selectCheckInTime"), CheckInTime);
		return this;
		
	}
	
	public LoungeHomePage selectDuration(String duration){
		//selectVisibleTextByName("checkOutTime", duration);
		selectVisibleTextByName(prop.getProperty("LoungeHomePage.selectDuration"), duration);
		return this;
		
	}
	
	public LoungeLoginPage clickOnBook(){
		//clickByXpath("//*[@id='slider-1']/div[1]/div/div/div/div[1]/div[1]/div[2]/form/div/div[10]/button[2]");
		clickByXpath(prop.getProperty("LoungeHomePage.clickOnBook"));
		return new LoungeLoginPage(driver,test);
		
	}
}
