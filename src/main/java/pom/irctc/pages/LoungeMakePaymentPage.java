package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungeMakePaymentPage extends GenericWrappers{
	
	public LoungeMakePaymentPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver;
		this.test = test;
	}

	public LoungeMakePaymentPage printTransactionID(){
		String s = GetAttributeByXpath(prop.getProperty("LoungeMakePaymentPage.printTransactionID"), "value");
		System.out.println("Transaction ID= "+s);
		return this;
		
	}
}
