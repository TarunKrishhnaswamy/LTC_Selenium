package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungeSummaryPage extends GenericWrappers{
	
	public LoungeSummaryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public LoungeSummaryPage verifyEmailID(String EmailID){
		//verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[1]/span", EmailID);
		verifyTextByXpath(prop.getProperty("LoungeSummaryPage.verifyEmailID"), EmailID);
		return this;
		
	}
	
	public LoungeSummaryPage verifyMobileNumber(String MobileNo){
		//verifyTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[2]/div[2]/span", MobileNo);
		verifyTextByXpath(prop.getProperty("LoungeSummaryPage.verifyMobileNumber"), MobileNo);
		return this;
		
	}
   
	public LoungeSummaryPage printBookingAmount(){
		//String Amount = getTextByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[3]/div[3]/span");
		String Amount = getTextByXpath(prop.getProperty("LoungeSummaryPage.printBookingAmount"));
		System.out.println(Amount);
		return this;
		
	}
	
	public LoungeSummaryPage clickOnIAgreeCheckBOX(){
		//clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[1]/label/span/span");
		clickByXpath(prop.getProperty("LoungeSummaryPage.clickOnIAgreeCheckBOX"));
		return this;
		
	}
	public LoungeSummaryPage sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}
	
	public LoungeMakePaymentPage clickOnPayment(){
		//clickByXpath("/html/body/app-root/acsummery/section[2]/div/div/div/div[3]/form/div[5]/div[2]/button");
		clickByXpath(prop.getProperty("LoungeSummaryPage.clickOnPayment"));
		return new LoungeMakePaymentPage(driver,test);
		
	}
}
