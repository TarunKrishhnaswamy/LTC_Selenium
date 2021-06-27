package pom.irctc.testcases;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
//import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	@BeforeClass
public void beforeClass(){
	TestCaseName = "TC001";
	Description = "Irctc SignUp";
	authorname ="Smita";
	Category="Sample";
	dataSheetName = "TC001";
}
	@Test
	public void IrctcSignUp(){
		new HomePage(driver,test)
		.clickOnAgentLogin()
		.clickOnSignUp()
		.enterUsername("Smita")
		.enterPassword("Test123")
		.enterConfirmPassword("Test123")
		.selectSecurityQuestion("What is your all time favorite sports team?")
		.enterSecurityAnswer("jqwte")
		.selectLanguage("English")
		.enterFirstName("Smita")
		.enterMiddleName(".")
		.enterLastName("Mahanta")
		.clickOnFemaleAsGender()
		.clickOnUnmarriedAsMaritalStatus()
		.selectDateOfBirth("01")
		.selectMonthOfBirth("03")
		.selectYearOfBirth("1998")
		.selectOccupation("Private")
		.enterAadharCardNumber("72738270")
		.enterPANCardNumber("33674673634")
		.selectCountry("India")
		.enterEmail("abcd.1@gmail.com")
		.enterMobileNumber("9876543210")
		.selectNationality("India")
		.enterAddress("4/block C")
		.enterStreet("karapakkam")
		.enterArea("chennai")
		.enterPincode("600097")
		.pressTabKeyById("userRegistrationForm:pincode")
		.sleep(3000)
		.selectCity("city")
		.pressArrowDownKeysById("userRegistrationForm:cityName")
		.pressEnterKeysById("userRegistrationForm:cityName")
		.pressEnterKeysById("userRegistrationForm:cityName")
		.sleep(2000)
		.selectPostOffice("PostOffice")
		.pressArrowDownKeysById("userRegistrationForm:postofficeName")
		.pressEnterKeysById("userRegistrationForm:postofficeName")
		.enterPhoneNumer("487362462");

				
	}

}
