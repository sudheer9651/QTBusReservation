package tstGenricmethods;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TstNGListners extends TestListenerAdapter{

	public void onTestStart(ITestResult tr) {
		System.out.println("Testt Startedd");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Testt Successss");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Testt Failedd");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Testt Skippedd");
	}

}
