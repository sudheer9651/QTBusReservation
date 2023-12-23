package tmpExecutionfolder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericMethods.GenericMethods;

public class Tmp_Rajitha extends GenericMethods {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//new implicit wait sytax
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(30));//explicit wait declaration
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
		Thread.sleep(1000);
		WebElement signinbtn = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")); // enter login button
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",signinbtn);
		signinbtn.click();
		Thread.sleep(1000);
		WebElement clspopup = driver.findElement(By.xpath("//button[@class='shepherd-cancel-icon' or @aria-label='Close Tour']"));
		exwait.until(ExpectedConditions.visibilityOf(clspopup));
				 try {
				 WebElement clspopup1 = driver.findElement(By.xpath("//button[@class='shepherd-cancel-icon' or @aria-label='Close Tour']"));
				 jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",clspopup1);
					if (clspopup1.isDisplayed()) 
					{
						System.out.println("popup is displayed, will be closed shortly");	
							try {
								jsExecutor.executeScript("arguments[0].click();",clspopup1);	
								} catch (Exception e) {
									
								}
					} else {
						System.out.println("popup not visible");
					}
				   System.out.println("--------popup (if any) should be handled by this time------");

		 	} 
		 catch (Exception e) {
			}
		 Thread.sleep(1000);
		 
		 
		 WebElement Tripschedulesidemenu =driver.findElement(By.xpath("//span[normalize-space()='Trip Schedules']"));
		 jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",Tripschedulesidemenu);
		 jsExecutor.executeScript("arguments[0].click();",Tripschedulesidemenu);
		 
		 
		By TSpFROMdD = (By.xpath("//select[@id='fromAddress']"));
		 WebElement TSpFROMdd = driver.findElement(By.xpath("//select[@id='fromAddress']"));
		 Select selectdw = new Select(TSpFROMdd);
		selectdw.selectByIndex(1);
		Thread.sleep(100);
		WebElement TSpTOdd = driver.findElement(By.xpath("//select[@id='toAddress']"));
		Select selectdw2 = new Select(TSpTOdd);
		selectdw2.selectByIndex(2);
		Thread.sleep(100);
		WebElement TSpbusSno = driver.findElement(By.xpath("//select[@id='busServiceNumber']"));
		Select selectdw3 = new Select(TSpbusSno);
		selectdw3.selectByIndex(1);
		Thread.sleep(100);
		WebElement TSpbustype = driver.findElement(By.xpath("//select[@id='bus_type']"));
		Select selectdw4 = new Select(TSpbustype);
		selectdw4.selectByIndex(1);
		Thread.sleep(100);
		WebElement TSpboardingtime = driver.findElement(By.xpath("//input[@id='boardingDate']"));
		TSpboardingtime.sendKeys("23120020230500001");
		WebElement TSpdesttime = driver.findElement(By.xpath("//input[@id='destinationDate']"));
		TSpdesttime.sendKeys("25120020230500002");
		Thread.sleep(100);
		WebElement TSpseatnos = driver.findElement(By.xpath("//input[@id='seatNumbers']"));
		TSpseatnos.sendKeys("60");
		Thread.sleep(200);
		driver.findElement(By.xpath("(//input[@value='Ameerpet'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//input[@value='Madhapur'])[2]")).click();
		Thread.sleep(200);
		WebElement submitbtn = driver.findElement(By.xpath("(//button[normalize-space()='Submit'])"));
		jsExecutor.executeScript("arguments[0].click();",submitbtn);
		Thread.sleep(300);
		
		// jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')",TSpFROM);
		// jsExecutor.executeScript("arguments[0].click();",addcustsprt);

		
	}
	
	
}
