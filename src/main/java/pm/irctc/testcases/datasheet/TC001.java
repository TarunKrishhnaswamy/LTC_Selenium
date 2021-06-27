package pm.irctc.testcases.datasheet;


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
	@Test(dataProvider ="fetchData")
	public void IrctcSignUp(String Username,String Password,String SecurityQues,String SecurityAns,String FormLang,String FirstName,String MiddleName,
			String LastName,String DayOfBirth,String MonthOfBirth, String YearOfMonth,String Occupation, String AadharCardNo, String PANCard,
			String Country, String Email,String ISDMobile,String Nationality, String FlatNo,String Street,String Area,String Pincode, String Landline){
		new HomePage(driver,test)
		.clickOnAgentLogin()
		.clickOnSignUp()
		.enterUsername(Username)
		.enterPassword(Password)
		.enterConfirmPassword(Password)
		.selectSecurityQuestion(SecurityQues)
		.enterSecurityAnswer(SecurityAns)
		.selectLanguage(FormLang)
		.enterFirstName(FirstName)
		.enterMiddleName(MiddleName)
		.enterLastName(LastName)
		.clickOnFemaleAsGender()
		.clickOnUnmarriedAsMaritalStatus()
		.selectDateOfBirth(DayOfBirth)
		.selectMonthOfBirth(MonthOfBirth)
		.selectYearOfBirth(YearOfMonth)
		.selectOccupation(Occupation)
		.enterAadharCardNumber(AadharCardNo)
		.enterPANCardNumber(PANCard)
		.selectCountry(Country)
		.enterEmail(Email)
		.enterMobileNumber(ISDMobile)
		.selectNationality(Nationality)
		.enterAddress(FlatNo)
		.enterStreet(Street)
		.enterArea(Area)
		.enterPincode(Pincode)
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
		.enterPhoneNumer(Landline);

				
	}

}
