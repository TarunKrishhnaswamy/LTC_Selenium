package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void reporting(){
		ExtentReports report = new ExtentReports("./reports/sample.html",false);
		ExtentTest test = report.startTest("TC001", "To perform IRCTC Sign UP");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		test.log(LogStatus.PASS, "Application should be launched", "Application is launched successfully");
		
		report.endTest(test);
		report.flush();
	}

}
