package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BrowserInvoke.Browser;

public class Vinay_Bus_Management1 extends Browser { 
	
	public By username = By.xpath("//input[@id='username']");
	
	public By password = By.xpath("//input[@id='password']");
	
	public By signin = By.xpath("//button[@type='submit']");
	
	public By Busmanagement = By.xpath("//span[text()='Bus Management ']");
	
	public By Buscategory = By.xpath("//select[@id='bus_category']");
	
	public By BusRegistrationNumber = By.xpath("//input[@id='bus_reg_no']");
	
	public By BusServiceNumber = By.xpath("//input[@id='bus_service_no']");
	
	public By BusType = By.xpath("//select[@id='bus_type']");
	
	public By SeatingType = By.xpath("//select[@id='seating_type']");
	
	public By NumberOfSleeper = By.xpath("//input[@id='no_of_sleeper']");
	
	public By NumberOfSemiSleeper = By.xpath("//input[@id='no_of_semi_sleeper']");
	
	public By SeatingCapacity = By.xpath("//input[@id='seating_capacity']");
	
	public By Amenities = By.xpath("//select[@id='amenities']");
	
	public By Submit = By.xpath("//form[@action='/add_bus_management/']//div[5]//button[1]");
	
	public void signIn() throws Exception

    {
         lunchUrl();
         enterText(username, "bus");
         enterText(password, "Welcome@123");
         clickElement(signin);
         WebElement Busmanagementele = driver.findElement(By.xpath("//span[text()='Bus Management ']"));         
         highlight(Busmanagementele);
         delay(2);
         clickElement(Busmanagement);
         delay(2);
         dropDownSelectIndex(Buscategory,(2));
         delay(2);
         enterText(BusRegistrationNumber, "TS 77 RR 4242");
         delay(2);
         enterText(BusServiceNumber, "5000");
         dropDownSelectIndex(BusType,(1));
         delay(2);
         dropDownSelectIndex(SeatingType,(2));
         delay(2);
         enterText(NumberOfSleeper, "10");
         delay(2);
         enterText(NumberOfSemiSleeper, "10");
         delay(2);
         enterText(SeatingCapacity, "80");
         delay(2);
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 500)");     
        
         dropDownSelectIndex(Amenities,(2));
         delay(2);
         
         WebElement Submitele = driver.findElement(By.xpath("//form[@action='/add_bus_management/']//div[5]//button[1]"));         
         highlight(Submitele);
         delay(2);
         clickElement(Submit);
         js.executeScript("window.scrollBy(0, 200)");   
         
         delay(2);
         driver.quit();
         
    }
}



