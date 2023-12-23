
package pages;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sudheer_EmpMgnt_BDriver extends LandingPage_Admin {

		By EmpMgntsidemenu_ele = By.xpath("//span[contains(text(),'Employee Management')]");
		By AddBusDriver_ele = By.xpath("//span[contains(text(),'Add Bus Driver')]");
	    public By AddBramchOperator_ele = By.xpath("//span[contains(text(),'Add Branch Operator')]");
		By AddCustomerSupport_ele = By.xpath("//span[contains(text(),'Add Customer Support')]");
		
		By ABDpfullname_ele = By.xpath("//input[@id='e_name']");
		By ABDpMobieNumWts_ele = By.xpath("//input[@id='e_mobile_no_w']");
		By ABDpEmail_ele = By.xpath("//input[@id='e_email']");
		By ABDpAltMobNo_ele =By.xpath("//input[@id='e_mobile_no']");
		By ABDpDriLicid_ele = By.xpath("//input[@id='e_driving_license']");
		By ABDpAadhar_ele = By.xpath("//input[@id='e_aadhar_no']");
		By ABDpTotExp_ele = By.className("//input[@id='e_total_experience']");
		By ABDpentrAdd_ele =By.xpath("//textarea[@id='e_address']");
		By ABDpuplodDL_ele =By.xpath("//input[@id='e_driving_l_image']");
		By ABDpuplodAadhar_ele=By.xpath("//input[@id='e_aadhar_image']"); 
		By ABDpSubmitbtn =By.xpath("(//button[contains(text(),'Submit')])[last()]");
		By ABDpResetbtn =By.xpath("//button[contains(text(),'Reset')]");
		
		By ABDpTPrevbtn =By.xpath("//li[@id='datatable_previous']");
		By ABDpTNxtbtn =By.xpath("//li[@id='datatable_next']");
		
		By ABDpTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']"); //search icon
		
		By BuscategoryDW = By.xpath("//select[@id='bus_category']");


		String aBDpBuscategoryDD="1";
		String aBDpFullName="FullNameA";
		String aBDpDriverWtspNum="9999999999";
		String aBDpEmailid="abdemail1@gmail.com";
		String aBDpAltMobnumb="9899999999";
		String aBDpDlicenceid="123456789012345";
		String aBDpDLImagepath="C:\\Users\\iasud\\OneDrive\\Desktop\\BusProject rel\\dupDrivingLicence.png";
		String aBDpAadharnum="123456789012";
		String aBDpAddharimgpath="C:\\Users\\iasud\\OneDrive\\Desktop\\BusProject rel\\dupAadhar.png";
		String aBDpTotExp="1";
		String aBDpAddress="AddressA";
		
		
		
//		
// public  void getreqstringdata() throws Exception
// 	{
//		String empdatpath=".\\src\\main\\resources\\ResourcesSpreadsheets\\addEmpdata.properties";
//		Properties obj = new Properties();
//		FileInputStream fis = new FileInputStream(empdatpath);	
//		obj.load(fis);
//		
//		
//		aBDpBuscategoryDD = obj.getProperty("aBDpBuscategoryDD");
//		aBDpFullName = obj.getProperty("aBDpFullName");
//		aBDpDriverWtspNum = obj.getProperty("aBDpDriverWtspNum");
//		aBDpEmailid = obj.getProperty("aBDpEmailid");
//		aBDpAltMobnumb = obj.getProperty("aBDpAltMobnumb");
////		aBDpDlicenceid = obj.getProperty("aBDpDlicenceid");
////		 aBDpDLImagepath = obj.getProperty("aBDpDLImagepath");
////		 aBDpAadharnum = obj.getProperty("aBDpAadharnum");
////		 aBDpAddharimgpath = obj.getProperty("aBDpAddharimgpath");
////		 aBDpTotExp = obj.getProperty("aBDpTotExp");
////		 aBDpAddress = obj.getProperty("aBDpAddress");
//		
//	}
		
//		String Driverfullname =aBDpFullName;
//		String Mobilenowtsp =aBDpDriverWtspNum;
//		String Emailid = aBDpEmailid;
//		String AltMobno = aBDpAltMobnumb;
//		String DrivingL_id =aBDpDlicenceid; // here dev accepts 15 digits only
//		String DLUploadpath =aBDpDLImagepath;
//		String AadharUpload =aBDpAddharimgpath;
//		String aadharno =aBDpAadharnum;
//		String TotExp =aBDpTotExp;
//		String Address=aBDpAddress;
		
	public void opnEmpmgntMenu() 
	{
		highlight_By(EmpMgntsidemenu_ele);
		clickElement(EmpMgntsidemenu_ele);
	}
			
	public void clickAddBusDriver()
	{
		highlight_By(AddBusDriver_ele);
		clickElement(AddBusDriver_ele);
	}
	
	public void filldataAddBDriverpg() {
		delay(0.5);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		dropDownSelectIndex(BuscategoryDW,1); //bus category dropdown
		enterText(ABDpfullname_ele,aBDpFullName);//enter full name
		enterText(ABDpMobieNumWts_ele,aBDpDriverWtspNum); // enter whastapp number
		enterText(ABDpEmail_ele, aBDpEmailid); //enter emailid
		enterText(ABDpAltMobNo_ele, aBDpAltMobnumb);//enter alt mobile no
		enterText(ABDpDriLicid_ele, aBDpDlicenceid); //enter DLno
		enterText(ABDpuplodDL_ele,aBDpDLImagepath); // this code is to upload file   DL
		enterText(ABDpAadhar_ele, aBDpAadharnum);// enter aadhar no
		enterText(ABDpuplodAadhar_ele,aBDpAddharimgpath); //upload aadhar image
		delay(0.1);
		driver.findElement(By.xpath("//input[@id='e_total_experience']")).sendKeys("4");
		enterText(ABDpentrAdd_ele,aBDpAddress);  // enter Address
		delay(0.5);
		WebElement submitbutton2= driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[last()]"));
		WebDriverWait ewaait = new WebDriverWait(driver, Duration.ofSeconds(20));
		ewaait.until(ExpectedConditions.visibilityOf(submitbutton2)); // trying explicit wait for visiblity of elemet  
		 jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",submitbutton2);
		 jsExecutor.executeScript("arguments[0].click();",submitbutton2);// click by javascript executer 
		 delay(2); 
		System.out.println("data filled into AddDriver page");

		
	}
	
	
	public void searchdriversdata(String searchtext) {
		jsscroll_intoview(ABDpTSearchTB);
		highlight_By(ABDpTSearchTB);
		enterText(ABDpTSearchTB, searchtext);
		delay(0.2);
		driver.findElement(ABDpTSearchTB).sendKeys(Keys.ENTER);
	}
	
	
}
