//this is just to find expath and practise will be modified later accroding to framework
package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sudheer_EmpMgnt_BrnOperator {

	 static WebDriver driver;
	public static void main(String[] args) throws Exception {
			
		By ABOpfullname =By.xpath("//input[@id='o_name']");
		By ABOpmobnowtsp =By.xpath("//input[@id='o_mobile_no_w']");
		By ABOpemail =By.xpath("//input[@id='o_email']");
		By ABOpAltno =By.xpath("//input[@id='o_mobile_no']");
		By ABOpAadharTB =By.xpath("//input[@id='o_aadhar_no']");
		By ABOpAadharupload= By.xpath("//input[@id='o_aadhar_image']");
		By ABOpAddTB =By.xpath("//textarea[@id='o_address']");
		
		By ABOpSubmitbtn =By.xpath("//button[contains(text(),'Submit')]");
		By ABOpResetbtn =By.xpath("//button[contains(text(),'Reset')]");
		
		By ABOTprevbtn =By.xpath("//li[@id='datatable_previous']");
		By ABOTnextbtn =By.xpath("//li[@id='datatable_next']");
		
		By ABOTfilterDW =By.xpath("//select[@name='datatable_length']");
		
		By ABOTSearchTB =By.xpath("//input[@class='form-control form-control-sm' and @type='search']");
		
	
		//drirectUrl:http://183.82.103.248:8083/operator
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		//driver.get("http://183.82.103.248:8083/employee");
		
		
		
		
		
	}

	
	
	
	/*
		public static void highlight(WebElement element) 
		  {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		  }
    */
	
	
}
