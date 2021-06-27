package wrappers;


//import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataSheet;

public class ProjectWrappers extends GenericWrappers{
	public String dataSheetName;
@BeforeSuite	
public void startingAReport(){
	startReport();
	}
@BeforeTest
public void GetTheLocators(){
	loadObjects();
}
	@BeforeMethod
public void LaunchURL(){
		startTest(TestCaseName, Description);
		test.assignAuthor(authorname);
		test.assignCategory(Category);
		//invokeApp("Chrome", "https://www.irctc.co.in/nget/train-search");
		invokeApp("Chrome");
		//clickByLink("AGENT LOGIN");
		System.out.println("Chrome is opened");
    }
	
	@AfterMethod
	public void CloseAllBrowser(){
		closeAllBrowsers();
		System.out.println("Chrome is closed");
	}
	
	@AfterClass
	public void endTestCase(){
		report.endTest(test);
	}
	
	@AfterTest
	public void unloadObj(){
		unloadObjects();
	}
	
	@AfterSuite
	public void EndingAReport(){
		endReport();
	}
	
	@ DataProvider(name = "fetchData")
	public String[][] inputData() throws IOException{
		
		return DataSheet.getdata(dataSheetName);
	}
}
