package tstGenricmethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TstNGListners2 implements ITestListener{

	// this will be executed before starting of any test related
	public void onStart(ITestContext args) {
		System.out.println("Starts test executionn........."+args.getName());
	}

	// this will be executed after finisheing all tests
	public void onFinish(ITestContext args) {
		System.out.println("finish test executionn.........."+args.getName());
	}

	// this will be executed before starting of every @test
	public void onTestStart(ITestResult arg0) {
		System.out.println("Starts testt.........."+arg0.getName());
	}
	
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped testt.........."+arg0.getName());
	}
	
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Passed testt.........."+arg0.getName());
	}
	
	public void onTestfailure(ITestResult arg0) {
		System.out.println("failed testt.........."+arg0.getName());
	}
	 
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		//
	}
}
