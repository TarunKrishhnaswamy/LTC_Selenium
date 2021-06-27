package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver= driver;
		this.test = test;
		
	}
	
	public LoginPage clickOnAgentLogin(){
		clickByLink(prop.getProperty("HomePage.clickOnAgentLogin"));
		return new LoginPage(driver,test);
	}

}
