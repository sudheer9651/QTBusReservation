package tstGenricmethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TstNGListners2 implements ITestListener{

	public void onStart(ITestContext args) {
		System.out.println("Starts test execution........."+args.getName());
	}

	public void onFinish(ITestContext args) {
		System.out.println("finish test execution.........."+args.getName());
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Starts test.........."+arg0.getName());
	}
	
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped test.........."+arg0.getName());
	}
	
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Passed test.........."+arg0.getName());
	}
	
	public void onTestfailure(ITestResult arg0) {
		System.out.println("failed test.........."+arg0.getName());
	}
	 
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}
}
