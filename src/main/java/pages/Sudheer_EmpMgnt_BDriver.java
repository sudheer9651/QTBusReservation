//this is just to find expath and practise will be modified later accroding to framework
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sudheer_EmpMgnt_BDriver {

	 static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		
		By AddBusDriver_ele = By.xpath("//span[contains(text(),'Add Bus Driver')]");
		By AddBramchOperator_ele = By.xpath("//span[contains(text(),'Add Branch Operator')]");
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
		
		By ABDpSubmitbtn =By.xpath("//button[contains(text(),'Submit')]");
		By ABDpResetbtn =By.xpath("//button[contains(text(),'Reset')]");
		
		By ABDpTPrevbtn =By.xpath("//li[@id='datatable_previous']");
		By ABDpTNxtbtn =By.xpath("//li[@id='datatable_next']");
		
		By ABDpTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
		
		
	
		//direct_EmpMgmnt_url:http://183.82.103.248:8083/employee
		//Sudheer_EmpMgnt clsobj = new Sudheer_EmpMgnt();
	  
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		//driver.get("http://183.82.103.248:8083/employee");
		driver.get("https://github.com/");
		WebElement ele =driver.findElement(By.xpath(" "));
		
	
		
		
		
		
	}

	
	public static void highlight(WebElement element) 
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}
			
	
	
}
