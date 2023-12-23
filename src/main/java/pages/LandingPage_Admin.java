package pages;


import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.LaunchBrowser_Adminurl;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage_Admin extends LaunchBrowser_Adminurl

{
		By loginpgUsernameTb = By.xpath("//input[@id='username']");
		By loginpgpwdTb= By.xpath("//input[@id='password']");
		By loginpgSigninbtn = By.xpath("//button[contains(text(),'Sign In')]");
	
		public WebDriver LaunchAdminurl() throws Exception
			{
				Properties obj = new Properties();
				FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\ResourcesSpreadsheets\\config.properties");
				obj.load(fis);
				String BrowserName = obj.getProperty("browser");
				String URL = obj.getProperty("url");
				
				if(BrowserName.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					
				}
				else if (BrowserName.equalsIgnoreCase("Edge"))
				{
					WebDriverManager.edgedriver();
					driver=new EdgeDriver();					
				}
				else if (BrowserName.equalsIgnoreCase("Firefox"))
				{
					 WebDriverManager.firefoxdriver();
					 driver=new FirefoxDriver();
				}
				driver.get(URL);
				driver.manage().window().maximize();
				
				return driver; 		
			}

		public void LoginintoAdmin() {
			
			highlight_By(loginpgUsernameTb);
			enterText(loginpgUsernameTb, "bus");
			highlight_By(loginpgpwdTb);
			enterText(loginpgpwdTb, "Welcome@123");
			delay(0.1);
			highlight_By(loginpgSigninbtn);
			clickElement(loginpgSigninbtn);
			
		}
		
		 public void Dismisspopupp() {
		System.out.println("u entered into dismisspopupp method in landningpage_Admin");	 
			 delay(2);
			// JavascriptExecutor jse = (JavascriptExecutor) driver;
			   WebDriverWait waitexpli = new WebDriverWait(driver, Duration.ofSeconds(20));
			 //  WebElement clspopup = driver.findElement(By.xpath("//button[@aria-label='Close Tour']"));
		
			   WebElement clspopup1 = driver.findElement(By.xpath("//button[@class='shepherd-cancel-icon' or @aria-label='Close Tour']"));
			   System.out.println("closepopup ele is displayed: "+ clspopup1.isDisplayed());
			   System.out.println("closepopup ele is displayed: "+ clspopup1.isEnabled());
			   waitexpli.until(ExpectedConditions.visibilityOf(clspopup1));

				 try 
				 {
						if (clspopup1.isDisplayed()) 
						  {
							System.out.println("popup is displayed, will be closed shortly");	
								try {
									   highlightwBG(clspopup1);
									   delay(0.2);
									jsclick_Wele(clspopup1);
									//clspopup1.click();
									} catch (Exception e) {
										
									}
		
						  } else {
							System.out.println("popup not visible");
						          }
					   System.out.println("--------popup (if any) should be handled by this time------");

			 	 } 
			 catch (Exception e) {
				//System.out.println(e);}
				 
}
		 }		 
}
