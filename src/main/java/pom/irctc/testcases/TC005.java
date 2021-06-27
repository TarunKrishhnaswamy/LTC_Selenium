package pom.irctc.testcases;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		TestCaseName = "TC005";
		Description = "Accomodations_GST_Validation";
		authorname ="Smita";
		Category="Sample";
		dataSheetName = "TC005";
	}
	@Test
	public void Accomodations_GST_Validation(){
		new HomePage(driver,test)
		.clickOnAgentLogin()
		.mouseHoverTourism()
		.mouseHoverStays()
		.clickOnLounge()
		.switchToTourismHomePage()
		.sleep(2000)
		.clickOnStays()
		.sleep(3000)
		.selectStationName("VISAKHAPATNAM")
		.pressTabKeyByName("city")
		.selectLounge("TRAVEL CLUB LOUNGE")
		.selectNumberOfPersons("3")
		.selectCheckInDate() //Entering the xpath of date
		.selectCheckInTime("12:00 HH:MM")
		.selectDuration("18:00 Hours")
		.sleep(3000)
		.clickOnBook()
		.sleep(3000)
		.enterEmailID("qwert@gmail.com")
		.enterMobileNumber("0987654321")
		.clickOnSignIn()
		.scrollingThepage()
		.selectGST("Yes")
		.enterGSTNumber("274824")
		.enterPassengersName("Smita,Ram,Suresh")
		.enterPassengersAge("30,40,67")
		.selectPassengersGender("Female,Male,Male")
		.selectState("ANDHRA PRADESH")
		.clickOnSubmitforError()
		.verifyErrorMessageforInvalidGSTNumber();
	}

}
