package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resuorces.ExtendReportsNG;
import testComponent.BaseClass;

public class Listeners extends BaseClass implements ITestListener{
	
	ExtentTest test;
	ExtentReports extend= ExtendReportsNG.getReportObject();
	ThreadLocal<ExtentTest> extendTest= new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	test = extend.createTest(result.getMethod().getMethodName());
	extendTest.set(test);
		
	System.out.println("Method started");
	
	}
@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	extendTest.get().log(Status.PASS, "Test Passed");
	System.out.println("Method sucess");
	
}

@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("Method Fail");
	}
@Override
public void onFinish(ITestContext context) {
	extend.flush();
	System.out.println("Method Finish");
	
}

}
