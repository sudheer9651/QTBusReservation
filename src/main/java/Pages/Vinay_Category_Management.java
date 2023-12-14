package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import BrowserInvoke.Browser;

public class Vinay_Category_Management extends Browser{
	
    public By username = By.xpath("//input[@id='username']");
	
	public By password = By.xpath("//input[@id='password']");
	
	public By signin = By.xpath("//button[@type='submit']");
	
	public By CategoryManagement = By.xpath("//span[text()='Category Management ']");
	
	public By BusCategory = By.xpath("(//div[@class='card animated-card']//div)[1]");
	
	public By BusCategory1 = By.xpath("//input[@id='bus_category']");
	
	public By Submit1 = By.xpath("//form[@action='/add_bus_category/']//div[2]//button[1]");
	
	public By CategoryManagement1 = By.xpath("//a[text()='Category Management']");
	
	public By BusType = By.xpath("(//div[@class='card animated-card']//div)[4]");
	
	public By BusType1 = By.xpath("//input[@id='bus_type']");
	
	public By Submit2 = By.xpath("//form[@action='/add_bus_type/']//div[2]//button[1]");
	
	//public By Reset2 = By.xpath("(//button[text()='Reset'])[3]");
	
	public By Amenities = By.xpath("(//div[@class='card-body'])[3]");
	
	public By Amenities1 = By.xpath("//input[@id='amenities']");
	
	public By Submit3 = By.xpath("//form[@action='/add_am/']//div[2]//button[1]");
	
	//public By Reset3 = By.xpath("//form[@action='/add_am/']//div[2]//button[2]");
	
    public By Seatingtype = By.xpath("(//div[@class='card-body'])[4]");
	
	public By Seatingtype1 = By.xpath("//input[@id='seating_type']");
	
	public By Submit4 = By.xpath("//form[@action=\"/add_s_type/\"]//div[2]//button[1]");
	
	//public By Reset4 = By.xpath("//form[@action='/add_s_type/']//div[2]//button[2]");
	
	public By Servicetype = By.xpath("(//div[@class='card-body'])[5]");
	
	public By Servicetype1 = By.xpath("//input[@id='service_type']");
	
    public By Submit5 = By.xpath("//form[@action='/add_ser_type/']//div[2]//button[1]");
	
	//public By Reset5 = By.xpath("//form[@action='/add_ser_type/']//div[2]//button[2]");
	
    public By Branches = By.xpath("(//div[@class='card-body'])[6]");
    
    public By Branches1 = By.xpath("//input[@id='branch']");
    
    public By Submit6 = By.xpath("//form[@action='/add_branch/']//div[2]//button[1]");
	
	//public By Reset6 = By.xpath("//form[@action='/add_branch/']//div[2]//button[2]");
	
    
    
	
	public void adminCategoryManagement() throws Exception

    {
         lunchUrl();
         enterText(username, "bus");
         enterText(password, "Welcome@123");
         clickElement(signin);
         WebElement CategoryManagementele = driver.findElement(By.xpath("//span[text()='Category Management ']"));         
         highlight(CategoryManagementele);
         delay(2);
         clickElement(CategoryManagement);
         delay(2);
         
         WebElement BusCategoryele = driver.findElement(By.xpath("(//div[@class='card animated-card']//div)[1]"));         
         highlight(BusCategoryele);
         delay(2);
         clickElement(BusCategory);
         WebElement BusCategory1ele = driver.findElement(By.xpath("//input[@id='bus_category']"));         
         highlight(BusCategory1ele);
         delay(2);
         enterText(BusCategory1, "Express");
         WebElement Submit1ele = driver.findElement(By.xpath("//form[@action='/add_bus_category/']//div[2]//button[1]"));         
         highlight(Submit1ele);
         delay(2);
         //clickElement(Submit1);
         //delay(2);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         WebElement CategoryManagement1ele = driver.findElement(By.xpath("//a[text()='Category Management']"));         
         highlight(CategoryManagement1ele);
         delay(2);
         clickElement(CategoryManagement1);
         WebElement BusTypeele = driver.findElement(By.xpath("(//div[@class='card animated-card']//div)[4]"));         
         highlight(BusTypeele);
         delay(2);
         clickElement(BusType);
         WebElement BusType1ele = driver.findElement(By.xpath("//input[@id='bus_type']"));         
         highlight(BusType1ele);
         delay(2);
         enterText(BusType1, "deluxe");
         WebElement Submit2ele = driver.findElement(By.xpath("//form[@action='/add_bus_type/']//div[2]//button[1]"));         
         highlight(Submit2ele);
         delay(2);
         //clickElement(Submit2);
         //delay(2);
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         WebElement CategoryManagement2ele = driver.findElement(By.xpath("//a[text()='Category Management']"));         
         highlight(CategoryManagement2ele);
         delay(2);
         clickElement(CategoryManagement1);
         WebElement Amenitiesele = driver.findElement(By.xpath("(//div[@class='card-body'])[3]"));         
         highlight(Amenitiesele);
         delay(2);
         clickElement(Amenities);
         WebElement Amenities1ele = driver.findElement(By.xpath("//input[@id='amenities']"));         
         highlight(Amenities1ele);
         delay(2);
         enterText(Amenities1, "waterbottle");
         WebElement Submit3ele = driver.findElement(By.xpath("//form[@action='/add_am/']//div[2]//button[1]"));         
         highlight(Submit3ele);
         delay(2);
         //clickElement(Submit3);
         //delay(2);
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         WebElement CategoryManagement3ele = driver.findElement(By.xpath("//a[text()='Category Management']"));         
         highlight(CategoryManagement3ele);
         delay(2);
         clickElement(CategoryManagement1);     
         
         WebElement Seatingtypeele = driver.findElement(By.xpath("(//div[@class='card-body'])[4]"));         
         highlight(Seatingtypeele);
         delay(2);
         clickElement(Seatingtype);
         WebElement Seatingtype1ele = driver.findElement(By.xpath("//input[@id='seating_type']"));         
         highlight(Seatingtype1ele);
         delay(2);
         enterText(Seatingtype1, "sleepr");
         WebElement Submit4ele = driver.findElement(By.xpath("//form[@action=\"/add_s_type/\"]//div[2]//button[1]"));         
         highlight(Submit4ele);
         delay(2);
        // clickElement(Submit4);
        //delay(2);
         
     //    JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         WebElement CategoryManagement4ele = driver.findElement(By.xpath("//a[text()='Category Management']"));         
         highlight(CategoryManagement4ele);
         delay(2);
         clickElement(CategoryManagement1); 
         
         WebElement Servicetypeele = driver.findElement(By.xpath("(//div[@class='card-body'])[5]"));         
         highlight(Servicetypeele);
         delay(2);
         clickElement(Servicetype);
         WebElement Servicetype1ele = driver.findElement(By.xpath("//input[@id='service_type']"));         
         highlight(Servicetype1ele);
         delay(2);
         enterText(Servicetype1, "Nonstop");
         WebElement Submit5ele = driver.findElement(By.xpath("//form[@action='/add_ser_type/']//div[2]//button[1]"));         
         highlight(Submit5ele);
         delay(2);
        // clickElement(Submit5);
        //delay(2);
         
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         WebElement CategoryManagement5ele = driver.findElement(By.xpath("//a[text()='Category Management']"));         
         highlight(CategoryManagement5ele);
         delay(2);
         clickElement(CategoryManagement1); 
         
         WebElement Branchesele = driver.findElement(By.xpath("(//div[@class='card-body'])[6]"));         
         highlight(Branchesele);
         delay(2);
         clickElement(Branches);
         WebElement Branches1ele = driver.findElement(By.xpath("//input[@id='branch']"));         
         highlight(Branches1ele);
         delay(2);
         enterText(Branches1, "Vizag");
         WebElement Submit6ele = driver.findElement(By.xpath("//form[@action='/add_branch/']//div[2]//button[1]"));         
         highlight(Submit6ele);
         delay(2);
        // clickElement(Submit6);
        //delay(2);
         
         js.executeScript("window.scrollBy(0, 500)");  
         delay(2);
         js.executeScript("window.scrollBy(0, -500)"); 
         delay(2);
         
         driver.quit();
    }
  }
