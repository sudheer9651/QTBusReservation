//this program is partially success as of 20Dec2023

package execution;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericMethods.GenericMethods;

public class Exceldatadriven  extends GenericMethods{

	
	public static void main(String[] args) throws Exception 
	{
		
		By EmpMgntsidemenu_ele = By.xpath("//span[contains(text(),'Employee Management')]");
		By AddBusDriver_ele = By.xpath("//span[contains(text(),'Add Bus Driver')]");
		By AddBramchOperator_ele = By.xpath("//span[contains(text(),'Add Branch Operator')]");
		By AddCustomerSupport_ele = By.xpath("//span[contains(text(),'Add Customer Support')]");
		
		By BuscategoryDW = By.xpath("//select[@id='bus_category']");
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
		
		By ABDpSubmitbtn =By.xpath("//button[contains(text(),'Submit')]");
		By ABDpResetbtn =By.xpath("//button[contains(text(),'Reset')]");
		
		By ABDpTPrevbtn =By.xpath("//li[@id='datatable_previous']");
		By ABDpTNxtbtn =By.xpath("//li[@id='datatable_next']");
		
		By ABDpTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
		
	
		String BuscatgryDD;
		String Driverfullname;
		String Mobilenowtsp ;
		String Emailid ;
		String AltMobno;
		String DrivingL_id ; 
		String DLUploadpath ;
		String AadharUpload ;
		String aadharno;
		String TotExp;
		String Address;
		
		
		File fileref=new File("C:\\Users\\iasud\\OneDrive\\Desktop\\BusProject rel\\BUSEmpMgntABPdata.xlsx");
		FileInputStream fis=new FileInputStream(fileref);
		XSSFWorkbook wbref=new XSSFWorkbook(fis);
		XSSFSheet sheet=wbref.getSheetAt(1);
		
		int lastRow=sheet.getLastRowNum();
		int lastColumn=sheet.getRow(0).getLastCellNum();
		System.out.println("LastRow in excel is: "+lastRow);
		System.out.println("Last Column is: "+lastColumn);
		
		for (int nr=1 ; nr<=5 ; nr++)
		{
			DataFormatter dataFormatter = new DataFormatter();
			
			BuscatgryDD = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(0)); //BuscatgryDD
			Driverfullname = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(1));
			Mobilenowtsp = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(2));
			Emailid = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(3));
			AltMobno = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(4));
			DrivingL_id = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(5));
			DLUploadpath = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(6));
			aadharno = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(7));
			AadharUpload = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(8));
			TotExp = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(9));
			Address = dataFormatter.formatCellValue(sheet.getRow(nr).getCell(10));
			
		//	System.out.println(BuscatgryDD);
		//	System.out.println(Driverfullname);
			System.out.println();
		
			
		

			
		
		
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//new implicit wait sytax
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.get("http://183.82.103.248:8083/bus/");
		
		Thread.sleep(2000);
		WebElement username_ele= driver.findElement(By.xpath("//input[@id='username']"));//enter login
		//the below lines can be directly used to highlight we need to pass webelement 
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",username_ele);

		username_ele.sendKeys("bus");
		WebElement loginpwd= driver.findElement(By.xpath("//input[@id='password']")); //enter password
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",loginpwd);
		loginpwd.sendKeys("Welcome@123");
		Thread.sleep(200);
		WebElement signinbtn = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")); // enter login button
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",signinbtn);
		signinbtn.click();
		Thread.sleep(200);
		WebElement clspopup = driver.findElement(By.xpath("//button[@class='shepherd-cancel-icon' or @aria-label='Close Tour']"));
		wait.until(ExpectedConditions.visibilityOf(clspopup));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) clspopup));
	
		 try {
				 WebElement clspopup1 = driver.findElement(By.xpath("//button[@class='shepherd-cancel-icon' or @aria-label='Close Tour']"));
				 jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",clspopup1);
					if (clspopup1.isDisplayed()) 
					{
						System.out.println("popup is displayed, will be closed shortly");	
							try {
									clspopup1.click();
								} catch (Exception e) {
									
								}
	
					} else {
						System.out.println("popup not visible");
					}
				   System.out.println("--------popup (if any) should be handled by this time------");

		 	} 
		 catch (Exception e) { }
			//System.out.println(e);
			
		 Thread.sleep(300);
		 driver.findElement(By.xpath("//span[contains(text(),'Employee Management')]")).click(); //clik on emp management
		 Thread.sleep(200);
		 driver.findElement(By.xpath("//span[contains(text(),'Add Bus Driver')]")).click();
		 Thread.sleep(200);
		 
		 WebElement submitbutton1= driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		 WebElement submitbutton2= driver.findElement(By.xpath("(//button[contains(text(),'Submit')])[last()]"));
		 
		 System.out.println("submitbutton1 isDisplayed: "+submitbutton1.isDisplayed());
		 System.out.println("submitbutton1 isEnabled: "+submitbutton1.isEnabled());
		 
		 System.out.println("submitbutton2 isDisplayed: "+submitbutton2.isDisplayed());
		 System.out.println("submitbutton2 isEnabled: "+submitbutton2.isEnabled());
		 
		Thread.sleep(1000);
		
		jsExecutor.executeScript("arguments[0].click();",submitbutton2); 

		 
		Thread.sleep(2000);
		System.out.println("Executed loop for "+ nr + " time ");
		System.out.println("closing browserrrr");
		Thread.sleep(2000);
		driver.quit();
		

		
		
	}
	
	wbref.close();

	}	

}
