package execution;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericMethods.ExtentReport;
import pages.Sudheer_EmpMgnt_BDriver;

public class Exe_Emp_MgntBDriver extends Sudheer_EmpMgnt_BDriver {

//	ExtentReport extentreportobj = new ExtentReport("BusProject_pagee");//this will become name of report
//	private ExtentTest reporttestobj;
//	private String statusPassDetails, statusFailDetails, imgName;
//	boolean result;
//	SoftAssert softassertobj = new SoftAssert();
//	public static Logger log= LogManager.getLogger(Exe_Emp_MgntBDriver.class);

	
	//@BeforeClass
	@Test(priority = 1)
	public void opnbrowser() throws Exception {
		
//		reporttestobj = extentreportobj.createTest("Verify Open Browser"); // this will go into Left Tab of Extentreports
		driver=LaunchAdminurl(); //this should launch the admin url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		result = driver != null;
//		extentreportobj.logResults(result, driver, reporttestobj, "OpenBrowser", "Adminpg opened successfully", "Failed to Adminpage");

	}
	
   @Test(priority = 2)
	public void Login() throws Exception {
//	   SoftAssert sfassertref = new SoftAssert();
//	   reporttestobj = extentreportobj.createTest("Verify Login Functionalityy.."); // this will go into Left Tab of Extentreports
//	   
//			  try   {
				    LoginintoAdmin(); //this should login into website
//				    sfassertref.assertEquals(true,true);
//				    log.info("NopCommerce Login Suceesfull.");  //this lines should entered into log4j
//				   	extentreportobj.testPass(reporttestobj, "Login Suceesfull..");
//			  		}
//			  catch (Exception e) 
//				  {
//			    	extentreportobj.testfailScreenshot(driver, reporttestobj, "scrnshot", "Login is Failed");
//			    	extentreportobj.testfail(reporttestobj, "Login Failed..");
//			        softassertobj.fail(); 
//			    	//log.error("Nopcommerce Login Failed.");
//				  }	 
//			  sfassertref.assertAll();
	}
      
   @Test(priority = 3,enabled=true)
   public void dismispopup() throws Exception {
//	   reporttestobj = extentreportobj.createTest("..Dismiss Popup.."); 
//	   try {
				delay(0.3);
			   Dismisspopupp();
//				softassertobj.assertEquals(true,true);
//			   log.info("..Dismiss popp successss ..");
//			   	extentreportobj.testPass(reporttestobj, "poppp dismissed.");
//			} catch (Exception e) {
//		    	extentreportobj.testfailScreenshot(driver, reporttestobj, "lgn1", "Dismis afailed,.");
//		    	extentreportobj.testfail(reporttestobj, "dismiss failled!.");
//		        softassertobj.fail();
//		    	//log.error("Nopcommerce Login Failed.");
//			}
//	   softassertobj.assertAll(); 	
   }
   
	@Test(priority = 4)
	public void clickAddBusdriver() throws Exception {
//		  reporttestobj = extentreportobj.createTest("Navigating to Addbus from Homepage");
//		
//		  try {
			   opnEmpmgntMenu();// this should open employee mgnt page
			   delay(0.5);
			   clickAddBusDriver();
//			   softassertobj.assertTrue(true);
//			   extentreportobj.testPass(reporttestobj, "Able to  open Add Driver_info");
//		} catch (Exception e) {
//	    	extentreportobj.testfailScreenshot(driver, reporttestobj, "Scrnshot", "failed to  open busdriver info page.");
//	    	extentreportobj.testfail(reporttestobj, "ABDpage openinig failled!.");
//	        softassertobj.fail();
//		}
//		  softassertobj.assertAll();
   }
 
	@Test(priority = 5)
	public void FillABDpgdata() throws Exception {
//		  reporttestobj = extentreportobj.createTest("Adding Bus Driver data"); //creating Test module on left side of report
//		  
//		try {
			filldataAddBDriverpg();
			delay(2);
			searchdriversdata("9999999999"); //this  will search for entered data
//			 softassertobj.assertTrue(true);
//			   extentreportobj.testPass(reporttestobj, "Able to add Driver_info");
//			
//		} catch (Exception e) {
//			extentreportobj.testfailScreenshot(driver, reporttestobj, "Scrnshot", "failed to add bus driver dataa.");
//	    	extentreportobj.testfail(reporttestobj, "Driver data adding failled!.");
//	        softassertobj.fail();
//		}
//		softassertobj.assertAll();
	}
	
	
	
	
	
	
	
	
	
	@Test(priority = 30)
	public void closebroswer() {
		System.out.println("Closingg the browserr");
		// driver.quit();
		//softassertobj.assertAll();
	}
 

	
	
	
	
	
/*	
	@AfterMethod
    public void getResultAfterMethodd(ITestResult result) throws Exception 
	{
        if(result.getStatus() == ITestResult.FAILURE) {
            reporttestobj.log(Status.FAIL,result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
        	reporttestobj.log(Status.PASS, result.getTestName());
        }
        else {
        	reporttestobj.log(Status.SKIP, result.getTestName());
        }
    }

	@AfterTest
	public void endExtentreportAfterTestt()
	{
		extentreportobj.flush();		
	}

*/	
	
	
	
	
	
	
}
