package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testComponent.BaseClass;

public class Listeners extends BaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("Method started");
	
	}
@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("Method sucess");
	
}

@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("Method Fail");
	}
@Override
public void onFinish(ITestContext context) {
	System.out.println("Method Finish");
	
}

}
