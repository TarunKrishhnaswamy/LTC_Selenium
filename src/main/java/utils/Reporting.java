package utils;

import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	public static ExtentReports report;
	public ExtentTest test;
	public String Description,TestCaseName,authorname,Category;
	public void startReport(){
		 report = new ExtentReports("./reports/TestCases.html", false);
		}
	
	public void startTest(String TestCaseName,String Description){
		test = report.startTest(TestCaseName, Description);
	}
	
	
	public void reportStep(String details,String status, boolean snap){
		
		if(snap){
			if(status.equalsIgnoreCase("pass")){
				test.log(LogStatus.PASS, details);
			}}
	}
	
	
	
	public void reportStep(String details,String status){
		long number = 100000l;
		number = TakeSnap();
		if(status.equalsIgnoreCase("pass")){
			test.log(LogStatus.PASS, details+test.addScreenCapture("./../screenshot/"+number+".jpeg"));
			
		}else if(status.equalsIgnoreCase("fail")){
			test.log(LogStatus.FAIL, details);
		}else if(status.equalsIgnoreCase("warning")){
			test.log(LogStatus.WARNING, details);
		}else if(status.equalsIgnoreCase("info")){
			test.log(LogStatus.INFO, details);
		}
	}
	
	public abstract long TakeSnap();
		

	public void endTestCase(){
		report.endTest(test);
	}

	public void endReport(){
		report.flush();
	}
}
