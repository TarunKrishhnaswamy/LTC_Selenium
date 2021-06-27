package pom.irctc.testcases;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass(){
		TestCaseName = "TC003";
		Description = "NVSP";
		authorname ="Smita";
		Category="Sample";
		dataSheetName = "TC003";
	}
	@Test
	public void NVSP(){
		new HomePage(driver,test)
		.clickOnAgentLogin()
		.mouseHoverMore()
		.clickOnNvsp()
		.switchToNvspHomePage()
		.sleep(2000)
		.clickOnRegistrationOfNewVoterDueToShiftingFromAC()
		.selectLanguage("English")
		.selectState("Assam")
		.selectDistrict("BISWANATH")
		.selectAssemblyParliamentartConstituency("BISWANATH")
		.selectDueToShiftingFromAnotherConstituency()
		.enterApplicantName("Geeta")
		.enterApplicantSurname("Phogat")
		.enterApplicantRelativeName("Ramesh")
		.enterApplicantRelativeSurname("Phogat")
		.selectApplicantsRelationWithRelative("Father")
		.selectAgeOfApplicantInYears("25")
		.selectAgeOfApplicant_MonthsCompleted("3")
		.selectGender("Female")
		.enterPresentHouseDetails("07/Phogat House")
		.enterpresentStreetDetails("Adheri Gali")
		.enterPesentTownDetails("Amreli")
		.enterPresentPostOfficeDetails("Amreli")
		.enterPincode("600097")
		.clickOnSameAsAbove()
		.enterEpicNumberIfIssued("xcbxnc")
		.enterFamilyEpicNumber("asdfgh")
		.clickOnSpeechNHearingDisability()
		.enterEmail("qwerty@gmail.com")
		.enterPhoneNo("987654321")
		.enterBirthVillage("karapakkam")
		.UploadApplicantPhotoImage("C:\\Selenium_November\\ProjctImplementation\\UploadPhoto\\Karapakkam Post Office.png")
		.sleep(2000)
		.UploadApplicantIdentityImage("C:\\Selenium_November\\ProjctImplementation\\UploadPhoto\\Wong13.jpg")
		.sleep(2000)
		.UploadApplicantAddressImage("C:\\Selenium_November\\ProjctImplementation\\UploadPhoto\\Random.jpeg")
		.enterCaptcha("2647162")
		.selectBirthState("Tamil Nadu")
		.selectBirthDistrict("COIMBATORE")
		.pressTabKeyById("applicantBirthDistrict")
		.enterDeclarationDate("11032008")
		.pressEnterKeyByXpath("//*[@id='txtRESIDENT_SINCE']")
		.pressTabKeyByXpath("//*[@id='txtRESIDENT_SINCE']")
		.selectPreviousState("Odisha")
		.selectPreviousConstituency("Sundargarh")
		.enterPreviousHouse("House")
		.enterPreviousStreet("Street")
		.enterPreviousTown("Town")
		.enterPreviousPostOffice("BISWANATH")
		.enterPreviousPincode("758035")
		.selectPreviousDistrict("Dhenkanal")
		.enterApplicantPlace("chennai");
		
	}
}
