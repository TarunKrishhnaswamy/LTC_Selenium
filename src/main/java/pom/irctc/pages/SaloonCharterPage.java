package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SaloonCharterPage extends GenericWrappers{
	
	public SaloonCharterPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
	}

	public SaloonCharterPage switchToSaloonCharterPage(){
		switchToLastWindow();
		return this;
		   
	   }
	   
	   public SaloonCharterPage sleep(long milisec){
			ThreadSleep(milisec);
			return this;
		}
	   
   public SaloonCharterPage clickOnEnquiryForm(){
	//clickByXpath ("//a[contains(text(),'Enquiry Form')]");
	  clickByXpath (prop.getProperty("SaloonCharterPage.clickOnEnquiryForm"));
	return this;
	   
   }
   
   public SaloonCharterPage enterName(String Name){
	//enterByName("name", Name);
	   enterByName(prop.getProperty("SaloonCharterPage.enterName"), Name);
	return this;
   }
   
   public SaloonCharterPage enterOrganization(String Organization){
	enterByName(prop.getProperty("SaloonCharterPage.enterOrganization"), Organization);
	return this;
	   
   }
   
   public SaloonCharterPage enterAddress(String Address){
	enterByName(prop.getProperty("SaloonCharterPage.enterAddress"), Address);
	return this;
   }
   
   public SaloonCharterPage pressTabKeyByName(String Name){
	   KeysTabByName(Name);
	return this; 
   }
   
   public SaloonCharterPage enterMobileNumber(String Mobile){
	   enterByName(prop.getProperty("SaloonCharterPage.enterAddress"), Mobile);
	return this;
	   
   }
   
   public SaloonCharterPage enterEmailID(String Email){
	   enterByName(prop.getProperty("SaloonCharterPage.enterEmailID"), Email);
	return this;
	   
   }
   
   public SaloonCharterPage selectRequestFor(int IndexOfRequestFor){
	selectIndexByName(prop.getProperty("SaloonCharterPage.selectRequestFor"), IndexOfRequestFor);
	return this;
	   
   }
   
   public SaloonCharterPage enterOriginationStation(String OriginStation){
	enterByName(prop.getProperty("SaloonCharterPage.enterOriginationStation"), OriginStation);
	return this;
	   
   }
   
   public SaloonCharterPage enterDestinationStation(String DestnStation){
	enterByName(prop.getProperty("SaloonCharterPage.enterDestinationStation"), DestnStation);
	return this;
	   
   }
   
   public SaloonCharterPage selectDateOfDeparture(){
	   //clickByXpath("//*[@id='Saloon-wrap']/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]");
	   clickByXpath(prop.getProperty("SaloonCharterPage.selectDateOfDeparture_NextMonthArrow"));
		clickByXpath(prop.getProperty("SaloonCharterPage.selectDateOfDeparture_Date"));
		//KeysTabByName("checkInDate");
		KeysTabByName(prop.getProperty("SaloonCharterPage.selectDateOfDeparture.KeysTabByName"));
	return this;
	   ////*[@id="Saloon-wrap"]/div[4]/div/div/table/thead/tr[1]/th[3]/span[1]
	   ////*[@id="Saloon-wrap"]/div[4]/div/div/table/tbody/tr[4]/td[5]/span
	////*[@id="Saloon-wrap"]/div[4]/div/div/table/tbody/tr[5]/td[5]/span
   }
   
   public SaloonCharterPage selectDateOfArrivalBackAtOriginationStation(){
	  /* clickByXpath("//*[@id='Saloon-wrap']/div[5]/div/div/table/thead/tr[1]/th[3]/span[1]");
		clickByXpath("//*[@id='Saloon-wrap']/div[5]/div/div/table/thead/tr[1]/th[3]/span[1]");
		clickByXpath("//*[@id='Saloon-wrap']/div[5]/div/div/table/tbody/tr[3]/td[5]/span");*/
	   clickByXpath(prop.getProperty("SaloonCharterPage.selectDateOfArrivalBackAtOriginationStation"));
	   clickByXpath(prop.getProperty("SaloonCharterPage.selectDateOfArrivalBackAtOriginationStation_NextMonthArrow"));
	   clickByXpath(prop.getProperty("SaloonCharterPage.selectDateOfArrivalBackAtOriginationStation_Date"));
	return this;
	   
   }
   
   public SaloonCharterPage enterDurationPeriod(String DurationPeriod){
	// enterByName("durationPeriod", DurationPeriod);
	   enterByName(prop.getProperty("SaloonCharterPage.enterDurationPeriod"), DurationPeriod);
	return this;
	   
   }
   
   public SaloonCharterPage enterCoachDetails(String CoachDetails){
	enterByName(prop.getProperty("SaloonCharterPage.enterCoachDetails"), CoachDetails);
	return this;
	   
   }
   
   public SaloonCharterPage enterNumberOfPassengers(String NumPassenger){
	   enterByName(prop.getProperty("SaloonCharterPage.enterNumberOfPassengers"), NumPassenger);
	return this;
	   
   }
   
   public SaloonCharterPage enterPurposeOfCharter(String CharterPurpose){
	   enterByName(prop.getProperty("SaloonCharterPage.enterPurposeOfCharter"), CharterPurpose);
	return this;
	   
   }
   
   public SaloonCharterPage clickOnSubmitToVerifyError(){
	//clickByXpath("//form[contains(@class,'ng-invalid ng-dirty ng-touched')]//button[contains(text(),'Submit')]");
	   clickByXpath(prop.getProperty("SaloonCharterPage.clickOnSubmitToVerifyError"));
	return this;
   }
   
   public SaloonCharterPage verifyErrormessageAfterSubmit(){
	   
	 //  String s= getTextByXpath("//form[contains(@class,'ng-invalid ng-dirty ng-touched')]/div[9]/span");
	   String s= getTextByXpath(prop.getProperty("SaloonCharterPage.verifyErrormessageAfterSubmit"));
		if (s.equals("This field is required."))
			System.out.println("'This field is required.'  is displayed below Additional Service Required filed.");
		else
			System.out.println("'This field is required.'  is not displayed below Additional Service Required filed.");
		return this;
	}
   
}
