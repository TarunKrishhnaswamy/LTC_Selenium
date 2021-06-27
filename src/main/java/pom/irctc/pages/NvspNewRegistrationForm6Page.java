package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class NvspNewRegistrationForm6Page extends GenericWrappers{
	
	public NvspNewRegistrationForm6Page(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		
	}
	
	public NvspNewRegistrationForm6Page selectLanguage(String Language){
		//selectVisibileTextById("language", Language);
		selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectLanguage"), Language);
		return this;
	}
	
	public NvspNewRegistrationForm6Page selectDistrict(String District){
		selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectDistrict"), District);
		return this;
		
	}
	
	public NvspNewRegistrationForm6Page selectState(String State){
		selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectState"), State);
		return this;
		
	}
	
	public NvspNewRegistrationForm6Page selectAssemblyParliamentartConstituency(String Constituency){
		selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectAssemblyParliamentartConstituency"), Constituency);
		return this;
	}
	
	public NvspNewRegistrationForm6Page selectAsFirstTimeVoter(){
		clickById(prop.getProperty("NvspNewRegistrationForm6Page.selectAsFirstTimeVoter"));
		return this;
		
	}
	
	public NvspNewRegistrationForm6Page selectDueToShiftingFromAnotherConstituency(){
		 clickById(prop.getProperty("NvspNewRegistrationForm6Page.selectDueToShiftingFromAnotherConstituency"));
		return this;
		
	}
	
	public NvspNewRegistrationForm6Page enterApplicantName(String Name){
		enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterApplicantName"), Name);
		return this;
		
	}
	
	public NvspNewRegistrationForm6Page enterApplicantSurname(String Surname){
		enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterApplicantSurname"), Surname);
		return this;
		
	}
   
   public NvspNewRegistrationForm6Page enterApplicantRelativeName(String RelativeName){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterApplicantRelativeName"), "Father");
	   return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterApplicantRelativeSurname(String RelativeSurname){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterApplicantRelativeSurname"), RelativeSurname);
	   return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectApplicantsRelationWithRelative(String Relation){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectApplicantsRelationWithRelative"), Relation);  
	   return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectAgeOfApplicantInYears(String Age){
	selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectAgeOfApplicantInYears"), Age);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectAgeOfApplicant_MonthsCompleted(String Months){
	selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectAgeOfApplicant_MonthsCompleted"), Months);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectGender(String Gender){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectGender"), Gender);
		return this;
		   
	   }
   
   public NvspNewRegistrationForm6Page enterPresentHouseDetails(String HouseDetails){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPresentHouseDetails"), HouseDetails);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterpresentStreetDetails(String Street){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterpresentStreetDetails"), Street);
	return this;
   }
   
   public NvspNewRegistrationForm6Page enterPesentTownDetails(String TownDetails){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPesentTownDetails"), TownDetails);
	return this;
   }
   
   public NvspNewRegistrationForm6Page enterPresentPostOfficeDetails(String PostOffice){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPresentPostOfficeDetails"), PostOffice);  
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPincode(String Pincode){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPincode"), Pincode);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page clickOnSameAsAbove(){
	clickById(prop.getProperty("NvspNewRegistrationForm6Page.clickOnSameAsAbove"));
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterEpicNumberIfIssued(String EpicNumber){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterEpicNumberIfIssued"), EpicNumber);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterFamilyEpicNumber(String FamilyEpicNumber){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterFamilyEpicNumber"), FamilyEpicNumber);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page clickOnVisuallyImpairment(){
	clickById(prop.getProperty("NvspNewRegistrationForm6Page.clickOnVisuallyImpairment"));
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page clickOnSpeechNHearingDisability(){
	clickById(prop.getProperty("NvspNewRegistrationForm6Page.clickOnSpeechNHearingDisability"));
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page clickOnLocomotiveDisability(){
	clickById(prop.getProperty("NvspNewRegistrationForm6Page.clickOnLocomotiveDisability"));
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterEmail(String Email){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterEmail"), Email);
	   return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPhoneNo(String PhoneNo){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPhoneNo"), PhoneNo);
	return this;
	   
	   
   }
   
   public NvspNewRegistrationForm6Page enterBirthVillage(String DeclarationTown){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterBirthVillage"), DeclarationTown);
	   return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectBirthState(String DeclarationState){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectBirthState"), DeclarationState);
	return this;
   }
   
   public NvspNewRegistrationForm6Page selectBirthDistrict(String DeclarationDistrict){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectBirthDistrict"), DeclarationDistrict);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterDeclarationDate(String DeclarartionDate){
	   enterByXpath(prop.getProperty("NvspNewRegistrationForm6Page.enterDeclarationDate"), DeclarartionDate);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectPreviousState(String PreviousState){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectPreviousState"), PreviousState);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectPreviousConstituency(String PreviousConstituency){
	   selectVisibileTextById(prop.getProperty("NvspNewRegistrationForm6Page.selectPreviousConstituency"), PreviousConstituency);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPreviousHouse(String PrevioushouseNo){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPreviousHouse"), PrevioushouseNo);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPreviousStreet(String PreviousStreet){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPreviousStreet"), PreviousStreet);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPreviousTown(String PreviousTown){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPreviousTown"), PreviousTown);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPreviousPostOffice(String PreviousPostOffice){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPreviousPostOffice"), PreviousPostOffice);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterPreviousPincode(String PreviousPinCode){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterPreviousPincode"), PreviousPinCode);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page selectPreviousDistrict(String PreviousDistrict){
	   selectVisibleTextByName(prop.getProperty("NvspNewRegistrationForm6Page.selectPreviousDistrict"), PreviousDistrict);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page enterApplicantPlace(String Place){
	   enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterApplicantPlace"), Place);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page pressTabKeyById(String id){
	 KeysTabById(id);
	return this;
	   
   }
   
   public NvspNewRegistrationForm6Page pressTabKeyByXpath(String xpath){
	   KeysTabByXpath(xpath);
		return this;
		   
	   }
   public NvspNewRegistrationForm6Page pressEnterKeyByXpath(String xpath){
	   KeysEnterbyXpath(xpath);
		return this;
		   
	   }
   
   public NvspNewRegistrationForm6Page sleep(long milisec){
		ThreadSleep(milisec);
		return this;
	}
   
   public NvspNewRegistrationForm6Page enterCaptcha(String Captcha){
	enterById(prop.getProperty("NvspNewRegistrationForm6Page.enterCaptcha"), Captcha);
	return this;
	   
   }
   public NvspNewRegistrationForm6Page UploadApplicantPhotoImage(String Image){
	   UploadPhotobyId(Image,prop.getProperty("NvspNewRegistrationForm6Page.UploadApplicantPhotoImage"));
		return this;
	}
   
   public NvspNewRegistrationForm6Page UploadApplicantIdentityImage(String Image){
	   UploadPhotobyId(Image,prop.getProperty("NvspNewRegistrationForm6Page.UploadApplicantIdentityImage"));
		return this;
	}
   
   public NvspNewRegistrationForm6Page UploadApplicantAddressImage(String Image){
	   UploadPhotobyId(Image,prop.getProperty("NvspNewRegistrationForm6Page.UploadApplicantAddressImage"));
		return this;
	}
   
   
   
}
