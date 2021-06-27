package pm.irctc.testcases.datasheet;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		TestCaseName = "TC002";
		Description = "Accommodations";
		authorname ="Smita";
		Category="Sample";
		dataSheetName = "TC002";
	}
	@Test
	public void IRCTCsignup(){
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
	.enterPassengersName("Smita,Ram,Suresh")
	.enterPassengersAge("30,40,67")
	.selectPassengersGender("Female,Male,Male")
	.selectState("ANDHRA PRADESH")
	.clickOnSubmit()
	.sleep(2000)
	.verifyEmailID("qwert@gmail.com")
	.verifyMobileNumber("0987654321")
	.printBookingAmount()
	.clickOnIAgreeCheckBOX()
	.sleep(2000)
	.clickOnPayment()
	.printTransactionID();
	
	}
}
