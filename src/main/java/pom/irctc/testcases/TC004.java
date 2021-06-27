package pom.irctc.testcases;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass(){
		TestCaseName = "TC004";
		Description = "SaloonMandatoryCheck";
		authorname ="Smita";
		Category="Sample";
		dataSheetName = "TC004";
	}
	@Test
	public void SaloonMandatoryCheck(){
		new HomePage(driver,test)
		.clickOnAgentLogin()
		.mouseHoverTourism()
		.mouseHoverStays()
		.clickOnLounge()
		.switchToTourismHomePage()
		.clickOnSaloonCharter()
		.switchToSaloonCharterPage()
		.sleep(3000)
		.clickOnEnquiryForm()
		.enterName("wyuwwew")
		.enterOrganization("organization")
		.enterAddress("14th wall street")
		.pressTabKeyByName("address")
		.enterMobileNumber("09876453210")
		.enterEmailID("qwtw@gmail.com")
		.selectRequestFor(1)
		.enterOriginationStation("chennai")
		.enterDestinationStation("Shimla")
		.pressTabKeyByName("destnStation")
		.selectDateOfDeparture()
		.selectDateOfArrivalBackAtOriginationStation()
		.enterDurationPeriod("5")
		.enterCoachDetails("ahdjsha")
		.enterNumberOfPassengers("3")
		.enterPurposeOfCharter("hasdjasg")
		.clickOnSubmitToVerifyError()
		.verifyErrormessageAfterSubmit();
		
	}
}
