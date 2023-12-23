//this is just to find expath and practise will be modified later accroding to framework
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sudheer_EmpMgnt_BrnOperator extends LandingPage_Admin
{
	    By EmpMgntsidemenu_ele = By.xpath("//span[contains(text(),'Employee Management')]");
		public By AddBramchOperator_ele = By.xpath("//span[contains(text(),'Add Branch Operator')]");
		By ABOpBranchDW= By.xpath("//select[@id='branch']");
		By ABOpfullname =By.xpath("//input[@id='o_name']");
		By ABOpmobnowtsp =By.xpath("//input[@id='o_mobile_no_w']");
		By ABOpemail =By.xpath("//input[@id='o_email']");
		By ABOpAltno =By.xpath("//input[@id='o_mobile_no']");
		By ABOpAadharTB =By.xpath("//input[@id='o_aadhar_no']");
		By ABOpAadharupload= By.xpath("//input[@id='o_aadhar_image']");
		By ABOpAddTB =By.xpath("//textarea[@id='o_address']");
		
		
		By ABOpSubmitbtn =By.xpath("(//button[contains(text(),'Submit')])[last()]");
		// (//button[contains(text(),'Submit')])[last()] this xpath is correct and will point to submit btn
		By ABOpResetbtn =By.xpath("//button[contains(text(),'Reset')]");
		
		By ABOTprevbtn =By.xpath("//li[@id='datatable_previous']");
		By ABOTnextbtn =By.xpath("//li[@id='datatable_next']");
		
		By ABOTfilterDW =By.xpath("//select[@name='datatable_length']");
		 public By ABOTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
		
		String AadharUpload ="C:\\Users\\iasud\\OneDrive\\Desktop\\BusProject rel\\dupAadhar.png";
		
		public void opnEmpmgntMenu() 
		{
			delay(1);
			clickElement(EmpMgntsidemenu_ele);
		}
		
		public void clickAddBranchoperatortab()
		{
			delay(1);
			clickElement(AddBramchOperator_ele);
		}
		
		public void fillABranchoperatorPg()
		{
			delay(1);
			dropDownSelectIndex(ABOpBranchDW,1);//this should select brach dropdown 1st index
			delay(1);
			enterText(ABOpfullname,"BoperatFnameAA");  	//operator full name
			enterText(ABOpmobnowtsp, "9888888888");	//operator wtsp number
			enterText(ABOpemail, "branchoperatoremail1@gmail.com");	//ope email id
			enterText(ABOpAltno, "9888888887");	//ope alt numb
			enterText(ABOpAadharTB, "123456789121");	//ope aadhar numb
			enterText(ABOpAddTB, " Branch Operator address");	//ope address
			 delay(1);
				try {
					enterText(ABOpAadharupload,AadharUpload); // this code is to upload file   aadhar	
				} catch (Exception e) {
					System.out.println("failedd to uploaddd Aadhar");
				
				}	
				delay(1);
				//clickElement(ABOpSubmitbtn);// Click Submit button
			//DoubleClickelement(ABOpSubmitbtn); //Double click submit button
			jsclick_By(ABOpSubmitbtn);
			System.out.println(" submit button should be clicked  in AddBranchOperator page");
				
		}
		
		public void searchdriversdata(String searchtext) {
			jsscroll_intoview(ABOTSearchTB);
			highlight_By(ABOTSearchTB);
			enterText(ABOTSearchTB, searchtext);
			delay(0.2);
			driver.findElement(ABOTSearchTB).sendKeys(Keys.ENTER);
		}
		
}
