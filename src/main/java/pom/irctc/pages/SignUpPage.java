package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {
	
public SignUpPage(RemoteWebDriver driver,ExtentTest test){
	this.driver = driver;
	this.test = test;
}
	
public SignUpPage enterUsername(String username){
	//enterById("userRegistrationForm:userName", username);
	enterById(prop.getProperty("SignUpPage.enterUsername"), username);
	return this;
}

public SignUpPage enterPassword(String Password){
	//enterById("userRegistrationForm:password", Password);
	enterById(prop.getProperty("SignUpPage.enterPassword"), Password);
	return this;
	
}

public SignUpPage enterConfirmPassword(String Password) {
	//enterById("userRegistrationForm:confpasword", Password);
	enterById(prop.getProperty("SignUpPage.enterConfirmPassword"), Password);
	return this;
	
}

public SignUpPage selectSecurityQuestion(String Question){
	//selectVisibileTextById("userRegistrationForm:securityQ", Question);
	selectVisibileTextById(prop.getProperty("SignUpPage.selectSecurityQuestion"), Question);
	return this;
	
} 

public SignUpPage enterSecurityAnswer(String SecAnswer){
	//enterById("userRegistrationForm:securityAnswer", SecAnswer);
	enterById(prop.getProperty("SignUpPage.enterSecurityAnswer"), SecAnswer);
	return this;
	
} 
public SignUpPage selectLanguage(String Language){
	//selectVisibileTextById("userRegistrationForm:prelan", Language);
	selectVisibileTextById(prop.getProperty("SignUpPage.selectLanguage"), Language);
	return this;
	
} 

public SignUpPage enterFirstName(String FirstName){
	//enterById("userRegistrationForm:firstName", FirstName);
	enterById(prop.getProperty("SignUpPage.enterFirstName"), FirstName);
	return this;
	
}

public SignUpPage enterMiddleName(String MiddleName){
	//enterById("userRegistrationForm:middleName", MiddleName);
	enterById(prop.getProperty("SignUpPage.enterMiddleName"), MiddleName);
	return this;
	
}

public SignUpPage enterLastName(String LastName){
	//enterById("userRegistrationForm:lastName", LastName);
	enterById(prop.getProperty("SignUpPage.enterLastName"), LastName);
	return this;
	
}

public SignUpPage clickOnMaleAsGender(){
	//clickById("userRegistrationForm:gender:0");
	clickById(prop.getProperty("SignUpPage.clickOnMaleAsGender"));
	return this;
	
}
public SignUpPage clickOnFemaleAsGender(){
	//clickById("userRegistrationForm:gender:1");
	clickById(prop.getProperty("SignUpPage.clickOnFemaleAsGender"));
	return this;
	
}
public SignUpPage clickOnTrangenderAsGender(){
	//clickById("userRegistrationForm:gender:2");
	clickById(prop.getProperty("SignUpPage.clickOnTrangenderAsGender"));
	return this;
	
}
public SignUpPage clickOnMarriedAsMaritalStatus(){
	//clickById("userRegistrationForm:maritalStatus:0");
	clickById(prop.getProperty("SignUpPage.clickOnMarriedAsMaritalStatus"));
	return this;
	
}

public SignUpPage clickOnUnmarriedAsMaritalStatus(){
//	clickById("userRegistrationForm:maritalStatus:1");
	clickById(prop.getProperty("SignUpPage.clickOnUnmarriedAsMaritalStatus"));
	return this;
	
}
public SignUpPage selectDateOfBirth(String date){
	//selectValueById("userRegistrationForm:dobDay", date);
	selectValueById(prop.getProperty("SignUpPage.selectDateOfBirth"), date);
	return this;
	
}

public SignUpPage selectMonthOfBirth(String Month){
	//selectValueById("userRegistrationForm:dobMonth", Month);
	selectValueById(prop.getProperty("SignUpPage.selectMonthOfBirth"), Month);
	return this;
	
}
public SignUpPage selectYearOfBirth(String Year){
	//selectValueById("userRegistrationForm:dateOfBirth", Year);
	selectValueById(prop.getProperty("SignUpPage.selectYearOfBirth"), Year);
	return this;	
}

public SignUpPage selectOccupation(String Occupation){
	//selectVisibileTextById("userRegistrationForm:occupation", Occupation);
	selectVisibileTextById(prop.getProperty("SignUpPage.selectOccupation"), Occupation);
	return this;
	
}
public SignUpPage enterAadharCardNumber(String AadharNumber){
	//enterById("userRegistrationForm:uidno", AadharNumber);
	enterById(prop.getProperty("SignUpPage.enterAadharCardNumber"), AadharNumber);
	return this;
	
}
public SignUpPage enterPANCardNumber(String PANNumber){
	//enterById("userRegistrationForm:idno", PANNumber);
	enterById(prop.getProperty("SignUpPage.enterPANCardNumber"), PANNumber);
	return this;
	
}

public SignUpPage selectCountry(String Country){
	//selectVisibileTextById("userRegistrationForm:countries", Country);
	selectVisibileTextById(prop.getProperty("SignUpPage.selectCountry"), Country);
	return this;
}

public SignUpPage enterEmail(String Email){
	//enterById("userRegistrationForm:email", Email);
	enterById(prop.getProperty("SignUpPage.enterEmail"), Email);
	return this;
}

public SignUpPage enterMobileNumber(String MobileNumber){
	//enterById("userRegistrationForm:mobile", MobileNumber);
	enterById(prop.getProperty("SignUpPage.enterMobileNumber"), MobileNumber);
	return this;
	
}

public SignUpPage selectNationality(String Nationality){
	//selectVisibileTextById("userRegistrationForm:nationalityId", Nationality);
	selectVisibileTextById(prop.getProperty("SignUpPage.selectNationality"), Nationality);
	return this;
	
}

public SignUpPage enterAddress(String Address){
	//enterById("userRegistrationForm:address", Address);
	enterById(prop.getProperty("SignUpPage.enterAddress"), Address);
	return this;
	
}

public SignUpPage enterStreet(String Street){
	//enterById("userRegistrationForm:street", Street);
	enterById(prop.getProperty("SignUpPage.enterStreet"), Street);
	return this;
	
}

public SignUpPage enterArea(String Area){
	//enterById("userRegistrationForm:area", Area);
	enterById(prop.getProperty("SignUpPage.enterArea"), Area);
	return this;
	
}

public SignUpPage enterPincode(String Pincode){
	//enterById("userRegistrationForm:pincode", Pincode);
	enterById(prop.getProperty("SignUpPage.enterPincode"), Pincode);
	return this;
	
}

public SignUpPage pressTabKeyById(String id){
	KeysTabById(id);
	return this;
	
}

public SignUpPage pressArrowDownKeysById(String id){
	KeysArrowDownById(id);
	return this;
	
}

public SignUpPage pressEnterKeysById(String id){
	KeysEnterById(id);
	return this;
	
}


public SignUpPage selectCity(String city){
	//clickById("userRegistrationForm:cityName");
	clickById(prop.getProperty("SignUpPage.selectCity"));
	return this;
	
}

public SignUpPage selectPostOffice(String PostOffice){
	//clickById("userRegistrationForm:postofficeName");
	clickById(prop.getProperty("SignUpPage.selectPostOffice"));
	return this;
	
}

public SignUpPage enterPhoneNumer(String PhoneNo){
	//enterById("userRegistrationForm:landline", PhoneNo);
	enterById(prop.getProperty("SignUpPage.enterPhoneNumer"), PhoneNo);
	return this;
	
}

public SignUpPage sleep(long milisec){
	ThreadSleep(milisec);
	return this;
}
}
