package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
public LoginPage(RemoteWebDriver driver,ExtentTest test){
	this.driver= driver;
	this.test = test;
}

public SignUpPage clickOnSignUp(){
	//clickByLink("Sign up");
	clickByLink(prop.getProperty("LoginPage.clickOnSignUp"));
	return new SignUpPage(driver,test);
	
}

public LoginPage mouseHoverTourism(){
	//MousehoverByXpath("//*[@id='bluemenu']/ul/li[2]/a");
	MousehoverByXpath(prop.getProperty("LoginPage.mouseHoverTourism"));
	return this;
	
}

public LoginPage mouseHoverStays(){
	//MousehoverByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
	MousehoverByXpath(prop.getProperty("LoginPage.mouseHoverStays"));
	return this;
	
}

public LoginPage mouseHoverMore(){
	//MousehoverByXpath("//*[@id='bluemenu']/ul/li[6]/a");
	MousehoverByXpath(prop.getProperty("LoginPage.mouseHoverMore"));
	return this;
	
}

public TourismHomePage clickOnLounge(){
	//clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a");
	clickByXpath(prop.getProperty("LoginPage.clickOnLounge"));
	return new TourismHomePage(driver,test);
	
}
public NvspHomePage clickOnNvsp(){
	//clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
	clickByXpath(prop.getProperty("LoginPage.clickOnNvsp"));
	return new NvspHomePage(driver,test);
	
}


}
