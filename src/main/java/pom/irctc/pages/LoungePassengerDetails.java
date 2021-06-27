package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungePassengerDetails extends GenericWrappers {
	
	public LoungePassengerDetails(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public LoungePassengerDetails scrollingThepage(){
		//clickByXpath("//*[@id='gulogin-form']/div[3]/div/input");
		clickByXpath(prop.getProperty("LoungePassengerDetails.scrollingThepage"));
		return this;
		
	}
	
	public LoungePassengerDetails selectGST(String GST){
		//selectVisibleTextByName("gstGet", GST);
		selectVisibleTextByName(prop.getProperty("LoungePassengerDetails.selectGST"), GST);
		return this;
		
	}
	
	public LoungePassengerDetails enterGSTNumber(String GSTNumber){
		//enterByName("gstNo", GSTNumber);
		enterByName(prop.getProperty("LoungePassengerDetails.enterGSTNumber"), GSTNumber);
		return this;
		
	}
	public LoungePassengerDetails enterPassengersName(String Names){
		int len = Names.split(",").length;
		String Pn[] = Names.split(",");
		for(int i=1;i<=len;i++){
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+i+"]/td[2]/div/input", Pn[i-1]);
			//enterByXpath(prop.getProperty("LoungePassengerDetails.enterPassengersName"), Pn[i-1]);
		}
		
		return this;
		
	}

	public LoungePassengerDetails enterPassengersAge(String Ages){
		int len = Ages.split(",").length;
		String Pa[] = Ages.split(",");
		for(int i=1;i<=len;i++){
			enterByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+i+"]/td[3]/div/input", Pa[i-1]);
			//enterByXpath(prop.getProperty("LoungePassengerDetails.enterPassengersAge"), Pa[i-1]);
		}
		
		return this;
		
	}
	
	public LoungePassengerDetails selectPassengersGender(String Gender){
		int len = Gender.split(",").length;
		String Pg[] = Gender.split(",");
		for(int i=1;i<=len;i++){
			selectVisibleTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[2]/table/tbody/tr["+i+"]/td[4]/div/select", Pg[i-1]);
			//selectVisibleTextByXpath(prop.getProperty("LoungePassengerDetails.selectPassengersGender"), Pg[i-1]);
		}
		
		return this;
		
	}
	
	public LoungePassengerDetails selectState(String State){
		//selectVisibleTextByName("state", State);
		selectVisibleTextByName(prop.getProperty("LoungePassengerDetails.selectState"), State);
		return this;
		
	}
	
	public LoungeSummaryPage clickOnSubmit(){
		//clickByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]");
		clickByXpath(prop.getProperty("LoungePassengerDetails.clickOnSubmit"));
		return new LoungeSummaryPage(driver,test);
		
	}
	
	public LoungePassengerDetails clickOnSubmitforError(){
		//clickByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[5]/button[3]");
		clickByXpath(prop.getProperty("LoungePassengerDetails.clickOnSubmit"));
		return this;
		
	}
	
	public LoungePassengerDetails sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}
	
	public LoungePassengerDetails verifyErrorMessageforInvalidGSTNumber(){
		//verifyTextByXpath("/html/body/app-root/acpassangers/section[2]/div/div/div/div[3]/form/div[1]/div[2]/span", "Please Enter Valid GSt number");
		verifyTextByXpath(prop.getProperty("LoungePassengerDetails.verifyErrorMessageforInvalidGSTNumber"), "Please Enter Valid GSt number");
		return this;
		
	}
	
}
